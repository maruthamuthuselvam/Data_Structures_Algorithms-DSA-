package Custom_Stack;

public class Custom_Queue {

    static final int Max_Size = 10;
    int data[];
    int front;
    int rear;
    Custom_Queue(){
        this.data = new int[Max_Size];
        front = -1;
        rear = -1;
    }
    Custom_Queue(int size){
        this.data = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int num) throws Exception{
        if(front == -1){
            front = 0;
        }
        if(rear == data.length - 1){
            throw new Exception("queue is full");
        }
        data[++rear] = num;
    }
    int deque() throws Exception{
        if(rear == -1){
            throw new Exception("Queue is empty");
        }
        int val = data[front];
        for(int i = 0; i < rear;i++){
            data[i] = data[i + 1];
        }
        rear--;
        return val;
    }
    void display(){
        for(int i = front;i <= rear;i++){
            System.out.print(data[i] + " -> ");
        }
        System.out.println("end");
    }
    public static void main(String[] args) throws Exception{
        Custom_Queue queue = new Custom_Queue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(4);
        queue.display();
        System.out.println(queue.deque());
        queue.enqueue(5);
        queue.display();
    }
}
