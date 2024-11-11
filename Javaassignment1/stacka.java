class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.exit(1);
        }

        System.out.println("Insert" + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.exit(1);
        }
        System.out.println("Remove" + peek());
        return arr[top--];
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(1);
        }

        return -1;
    }
    public int size() {
        return top + 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
}

public class stacka{
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Top element" + stack.peek());
        stack.pop();
        stack.pop();

        System.out.println("Stack size" + stack.size());
        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}


