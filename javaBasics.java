import java.util.*;
public class javaBasics{


    public static void decToBin(int a){
        int bin=0;
        int pow=0;
      while ( a>0){
        
        int rem=a%2;
        bin= bin + rem* (int)Math.pow(10,pow);
        pow++;
        a/=2;

      }
      System.out.println(bin);
    }





    public static int binSearch(int num[],int key){
     int start =0;
     int end= num.length-1;
     

     while( start<=end){
      int mid=(start+end)/2;
      
      if ( num[mid]==key){
      return mid;
     }
     else if(num[mid]> key){
      end= mid-1;
     }
    else{
      start=mid+1;
    }


     }
     return -1;
     
    }


  public static void revArray( int num[]){
    // int start=0;
    // int end= num.length-1;
    for ( int i=0;i<num.length/2;i++){
      int j=num[i];
      num[i]=num[num.length-1-i];
      num[num.length-1-i]=j;
    }
    System.out.print( Arrays.toString(num));
    
    
  }


  public static int trapWater(int h[]){
    //left max
    int n= h.length;
    int leftMax[]=new int[n];
    leftMax[0]=h[0];
    for ( int i=1;i<n;i++){
      leftMax[i]=Math.max(leftMax[i-1],h[i]);
      

    };
     // right max
    int rightMax[]=new int[n];
    rightMax[n-1]=h[n-1];
    for(int i=n-2;i>=0;i--){
      rightMax[i]=Math.max(rightMax[i+1],h[i]);

    }


   int  totalWater=0;
   for(int i=0;i<n;i++){
    int waterLevel=Math.min(leftMax[i],rightMax[i]);
    totalWater+= waterLevel-h[i];

   }

   return totalWater;

   
    // water collecction formula = water level- height ;

  }




  // public static void selectionSort(int num[]){
  //   int len= num.length;
  //   for(int i=0;i<len-1;i++){
  //     int small=Integer.MAX_VALUE;
  //     for(int j=i+1;j<n;j++){
  //       if(num[j])
  //     }

  //   }
  // }


  public static void insertSort(int num[]){
    int h= num.length;


    for(int i=1; i<h-1;i++){
      int j=i-1;
      int key=num[i];
      while( j>=0 && num[j]> key ){
        num[j+1]= num[j];
        j--;
      }



    }



  }

  public static void  staircaseSort( int num[][],int key){
    int row= num.length;
    int col= num[0].length;
    
    int i=0;
    int j=col-1;
    while( i<=row-1 && j>=0){
      if(num[i][j]==key){
        System.out.print(" we found the key at ("+i+","+j+" )" );
        break;
      }
      else if(num[i][j]>key){
        j--;

      }
      else{
        i++;
      };

    }
   

  }

  public static void shortestPath( String str){
    int len= str.length();
    int x=0,y=0;
    for( int i=0; i<len; i++){
      if(str.charAt(i)=='N'){
        y++;
      }
      else if(str.charAt(i)=='E'){
        x++;

      }
      else if(str.charAt(i)=='W'){
        x--;
      }
      else{
        y--;
      }
    }

    double sd= Math.sqrt( x*x + y*y);
    System.out.print(" the shortest distance is "+ sd);
  }

public static void expo( int num, int pow){
  int res=1;
 ;

  while( pow > 0){
    if(( pow & 1) !=0){
      res= res*num;
    }
    num*=num;
    pow=pow>>1;


  }
  System.out.print(res);


}





    public static void main(String args[]){
      // int num[]={4,2,0,6,3,2,5};
      // String str="WNEENESENNN";
      // shortestPath(str);
      Car c= new Car("jitender",45);

      // expo(5,2);

      // int[][] num = {
      //       { 1,  2,  3,  4,  5},
      //       { 6,  7,  8,  9, 10},
      //       {11, 12, 13, 14, 15},
      //       {16, 17, 18, 19, 20},
      //       {21, 22, 23, 24, 25}
      //   };
      //   staircaseSort(num,24);
      // int key=3;
      // // int i= binSearch(num,key);
      // System.out.print(" the key you are searching is at "+ i);
    //  System.out.print(trapWater(num));
    }
}


class Car{
  String name ;
  int age;

  Car(String name,int age){
    this.name=name;
    this.age=age;
  }
}
        // System.out.print("hello world");
        // System.out.println("hello world");
        // System.out.print("hello world");

        // System.out.println("* * * *");
        //  System.out.println("* * *");
        //   System.out.println("* *");
        //    System.out.println("*");
        // decToBin(7);


        // Scanner sc= new Scanner(System.in);
        // // String sr= sc.next();
        // // System.out.println(sr);

        // int a = sc.nextInt();
        // int b= sc.nextInt();
        // int sum= a+b;
        // System.out.println(sum);
        // int age = 33;

        // if(age>=18){
        //     System.out.println("you are an adult of age okay");
        // }
        // else{
        //     System.out.println("not adult");
        // }


      //   int num=1;
      // while (num<11){
      //   System.out.println(num);
      //   num++;
      // }
      // int num= sc.nextInt();

      // while( num >0){
      //   int x= num%10;
      //   System.out.print(x);
      //   num = num/10;
      // }


      // for ( int i=2; i<num;i++){
      //   if ( num%i==0){
      //     System.out.print("n is a prime number");
      //     break;
      //   }
      // }


      // for ( int i=1; i<=num;i++){
      //   for ( int j=1; j<=num+1;j++){
      //     if( i==1 || i==num){
      //       System.out.print("* ");
      //     }
      //     else if ( j==1 || j==num+1){
      //       System.out.print("* ");

      //     }
      //     else {
      //       System.out.print("  ");
      //     }
      //   }
      //   System.out.println();
      // }
      // int row=4;
      // int col=5;


      // for(int i=1;i<=row;i++){
      //   for(int j=1;j<=col;j++){
      //     if(i==1 || i==row|| j==1|| j==col){
      //       System.out.print("*");


      //     }
      //     else{
      //       System.out.print(" ");
      //     }
          
      //   }
      //   System.out.println();
      // }
//         for (int i=1; i<=row;i++){

//           for (int j=1; j<=col;j++){

//            if( row-i>0){
//             System.out.println(" ");
//            }
//            else {
//             System.out.print("*");
//            }
//           }
//         }
//         System.out.println();

 
// for( int i=1; i<=row;i++){
//   for ( int j=1; j<=i;j++){
//    if( (i+j)%2==0){
//     System.out.print(1);
//    }
//    else{
//     System.out.print(0);
//    }

//   }
//   System.out.println();
// }


      

//     }
 




 





