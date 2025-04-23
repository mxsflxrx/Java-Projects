public class testing {
    private int[] data;
    private int front;
    private int rear;

    public testing(int size) {
        data = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == data.length - 1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        if (isEmpty()) {
            front++;
        }
        rear++;
        data[rear] = item;
    }

    public int poll() {
        if (isEmpty()) {
            return null;
        }
        int head = peek();
        front++;
        if (front > rear) {
            front = rear = -1;
        }
        return head;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return data[front];
    }
}
