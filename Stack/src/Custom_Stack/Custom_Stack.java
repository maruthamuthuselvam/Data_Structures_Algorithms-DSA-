package Custom_Stack;

public class Custom_Stack {
    static final int Max_Stack_Size = 10;
    public int[] data;
    int top;
    Custom_Stack(){
        this.data = new int[Max_Stack_Size];
        top = -1;
    }
    Custom_Stack(int size){
          this.data = new int[size];
          top = -1;
    }
    boolean push(int num){
        if(top == data.length - 1){
            throw new IndexOutOfBoundsException("stack is full");
        }
        data[++top] = num;
        return true;
    }
    int pop() throws Exception {
        if(top == -1){
            throw new Exception("stack is empty");
        }
        return data[top--];
    }
    int peek(){
        return data[top];
    }
    void display(){
        for(int i = 0;i <= top;i++){
           System.out.print(data[i] + " -> ");
        }
        System.out.println("end");
    }

    public static void main(String[] args) throws Exception{
        Custom_Stack stack = new Custom_Stack(5);
        stack.push(20);
        stack.push(3);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.display();
        stack.pop();
        stack.display();

    }

}
