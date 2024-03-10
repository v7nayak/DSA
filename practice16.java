//Day 16 - Backtracking Questions

public class practice16 {

    public static void main(String[] args) {

        //Q1: Print all possible paths to reach the end

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        markVisited(maze, 0, 0, "");

        //Q2: Print the recursive call count, while
        //    trying to reach the end

        printCount(0, maze, 0,0, "");
    }

    static void markVisited(boolean [][] maze, int r, int c, String p){

        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }



        if (r<maze.length-1){maze[r][c] = false;
            markVisited(maze, r+1, c, p+"D ");maze[r][c] = true;
        }

        if(c<maze[0].length-1){maze[r][c] = false;
            markVisited(maze, r, c+1, p+"R ");maze[r][c] = true;
        }

        if(c>0){maze[r][c] = false;
            markVisited(maze, r, c-1, p+"L ");maze[r][c] = true;
        }

        if(r>0){maze[r][c] = false;
            markVisited(maze, r-1, c, p+"U ");maze[r][c] = true;
        }


    }

    static void printCount(int count, boolean[][] maze, int r, int c, String p){

        if(r == maze.length - 1 && c == maze.length - 1){
            System.out.println(count);
            count = 0;
            return;
        }

        if(!maze[r][c]){
            return;
        }


        maze[r][c] = false;

        if(r<maze.length - 1){
            printCount(count+1, maze, r+1, c, p+"D ");
        }

        if(c<maze[0].length - 1){
            printCount(count+1, maze, r, c+1, p+"R ");
        }

        if(r>0){
            printCount(count+1, maze, r-1, c, p+"U ");
        }

        if(c>0){
            printCount(count+1, maze, r, c-1, p+"L ");
        }

        maze[r][c] = true;
    }

}
