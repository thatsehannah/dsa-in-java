package data_structures.doubly_linked_lists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(8);
        myDLL.append(9);
        myDLL.append(10);
        myDLL.append(11);
        myDLL.append(12);
        myDLL.printList();

        myDLL.set(4, 100);
        myDLL.printList();

    }
}
