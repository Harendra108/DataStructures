package practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        /*
                1
               2  3
              4 5 6 7
         */

        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Level Order traversal of binary tree is :");
        tree.reverseLevelOrder(tree.root);

    }

    private void reverseLevelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node currentNode = q.poll();
            System.out.println(currentNode.data);
            if(currentNode.right != null) {
                q.add(currentNode.right);
            }
            if(currentNode.left != null) {
                q.add(currentNode.left);
            }
        }
    }
}
