import java.util.Arrays;
import java.util.Stack;

public class stack {
//     public static void pushBottom( Stack<Integer> s,int key){

//         if(s.size()==0){
//             s.push(key);
//             return;

//         }

//         int n=s.pop();
//         pushBottom(s,key);
//         s.push(n);
//     }


//     public static void reverseString(Stack<String> str){
//         if(str.size()==0){
//             return ;
//         }

//          String s =str.pop();
//          reverseString(str);
//          str.push(s);



//     }


//     public static void nextGreater( int arr[]){
//         int greaterNext[]= new int [arr.length];
//         Stack<Integer> s= new Stack<>();

//         for(int i=arr.length-1;i>=0;i--){
//             int curr=arr[i];

//             while(!s.empty() && curr> arr[s.peek()]){

//                 s.pop();

//             }

//             if(s.empty()){
//                 greaterNext[i]=-1;
//             }
//             else{

//                 greaterNext[i]=arr[s.peek()];
//             }

//             s.push(i);

//         }

//         System.out.println(Arrays.toString(greaterNext));

//     }

// public static Boolean duplicateParantheseis(String str){
//     Stack<Character> s= new Stack<>();
//     for(int i=0; i<str.length();i++){
//         char ch= str.charAt(i);
//         if(ch==')'){
//             int count=0;
//             while( s.peek()!='('){
//                 s.pop();
//                 count++;
                
//             }

            
            
//             if(count<1){
//                 return true;//duplicate exists
//             }else{
//                 s.pop();
//             }
//         }
//         else{
//             s.push(ch);
//         }

//     }
//     return false;
       


        
// }




    public static int maxArea(int arr[]){

    }
    public static  void main (String args[]){
        int arr[]={ 2,1,5,62,3};
        System.out.println(maxArea(arr));

        // Stack<Integer> s= new Stack<>();
        // s.push(2);
        // s.push(3);
        // s.push(4);
        // pushBottom(s, 1);
        // System.out.println(s);

        // Stack<Character> str = new Stack<>();

        //     str.push('r');
        //     str.push('e');
        //     str.push('d');
        //     str.push('n');
        //     str.push('e');
        //     str.push('t');
        //     str.push('i');
        //     str.push('j');
        


        

        


    }

   

    
}

