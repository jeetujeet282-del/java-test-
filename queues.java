public class queues {

    static class queue{
        static int rear;
        static int front ;
        static int size;
         static int arr[];

        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;

        }

        public static Boolean isEmpty(){
            return (rear==-1 && front==-1);
        }

        public static Boolean isFull(){
            return ((rear+1)%size ==front);
        }


        public static void add(int data){
            if(isFull()){
                System.out.println(" queue is full ");
                return;
            }

            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }

        public static int remove(){

            if(isEmpty()){
                System.out.println("nothing to remove");
                return -1;
            }

            int val=arr[front];
            


        }
    }
    
    public static void main(String args[]){

    }
    
}
