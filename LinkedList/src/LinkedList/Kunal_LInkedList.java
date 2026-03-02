package LinkedList;


public class Kunal_LInkedList {
    Node head;
    Node tail;
    int size;

    Kunal_LInkedList(){
        head = null;
        tail = null;
        size += 1;
    }
  static private class Node{
        int data;
        Node next;
        Node(){

        }
        Node(int data){
            this.data = data;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    boolean checkPalindrome(){
        int i = 0;
        Node start = head;
        Node end = get(size - i);
        while(i < size / 2){
            if(start.data != end.data){
                return false;
            }
            i++;
            start = start.next;
            end = get(size - i);
        }
        return start.data == end.data;
    }
    int findlengthofCycle(){
        Node slow = head;
        Node fast = head;
        int len = 1;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                slow = slow.next;
                while(slow != fast){
                    len++;
                    slow = slow.next;
                }
                break;
            }
        }
        return len;
    }
    void createCycle(){
        tail.next = get(2);
    }
    int findTheNodeWhereCycleStarts(){
        int cyclelen = findlengthofCycle();
        int startofcycle = size - cyclelen;
        Node temp = head;
        for(int i = 0; i < startofcycle;++i){
            temp = temp.next;
        }
        return temp.data;
    }
    void insertAtBeginning(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = head;
            return;
        }
        node.next = head;
        head = node;
        ++size;
    }
    void insertAtEnd(int val){
        if(head == null){
            insertAtBeginning(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    void insertAtPosition(int index, int val){
        if(size <= 1){
            insertAtBeginning(val);
            return;
        }
        if(index > size){
            throw new IndexOutOfBoundsException(index+ "th index doesn't exist. List size is only "+size);
        }
        if(size == index){
            insertAtEnd(val);
            return;
        }
        Node prev = get(index);
        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
        size++;
    }
     Node get(int index){
        Node node = head;
        for(int i = 1;i < index; i++){
            node = node.next;
        }
        return node;
    }
    void insertval(int val, int index){
        head = insertUsingRec(val , index, head);
    }
    Node insertUsingRec(int val, int index, Node node){
        if(index == 0){
            Node newNode = new Node(val);
            newNode.next = node;
            return newNode;
        }
        node.next = insertUsingRec(val, index - 1, node);
        return node;
    }
    void removeDuplicates() {
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                   temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
    }
    void removeEntireDuplicate(){
        Node prev = head;
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                prev = temp.next.next;
                //temp.next = temp.next.next;
                temp = temp.next.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
    }

    void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
}
