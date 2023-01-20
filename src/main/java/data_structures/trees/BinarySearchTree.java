package data_structures.trees;

public class BinarySearchTree {
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    Node root;

    // inserts a Node into a BST
    // O(logn)
    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (temp != null) {
            if (value == temp.value) {
                return false;
            }

            if (value > temp.value) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }

                temp = temp.right;
            } else {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }

                temp = temp.left;
            }
        }

        return false;
    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else {
            currentNode.right = rInsert(currentNode.right, value);
        }

        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        rInsert(root, value);
    }

    // checks if a value exists in binary search tree
    // O(logn)
    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (value == temp.value) {
                return true;
            } else if (value < temp.value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        return false;
    }

    // recursive version of contains function
    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }

        if (currentNode.value == value) {
            return true;
        }

        if (value > currentNode.value) {
            return rContains(currentNode.right, value);
        }

        return rContains(currentNode.left, value);
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }
}
