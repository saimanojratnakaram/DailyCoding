
// A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

// Given the root to a binary tree, count the number of unival subtrees.

// For example, the following tree has 5 unival subtrees:


//    0
//   / \
//  1   0
//     / \
//    1   0
//   / \
//  1   1




package Dailycoding;

class Node{
    int value;
    Node left,right;
    public Node(int item){
        value=item;
        left=right=null;
    }

}
public class Problem8 {


}

class BinaryTree {
    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(0);
        tree.root.left = new Node(1);
        tree.root.right = new Node(0);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(0);
        tree.root.right.left.left = new Node(1);
        tree.root.right.left.right = new Node(1);

       int result= count_unival(tree.root);
        System.out.println(result);

    }

    static boolean is_unival(Node root){
        if(root==null){
            return true;
        }
        if(root.left!=null && root.left.value!= root.value){
            return false;
        }
        if(root.right!=null && root.right.value!= root.value){
            return false;
        }
        if(is_unival(root.left) && is_unival(root.right)){
            return true;
        }
        return false;

    }
    static int count_unival(Node root){
        int total;
        if(root==null){
            return 0;
        }
        total=count_unival(root.left)+count_unival(root.right);
        if(is_unival(root)){
            total++;
        }
        return total;
    }
}

