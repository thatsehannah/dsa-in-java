package data_structures.doubly_linked_lists;

public class DoublyLinkedList {
    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
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

    // adds a Node to the end of a doubly linked list
    // O(1)
    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;

        }
        tail = newNode;
        length++;
    }

    // adds a Node to the beginning of a doubly linked list
    // O(1)
    public void prepend(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        length++;
    }

    // removes the tail from the doubly linked list
    // O(1)
    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        Node temp = tail;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }

        length--;
        return temp;
    }

    // removes the head from the doubly linked list
    // O(1)
    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node temp = head;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }

        length--;
        return temp;
    }

    // gets a Node at a specific index in a doubly linked list
    // O(logn)
    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node temp;

        if (index < length/2) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }

        return temp;
    }

    // sets a Node's value at a specific index in doubly linked list
    // O(logn)
    public boolean set(int index, int value) {
        Node temp = get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }

    // inserts a Node a specific index in doubly linked list
    // O(logn)
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;
        after.prev = newNode;
        before.next = newNode;
        length++;

        return true;
    }

    // removes a Node a specific index in doubly linked list
    // O(logn)
    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == length - 1) {
            return removeLast();
        }

        Node temp = get(index);

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.prev = null;
        temp.next = null;
        length--;

        return temp;
    }

}
