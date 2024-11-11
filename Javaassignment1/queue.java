class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.exit(1);
        }

        System.out.println( arr[front]);

        front = (front + 1) % capacity;
        count--;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.exit(1);
        }

        System.out.println("Inserting " + item);
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    
    public int peek() {
        if (isEmpty()) {
            System.exit(1);
        }
        return arr[front];
    }
    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return (size() == 0);
    }
    public boolean isFull() {
        return (size() == capacity);
    }
}

public class queue{
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        q.dequeue();
        q.dequeue();

        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is: " + q.size());

        q.dequeue();
        q.dequeue();

        if (q.isEmpty()) {
            System.out.println("Queue is empty");
        } 
        else {
            System.out.println("Queue is not empty");}
        
    }
}



