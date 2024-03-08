//Day 15 - Recursion Questions


public class practice15 {

    public static void main(String[] args) {

//        Q1: Calculate the total number of ways in which a die can produce a sum of 8;
        dice("", 8, 12);
//
//        Q2: Maze Problem (Backtracking)
        maze(3,3, "");
//
//        Q3: Maze Problem (with diagonal movements)
        mazeDiagonal(3,3,"");
//
//        Q4: Maze Problem (with obstacle)
        mazeObstacle(3,3, "");
    }






    static void dice(String p, int n, int face){

        if(n == 0){
            System.out.println(p);
            return;
        }

        for(int i =1; i<=face && i<= n; i++){
            dice(p+i, n - i, face);
        }

    }

    static void maze(int r, int c, String p){

        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            maze(r, c-1, p+"r");
        }

        if(c>1){
            maze(r-1, c, p+"d");
        }

        maze(r-1, c, p+"d");
        maze(r, c-1, p+"r");

    }

    static void mazeDiagonal(int r, int c, String p){

        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1 && c>1){
            maze(r-1, c-1, p+"Diagonal");
        }

        if(r>1){
            maze(r-1,c, p+"D ");}
        if(c>1){
            maze(r, c-1, p+"R ");}

    }

    static void mazeObstacle(int r, int c, String p){

        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r==2 && c==2){
            return;
        }

        if(r>1 && c>1){
            mazeObstacle(r-1, c-1, p+"Diag ");
        }

        if(r>1){
            mazeObstacle(r-1, c, p+"D");
        };

        if(c>1){
            mazeObstacle(r, c-1, p+"R");
        }

    }
}
