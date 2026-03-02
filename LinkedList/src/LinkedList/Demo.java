package LinkedList;

public class Demo {
    public static void main(String[] args) {
       /* LinkedList  list = new LinkedList();
        list.addAtBeginning(18);
        list.addAtBeginning(6);
        list.addAtBeginning(10);
        list.addAtBeginning(3);
        list.traversal();
        list.reverseList();*/
        Kunal_LInkedList list = new Kunal_LInkedList();
        Kunal_LInkedList list1 = new Kunal_LInkedList();
        list1.insertAtBeginning(5);
        list1.insertAtBeginning(4);
        list1.insertAtBeginning(3);
        list1.insertAtBeginning(2);
        list1.insertAtBeginning(1);
       // list.insertAtBeginning(5);
       // list.insertAtBeginning(4);
        list.insertAtEnd(6);
        list.insertAtBeginning(5);
        list.insertAtBeginning(4);
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.mergeList(list, list1);
        //System.out.println(list.size);
        //list.createCycle();
        //System.out.println(list.size - list.findlengthofCycle());
        //System.out.println(list.findTheNodeWhereCycleStarts());
        //System.out.println(list.checkPalindrome());
        //list.display();
       // list.readNodeValue(4);
    }
}
