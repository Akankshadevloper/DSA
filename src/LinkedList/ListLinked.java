package LinkedList;

public class ListLinked {

    Node head;

    private int size;
    ListLinked(){
        this.size = 0;
    }
    class Node{
       String data;
       Node next;


       Node(String data ){
           this.data = data;
           this.next = null;
           size++;
       }
    }

    // add - first , last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
          head = newNode;
          return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data ){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }
    // print
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("this lis is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // delete last
    public void deleteLast() {


        if (head == null) {
            System.out.println("this lis is empty");
            return;
        }
         size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;// head.next = null -> lastNode = null
        while(lastNode.next != null){ // null.next will through error
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }
    public int getSize(){
        return size ;
    }

    public static void main(String args[]){
       ListLinked list = new ListLinked();
       list.addFirst("a");
       list.addFirst("is");
       list.printList();

       list.addFirst("this");

       list.addLast("list");
       list.printList();

       list.deleteFirst();
       list.printList();

        list.deleteFirst();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());

    }


}
