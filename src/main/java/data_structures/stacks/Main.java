package data_structures.stacks;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.push(1);
        myStack.printStack();

        myStack.pop();
        myStack.printStack();
    }
}
