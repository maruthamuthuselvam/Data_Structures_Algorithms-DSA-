package BinaryTree;

import java.util.*;

public class BinarySearchTree {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(){

        }
        Node(int val){
            data = val;
            left = null;
            right = null;
        }
    }
    BinarySearchTree(int val){
        root = new Node(val);
    }
    BinarySearchTree(){
        root = null;
    }
    public void insert(int val){
        insert(root, val);
    }
    public Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(root.data > val){
          root.left = insert(root.left, val);
        }
        else{
          root.right =  insert(root.right, val);
        }
        return root;
    }
   public Node search(Node root, int val){
        if( root == null || root.data == val ){
            return root;
        }

        if(root.data > val){
          return search(root.left, val);
        }
        return search(root.right, val);
    }
    void in_Order(Node root){
        if(root != null){
            in_Order(root.left);
            System.out.print(root.data +" -> ");
            in_Order(root.right);
        }
    }
    void deleteTreeNode(int val){
        deleteTreeNode(val, root);
    }
    Node deleteTreeNode(int val,Node root){
        if(root == null){
            return root;
        }
        if(val > root.data){
           root.right = deleteTreeNode(val, root.right);
        }
        else if(val < root.data){
          root.left = deleteTreeNode(val, root.left);
        }
        else{
            if(root.right == null){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }
        root.data = min(root.right);
         root.right = deleteTreeNode(root.data, root.right);
        }
        return root;
    }
    int min(Node root){
        if(root.left == null){
            return root.data;
        }

       return min(root.left);
    }

    Node sortArraytoBST(int[] arr,int s,int end){
        if(arr.length <= 3){

            if(arr.length == 3) {
                int mid = arr.length / 2;
                root.data = arr[mid];
                root.right.data = arr[2];
                root.left.data = arr[0];
            }
            else if(arr.length == 2){
                root.data = arr[1];
                root.left.data = arr[0];
            }
            else{
                root.data = arr[0];
            }
            return root;
        }
        int mid = end / 2;
        root.left = sortArraytoBST(Arrays.copyOfRange(arr, s, mid),s,mid - 1);
        root.right = sortArraytoBST(Arrays.copyOfRange(arr, mid, arr.length),mid + 1,arr.length);
        return root;
    }
    List<List<Integer>> BFS(Node root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> inner = new ArrayList<>();
            Node newNode = new Node();
            for(int i = 0; i < levelSize;i++){
                newNode = queue.poll();
                inner.add(newNode.data);
                if(newNode.left != null){
                    queue.offer(newNode.left);
                }
                if(newNode.right != null){
                    queue.offer(newNode.right);
                }
            }
            res.add(inner);
        }
        return res;
    }
    List<Double> findLevelAvg(Node root) {
        List<Double> result = new ArrayList<>();
        double sum = 0;
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int treeLevel = queue.size();
            if (treeLevel == 1) {
                result.add((double) root.data);
                if (root.left != null) {
                    queue.offer(root.left);
                }
                if (root.right != null) {
                    queue.offer(root.right);
                }
                queue.poll();
                continue;
            } else {
                for (int i = 0; i < treeLevel; i++) {
                    Node newNode = queue.poll();
                    sum += newNode.data;
                    if (newNode.left != null) {
                        queue.offer(newNode.left);
                    }
                    if (newNode.right != null) {
                        queue.offer(newNode.right);
                    }
                }
            }
            sum = sum / treeLevel;
            result.add(sum);
            sum = 0;
        }
        return result;
    }
    Node findSuccessor(Node root, int val){
        if(root == null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int treeLevel = queue.size();
            for(int i = 0; i < treeLevel;i++) {
                Node newNode = queue.poll();
                if (newNode.left != null) {
                    queue.offer(newNode.left);
                }
                if (newNode.right != null) {
                    queue.offer(newNode.right);
                }
                if (newNode.data == val) {
                    return queue.poll();
                }
            }
        }
        return null;
    }
    int sum;
    int sumofNode(Node root){
        if(root == null) {
            return sum;
        }
            sum += root.data;
            sumofNode(root.left);
            sumofNode(root.right);
            return sum;
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(50);
        tree.insert(20);
       tree.insert(70);
        tree.insert(10);
        tree.insert(25);
        tree.insert(60);
        tree.insert(90);
       tree.insert(80);
        tree.insert(75);
        //System.out.println(tree.findLevelAvg(tree.root));
        //System.out.println((tree.findSuccessor(tree.root, 70)).data);
         //System.out.println(tree.sumofNode(tree.root));
       // System.out.println(tree.sumofNode(tree.root.right));
        //tree.in_Order(tree.root);
        //System.out.println(tree.BFS(tree.root));
        //tree.sortArraytoBST(arr, 0, arr.length);
       // System.out.println("End");
        tree.deleteTreeNode(80);
        tree.in_Order(tree.root);
    }
}
