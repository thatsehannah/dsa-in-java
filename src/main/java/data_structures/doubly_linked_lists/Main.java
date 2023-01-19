package data_structures.doubly_linked_lists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.printList();
    }
}
