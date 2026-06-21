public class Backtrack {

    public static void printSolution(int sol[][]) {
        for(int i=0; i<sol.length; i++) {
            for(int j=0; j<sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static boolean isSafe(int maze[][], int i, int j) {
        return (i>=0 && i<maze.length && j>=0 && j<maze.length && maze[i][j]==1);
    }

    public static void solveMazeUtil(int maze[][], int i, int j, int sol[][]) {
        // Base case: destination reached
        if(i==maze.length-1 && j==maze.length-1 && maze[i][j]==1) {
            sol[i][j] = 1;
            printSolution(sol);
            sol[i][j] = 0; // backtrack to find other paths
            return;
        }

        if(isSafe(maze,i,j)) {
            if(sol[i][j]==1) return; // already visited

            sol[i][j] = 1;

            // Move down
            solveMazeUtil(maze,i+1,j,sol);

            // Move right
            solveMazeUtil(maze,i,j+1,sol);

            sol[i][j] = 0; // backtrack
        }
    }

    public static void solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N];
        solveMazeUtil(maze,0,0,sol);
    }

    public static void main(String args[]) {
        int maze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,1,0},
            {1,1,1,1}
        };
        solveMaze(maze);
    }
}