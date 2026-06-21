public class backtracking{


    // public static void subString(StringBuilder str,StringBuilder  ans,int idx){
    //     if(idx==str.length()){
    //         System.out.println(ans);
    //         return;
    //     }


    //     subString(str,ans+str.charAt(idx),idx+1);
    //     subString(str,ans,idx+1);

    // }








    //n queen problem
    // static int count =0;

    // public static boolean isSafe(char chess[][],int row ,int col){
    //  // vertically 
    //  for(int i=row-1;i>=0;i--){
    //     if(chess[i][col]=='Q'){
    //         return false;
    //     }
    //  }
    //  // dignoally left 

    //  for(int i=row-1, j=col-1;i>=0 &&j>=0;i--,j--){
    //      if(chess[i][j]=='Q'){
    //         return false;
    //     }

    //  }
    //  // right diganolly

    //  for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
    //      if(chess[i][j]=='Q'){
    //         return false;
    //     }

    //  }
    //  return true;

    // }


    // public static void nQueen( char chess [][], int row){


    //     if(row==chess.length){
    //         printchess(chess);
    //         return;
    //     }


    //     for(int j=0;j< chess.length;j++){
    //         if(isSafe(chess,row,j)){
    //              chess[row][j]='Q';
    //         nQueen(chess,row+1);
    //         chess[row][j]='X';

    //         }
             

    //     }
    // }

    // public static void printchess(char chess[][]){

    //     System.out.println("---------------------");
    //     count++;
    //     System.out.println(count);
    //     int n=chess.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             System.out.print( chess[i][j] + "   ");
    //         }
    //         System.out.println();
    //     }



    // }



//   public static int  gridways(int n ,int m,int i,int j){
//     if(i==n-1 && j==m-1){
//         return 1;
//     }else if
//         (i >= n || j >= m) {
//     return 0; // invalid path
// }
    

//     return gridways(n,m,i+1,j)+gridways(n,m,i,j+1);


//   }
 
// rat maze problem
   public static void printSolution(int N) {
    int sol[][]= new int[N][N];
    for(int i=0; i<sol.length; i++) {
        for(int j=0; j<sol.length; j++) {
            System.out.print(" " + sol[i][j] + " ");
        }
        System.out.println();
    }
}


public static boolean isSafe(int maze[][],int i,int j){
   return (i>=0 && i<maze.length && j>=0 && j<maze.length && maze[i][j]==1);}


    public static void solveMaze(int maze[][],int i,int j){


        if(i==maze.length-1 && j==maze.length-1 && maze[i][j]==1) {
            printSolution(maze.length);
            return;
        }


        if(isSafe(maze,i,j)){

            if(sol[i][j]==1){
                return;
            }

            sol[i][j]=1;
            solveMaze(maze,i+1,j);
            solveMaze(maze,i,j+1);
            sol[i][j]=0;
        }

        
    }









    public static void main(String args[]){

    //     int n =3,m=3;
    //    System.out.print( gridways(n,m,0,0));
        // StringBuilder str= new StringBuilder("abc");
        
        //  subString(str,new StringBuilder(""),0);
        // int n=5;

        // char[][] chess=new char[n][n];

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         chess[i][j]='X';
        //     }
             
        // }

        // nQueen(chess,0);

        int maze[][]={
        {1,0,0,0},
        {1,1,0,1},
        {0,1,0,0},
        {1,1,1,1}
    };
    solveMaze(maze,0,0);
        

    }


}