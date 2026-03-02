package LinkedList;

public class LinkedList {
    Node head;
  class Node {
      int data;
      Node next;

      Node(int val) {
          data = val;
          next = null;
      }
  }
  LinkedList(){
      head = null;
  }
  void addAtBeginning(int val){
      Node node = new Node(val);
      if(head != null){
          node.next = head;
          head = node;
      }
      else {
          head = node;
      }
  }
  void insertAtEnd(int data){
      Node node = new Node(data);
      Node temp = head;
      while(temp.next != null){
          temp = temp.next;
      }
      temp.next = node;
  }
  void insertAtPosition(int pos, int data){
      if(pos == 0){
          addAtBeginning(data);
          return;
      }
      Node node = new Node(data);
      Node temp = head;
      for(int i = 1; i < pos; i++){
          temp = temp.next;
      }
      node.next = temp.next;
      temp.next = node;
  }
  void updateNodeValue(int pos,int value){
      Node temp = head;
      for(int i = 0; i < pos;i++){
          temp = temp.next;
      }
      temp.data = value;
  }
    void readNodeValue(int pos){
        Node temp = head;
        for(int i = 0; i < pos;i++){
            temp = temp.next;
        }
        System.out.println("the element in position "+pos+" is : "+temp.data);
    }
  void traversal(){
      Node temp = head;
      while(temp != null){
          System.out.println(temp.data);
          temp = temp.next;
      }
  }
  void commonDivisor(){
      Node temp = head;
      while(temp.next != null){
          Node temp1 = temp.next;
          int res = calculateHCF(temp.data, temp1.data);
          Node node = new Node(res);
          Node temp2 = temp;
          node.next = temp.next;
          temp = temp.next;
          temp2.next = node;
      }
  }
  void reverseList(){
      Node prev = null;
      Node current = head;
      Node next = head;
      while(current != null){
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
      }
    head = prev;
      traversal();
  }
  int calculateHCF(int a, int b){
      if (b == 0) {
          return a;
      } else {
          return calculateHCF(b, a % b);
      }
  }

}

