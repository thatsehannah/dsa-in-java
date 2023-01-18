package data_structures.linked_lists;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(2);
        myLinkedList.printList();

        myLinkedList.insert(1, 1);
        myLinkedList.printList();
    }
}
