package BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.InsertInLeft(tree.root, 5);
        tree.InsertInRight(tree.root, 15);
        tree.InsertInLeft(tree.root.left, 3);
        tree.InsertInRight(tree.root.left, 8);
        tree.InsertInLeft(tree.root.right, 12);
        System.out.println("Pre-order traversal");
        tree.pre_Order(tree.root);
        System.out.println("End");
        System.out.println("In-order traversal");
        tree.In_Order(tree.root);
        System.out.println("End");
        System.out.println("Post-order traversal");
        tree.post_Order(tree.root);
        System.out.println("End");
        //tree.findSum(tree.root, 7, 15);
        //System.out.println(tree.sum);
    }
}
