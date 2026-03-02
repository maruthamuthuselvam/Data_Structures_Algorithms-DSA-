package BinaryTree;

public class BinaryTree {
    Node root;
    int sum = 0;
    class Node{
        int data;
        Node left;
        Node right;

        public Node(int val){
            data = val;
            left = null;
            right = null;
        }
    }
    BinaryTree(int val){
        root = new Node(val);
    }
    void InsertInLeft(Node root, int val){
        Node newNode = new Node(val);
        root.left = newNode;
    }
    void InsertInRight(Node root, int val){
        Node newNode = new Node(val);
        root.right = newNode;
    }
    public void pre_Order(Node root){
        if(root != null){
            System.out.print(root.data+ " -> ");
            pre_Order(root.left);
            pre_Order(root.right);
        }
    }
    public void post_Order(Node root){
        if(root != null){
            post_Order(root.left);
            post_Order(root.right);
            System.out.print(root.data+ " -> ");
        }
    }
    void findSum(Node root, int low, int high){
        if(root == null){
            return;
        }

        findSum(root.left, low, high);
        if(root.data >= low && root.data <= high){
            sum += root.data;
        }
        findSum(root.right, low, high);

    }
    public void In_Order(Node root){
        if(root != null){
            In_Order(root.left);
            System.out.print(root.data+ " -> ");
            In_Order(root.right);
        }
    }

}
