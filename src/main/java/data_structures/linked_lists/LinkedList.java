package data_structures.linked_lists;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            next = null;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    // adding Node to end of linked list
    // O(1)
    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        length++;
    }

    // adding Node to front of linked list
    // O(1)
    public void prepend(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    // removing the last Node in linked list
    // O(n)
    public Node removeLast() {
        if (length == 0) { // for when we start with a length of 0
            return null;
        }

        Node temp = head;
        Node prev = head;

        while (temp.next != null) { // if we have 2 or more items in a list
            prev = temp;
            temp = temp.next;
        }

        tail = prev;
        tail.next = null;
        length--;

        if (length == 0) { // edge case if there is only one item in the list after removal
            head = null;
            tail = null;
        }

        return temp;
    }

    // removing the first Node in linked list
    // O(1)
    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;

        if (length == 0) { // edge case if there is only one item in the list after removal
            tail = null;
        }

        return temp;
    }

    // get a Node at a particular index
    // O(n)
    public Node get (int index) {
        if (index < 0 || index >= length) { // index out of range
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // set the value of a Node at a particular index
    // O(n)
    public boolean set(int index, int value) {
        Node temp = get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }

    // insert a Node at a particular index
    // O(n)
    public boolean insert(int index, int value) {
        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        if (index < 0 || index > length) {
            return false;
        }

        Node temp = get(index - 1); // gets the Node before the index of the Node where we want to insert
        Node newNode = new Node(value);

        newNode.next = temp.next;
        temp.next = newNode;
        length++;

        return true;
    }

    // remove a node at a particular index
    // O(n)
    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == (length - 1)) {
            return removeLast();
        }

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    // reverse a linked list in place
    // O(n)
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
