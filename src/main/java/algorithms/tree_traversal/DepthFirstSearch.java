package algorithms.tree_traversal;

import data_structures.trees.BinarySearchTree;
import data_structures.trees.BinarySearchTree.Node;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DepthFirstSearch {
    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();
        myTree.insert(47);
        myTree.insert(21);
        myTree.insert(76);
        myTree.insert(18);
        myTree.insert(27);
        myTree.insert(52);
        myTree.insert(82);

        System.out.println("PreOrder DFS: " + preOrderDfs(myTree));
        System.out.println("PostOrder DFS: " + postOrderDfs(myTree));
        System.out.println("InOrder DFS: " + inOrderDfs(myTree));
    }

    static ArrayList<Integer> preOrderDfs(BinarySearchTree tree) {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                results.add(currentNode.value);

                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }

                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }

        new Traverse(tree.getRoot());
        return results;
    }

    static ArrayList<Integer> postOrderDfs(BinarySearchTree tree) {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }

                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }

                results.add(currentNode.value);
            }
        }

        new Traverse(tree.getRoot());
        return results;
    }

    static ArrayList<Integer> inOrderDfs(BinarySearchTree tree) {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }

                results.add(currentNode.value);

                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }

            }
        }

        new Traverse(tree.getRoot());
        return results;
    }
}
