package data_structures.trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);

        /*
        *           2
        *          / \
        *         1   3
        * */

        System.out.println("Root: " + myBST.root.value);
        System.out.println("Root->Left: " + myBST.root.left.value);
        System.out.println("Root->Right: " + myBST.root.right.value);


    }
}
