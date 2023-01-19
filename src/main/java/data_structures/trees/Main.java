package data_structures.trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);
        myBST.insert(27);

        System.out.println("Does tree contain 18? " + myBST.contains(18));
        System.out.println("Does tree contain 30? " + myBST.contains(30));


    }
}
