package data_structures.linked_lists;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.printList();

        myLinkedList.reverse();

        myLinkedList.printList();
    }
}
