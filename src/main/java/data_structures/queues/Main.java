package data_structures.queues;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);
        myQueue.printQueue();

        myQueue.dequeue();
        myQueue.printQueue();

        myQueue.dequeue();
        myQueue.printQueue();

        myQueue.dequeue();
        myQueue.printQueue();
    }
}
