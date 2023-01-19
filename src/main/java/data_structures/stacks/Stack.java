package data_structures.stacks;

public class Stack {
    class Node {
        int value;
        Node next;

        Node (int value) {
            this.value = value;
        }
    }

    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


}
