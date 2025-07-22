package Day2_Stack_Queues;

import java.util.Stack;

class QueueUsingStacks<T> {
    private Stack<T> stackEnqueue = new Stack<>();
    private Stack<T> stackDequeue = new Stack<>();

    
    public void enqueue(T data) {
        stackEnqueue.push(data);
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        shiftStacks();
        return stackDequeue.pop();
    }
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        shiftStacks();
        return stackDequeue.peek();
    }

    
    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }

    
    private void shiftStacks() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
    }
}

public class QueueByStack{
    public static void main(String[] args) {
        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front: " + queue.peek());      

        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue()); 

        System.out.println("Is Empty: " + queue.isEmpty()); 
    }
}

