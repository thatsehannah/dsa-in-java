package data_structures.linked_lists;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        System.out.println(myLinkedList.removeLast().value); // will print 2
        System.out.println(myLinkedList.removeLast().value); // will print 1
        System.out.println(myLinkedList.removeLast()); // will print null

    }
}
