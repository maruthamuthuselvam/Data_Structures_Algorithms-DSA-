public class linkedlist {
  node head;
  node tail;
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    void insertatbegin(int data){
        node newnode = new node(data);
        if(head == null ){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
 void printlist(){
        node temp= head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
 }
 void insert(int data){
        node newnode =new node(data);
        tail.next=newnode;
        tail=newnode;
    }
void deleteatbegin(){
        head=head.next;
}
void  deleteatlast(){
        node temp=head;
        if(temp.next==null){
            head=null;
        }
        else {
            while (temp != null) {
                if (temp.next.next == null) {
                    temp.next = null;
                    tail = temp;
                }
                temp = temp.next;
            }
        }
}

}
