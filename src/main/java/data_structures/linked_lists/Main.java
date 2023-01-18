package data_structures.linked_lists;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        System.out.println(myLinkedList.removeFirst().value);
        myLinkedList.printList();
        System.out.println(myLinkedList.removeFirst().value);
        myLinkedList.printList();
        System.out.println(myLinkedList.removeFirst());
    }
}
