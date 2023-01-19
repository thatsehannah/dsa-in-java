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

    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (temp != null) {
            if (temp.value == value) {
                return false;
            }

            if (temp.value < value) {
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
}
