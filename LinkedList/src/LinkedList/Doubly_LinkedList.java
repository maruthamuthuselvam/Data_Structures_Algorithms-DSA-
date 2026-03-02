package LinkedList;

public class Doubly_LinkedList {
    Node head;
    int size;
    Doubly_LinkedList(){
        head = null;
        size += 0;
    }

    void InsertAtBeginning(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    void insertAtEnd(int val){
        if(head == null){
            InsertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = get(size);
        temp.next = newNode;
        newNode.prev = temp;
        size++;
    }
    Node get(int index){
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    void insertAtPosition(int index, int val){
        if(head == null || index == 0){
            InsertAtBeginning(val);
            return;
        }
        if(index == size){
            insertAtEnd(val);
            return;
        }
        if(index > size){
            throw new IndexOutOfBoundsException("List length is only "+size);
        }
        Node temp = get(index);
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next.prev = newNode;

    }
    void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            last = temp;
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
        while(last != null){
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    class Node{
        int data;
        Node next;
        Node prev;


        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        Doubly_LinkedList list = new Doubly_LinkedList();
        list.InsertAtBeginning(1);
        list.InsertAtBeginning(2);
        list.InsertAtBeginning(3);
        list.InsertAtBeginning(4);
        list.InsertAtBeginning(5);
        list.display();
        System.out.println(list.size);
    }
}
