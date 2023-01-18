package data_structures.linked_lists;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);

        myLinkedList.printList();
    }
}
