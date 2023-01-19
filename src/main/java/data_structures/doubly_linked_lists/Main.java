package data_structures.doubly_linked_lists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(11);
        myDLL.append(8);
        myDLL.append(9);
        myDLL.append(11);
        myDLL.append(12);
        myDLL.append(13);
        myDLL.printList();

        myDLL.insert(3, 10);
        myDLL.printList();

        myDLL.remove(3);
        myDLL.printList();

    }
}
