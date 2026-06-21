// package learn;



public class Dev{


// increasing numbers
// public static void incNum(int num){
//     if( num==1)
//     {
//         System.out.print(num + " ");
//         return;
//     }

    
     
//     incNum(num-1);
//     System.out.print(num + " ");
// }

// // factorial  of a number
// public static int factNumb( int num){
//     if(num==0){
//         return 1;

//     }
//     int fnm1=factNumb(num-1);
//     int fn= num* fnm1;
//     return fn;

// }

// // sum of n natural numbers
// public static int sumNum( int num){
//     if(num==1){
//         return 1;

//     }
//     int sumnm1=sumNum(num-1);
//     int sumn=num+sumnm1;
//     return sumn;

// }

// // fabonaccci series //  incomplete
// public static void faboSeries(int num){
//     if(num==0 ){
//        System.out.print( num + " ");
//        return;

//     }
//     int fnm1= faboSeries(num-1);
//     if(num==1){
//         System.out.print( num + " ");
//     }

//     int fn=n+fnm1;


    

// }

//sorted array or not
public static boolean sortArr( int num[],int i){

    if(i==num.length-1 ){
        return true;
    }
    if( num[i] > num[i+1]){
        return false;
    }


     return sortArr(num,i+1);
}


// find first occurence 
public static void findFirst( int num[],int i, int key){

    if(num[i]==key){
        System.out.print(" the key  is at "+ i);
        return;
    }


    if(i==num.length-1){
        System.out.print("key is  not present");
        return;
    }
    findFirst(num,i+1,key);
    

}




// x to the power n
public static int xpown(int x,int n){
    if(n==0){
        return 1;
    }

    int xnm1= xpown(x,n-1);
    int xn= x * xnm1;
    return xn;
}



// remove duplicates
public static void remDup( String str, int idx, StringBuilder newString, boolean map[]){
    if(idx==str.length()){
        System.out.print( newString);
        return;
        
    }

    char currChar= str.charAt(idx);
    if( map[currChar-'a']== true){
        remDup(str,idx+1,newString,map);
    }
    else{
        map[currChar-'a']= true;
        remDup(str,idx+1,newString.append(currChar),map);
    }
}

// pairing total
public  static int totalPair(int num){
    if(num==1 || num==2){
        return num;
    }

    return totalPair(num-1) + totalPair(num-2)* (num-1);
}


//binary string problem
public static void countBinString( StringBuilder str, int n, int lastPlace){
    if(n==0 ){
        System.out.println(str);
    }


    if( lastPlace==0){
        countBinString(str.append("0"),n-1,0);
        countBinString(str.append("1"),n-1,1);
    }
    else{
        countBinString(str.append("0"),n-1,0);
    }


}


//string length
public static int strLength(String str,int count){
    if(str.equals("")){
        return 0;
    }
    
    int countm1=strLength(str.substring(1),count);
    return 1 +countm1;


}


// contagious substring 
// public static void printContString( String str,int idx){

// }

//merge sorting
// public static  void   mergeSort( int arr[],int s , int end){
//     if( s>=e){
//         return;
//     }
//     int mid=s/2 + e/2;
//     mergeSort(arr,s,mid);
//     mergeSort(arr,mid+1,e);
//     merge(arr,s,mid,e);
// }

// public static void merge( int arr[],int s,int mid,int e){
//     int temp[]=new temp[e-s+1];
//     int i=s;
//     int j=mid+1;
//     int k=0;
//     while(i<=mid && j<=e){

//         if(arr[i]<arr[j]){
//             temp[k]=arr[i];
//             i++;

//         }else{
//             temp[k]=arr[j];
//             j++;
//         }
//         k++;
//     }

//     while(i<=mid){
//         temp[k]=arr[i];
//         k++,j++;
//     }
//     while(j<=e){
//         temp[k]=arr[j];
//         j++,k++;
//     }

//     for(int i=s,k=0;i<=temp.length;k++,i++){
//         arr[i]=temp[k];
//     }
    
// }


public static  String[] alphaSort( String str[],int start,int end){
    //base case
    if(start==end){
        String a[]={str[start]};
        return a;
    }


    int mid=(start+end)/2;
    String s1[]=alphaSort(str,start,mid);
    String s2[]=alphaSort(str,mid+1,end);

    String s3[]= merge(s1,s2)
    return s3;


}

public static String[] merge( String s1[],String s2[]){

    int s1l=s1.length();
    int s2l=s2.length();

    String s3[]= new String[s1l+s2l];

    int i=0;
    int j=0;
    int idx=0

    while(i<s1l && j<s2l){

        if()
    }

}






//quick sorting 
public static void quickSort( int arr[],int start , int end){
    if( start>=end){
        return;

    }

    int idx=partition(arr,start,end);
    quickSort(arr,start,idx-1);
    quickSort(arr,idx+1,end);





}

public static  int partition(int arr[],int start,int end){
    int pivot=arr[end];
    int i=start-1;
    

    for(int j=start;j<end;j++){
        if(arr[j]<=pivot){
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
    i++;
    int temp= pivot;
    arr[end]=arr[i];
    arr[i]=pivot;
    return i;


}


public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }







    public static void main( String args[]){
        int[] arr = {3, 5, 2, 9, 11};
        quickSort(arr,0,4);
        printArray(arr);

        // System.out.print(strLength("jitender",0));
        // countBinString( new  StringBuilder(),3,0);
        // incNum(5);
        // System.out.print(sumNum(5));
        // int arr[]={1,2,3,4};
        // findFirst(arr,0,5);
        // StringBuilder newString= new StringBuilder();
        // String str= "jjjjjjj";
        // boolean map[]=  new boolean[26];
        // remDup( str,0,newString,map);
        // System.out.print(totalPair(3));
    }
}