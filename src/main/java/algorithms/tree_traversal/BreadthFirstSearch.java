package algorithms.tree_traversal;

import data_structures.trees.BinarySearchTree;
import data_structures.trees.BinarySearchTree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();
        myTree.insert(47);
        myTree.insert(21);
        myTree.insert(76);
        myTree.insert(18);
        myTree.insert(27);
        myTree.insert(52);
        myTree.insert(82);

        System.out.println(breadthFirstSearch(myTree));
    }

    static ArrayList<Integer> breadthFirstSearch(BinarySearchTree tree) {
        Node currentNode = tree.getRoot();
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            results.add(currentNode.value);

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }
}
