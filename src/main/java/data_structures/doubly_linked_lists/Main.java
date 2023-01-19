package data_structures.doubly_linked_lists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(8);
        myDLL.printList();

        myDLL.removeLast();
        myDLL.printList();

        myDLL.removeLast();
        myDLL.printList();

        myDLL.removeLast();
        myDLL.printList();
    }
}
