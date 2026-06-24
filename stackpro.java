import java.util.*;

public class stackpro {


    public static void smallestLeft(int arr[],int sL[] ){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            while(!s.empty() && curr<=arr[s.peek()]){
                s.pop();
            }
            if(s.empty()){
                sL[i]=-1;
            }
            else{
                sL[i]=s.peek();
            }

            s.push(i);
        }

    }

    public static void smallestRight(int arr[],int sR[]){
         Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(!s.empty() && curr<=arr[s.peek()]){
                s.pop();
            }
            if(s.empty()){
                sR[i]=arr.length;
            }
            else{
                sR[i]= s.peek();
            }

            s.push(i);
        }
        
    }


    public static int maxArea(int arr[]){
        
        int sL[]=new int[arr.length];
        int sR[]=new int [arr.length];
        smallestLeft(arr,sL);
        smallestRight(arr, sR);

        int max[]=new int[arr.length];
        int max_area= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            max[i]=(sR[i]-sL[i]-1)*arr[i];
            max_area=Math.max(max_area, max[i]);
            

        }

        return max_area;



        
    }
    public static  void main (String args[]){
        int arr[]={2,4};
        System.out.println(maxArea(arr));

    
}
}
