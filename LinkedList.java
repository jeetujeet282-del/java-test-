public class LinkedList{


    class Node{
        int data;
        Node next;

        Node( int data){
            this.data=data;
            this.next=null;
        }
    }

    private Node head;
    private Node tail;

    public void addList(int data){
        Node newNode= new Node( data);

        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
}

public void addIntheMiddle(int idx, int data){
    int i=0;
    Node temp=head;
    Node newNode= new Node( data);
    while(i<idx-1){
        temp=temp.next;
        i++;
        
    }
    newNode.next= temp.next;
    temp.next=newNode;


    


}
  

public void printLL(){

    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data + " " );
        temp=temp.next;


    }
    System.out.println();



}

 public int removeeFirst(){
    int val=head.data;
    head=head.next;
    return val;
    
 }
   
  public int recSearch(Node head,int i,int key){
    if(i==3){
        return -1;

    }

    int idx=recSearch(head.next, i+1, key);


     if (head.data == key) {
        return i;
    }
    
     if (idx != -1) {
        return idx;
    }

    // Otherwise, check current node
    // if (head.data == key) {
    //     return i;
    // }

    return -1;



  }



  public Node findMidNode( Node head){

    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }

    return slow;
  }

//   public Boolean checkPal( Node head){
//     Node midNode= findMidNode(head);

//     jit

//   }



 public void removeLoop(){
    Node slow=head;
    Node fast = head;
    while(fast!=null && fast.next!=null){

        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            break;
        }
     }

     slow= head;
     Node prev=null;
     while ( fast!=slow){
        prev=fast;
        fast=fast.next;
        slow=slow.next;

     }

     prev.next=null;

     

 }



 public void addfirstDl(){
    
 }



 public static void main(String args[]){
        LinkedList LL= new LinkedList();
    LL.addList(4);
    LL.addList(3);
    LL.addList(3);
    LL.addList(1);
    LL.addList(0);
    //  LL.printLL();

    // LL.addIntheMiddle(1,4);
    // LL.printLL();
    
    // System.out.println(LL.removeeFirst());

     System.out.println(LL.recSearch(LL.head,0,0));

    }





}