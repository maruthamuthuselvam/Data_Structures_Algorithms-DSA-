package BinaryTree;

import java.util.Scanner;

public class Kunal_BinaryTree {
    Node root;
    class Node{
        int data;
        Node right;
        Node left;

        Node(int val){
            data = val;
            right = null;
            left = null;
        }
    }
    Kunal_BinaryTree(int val){
        root = new Node(val);
    }
    void insertNode(Scanner scanner){
        System.out.println("enter the value for the root :");
        int val = scanner.nextInt();
        root = new Node(val);
        insertNode(scanner, root);
    }
    void insertNode(Scanner scanner,Node node){
        System.out.println("do you want to insert in left of "+ node.data);
        boolean check = scanner.nextBoolean();
        if(check){
            System.out.println("enter the value :");
            int val = scanner.nextInt();
            node.left = new Node(val);
            insertNode(scanner, node.left);
        }
        System.out.println("do you want to insert in right of "+node.data);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("enter the value :");
            int val = scanner.nextInt();
            node.right = new Node(val);
            insertNode(scanner, node.right);
        }
    }
   void insertBinarySearchTree(int val){
        insertBinarySearchTree(val, root);
   }
    Node insertBinarySearchTree(int val,Node node){
            if(node == null) {
                return new Node(val);
            }
            if(val > node.data){
               node.right = insertBinarySearchTree(val, node.right);
            }
            else{
               node.left = insertBinarySearchTree(val, node.left);
            }
            return node;
        }
    void display(Node root){
        if(root == null){
            return;
        }
        display(root.left);
        System.out.println(root.data);
        display(root.right);
    }

    public static void main(String[] args) {
        Kunal_BinaryTree tree = new Kunal_BinaryTree(20);
        Scanner scanner = new Scanner(System.in);
      /*  tree.insertBinarySearchTree(50);
        tree.insertBinarySearchTree(30);
        tree.insertBinarySearchTree(10);
        tree.insertBinarySearchTree(20);
        tree.insertBinarySearchTree(70);
        tree.insertBinarySearchTree(90);
        tree.insertBinarySearchTree(60);*/
        tree.insertNode(scanner);
        tree.display(tree.root);
    }
}
