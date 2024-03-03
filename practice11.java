//Day 14 - Pattern Questions

public class practice11 {
    public static void main(String[] args) {
//        pattern1(5);
//        System.out.println(" ");
//        pattern2(5);
//        System.out.println(" ");
//        pattern3(5);
//        System.out.println(" ");
//        pattern4(5);
//        System.out.println(" ");
//        pattern5(10);
//        System.out.println(" ");
//        pattern5_2(5);
//        System.out.println(" ");
//        pattern28(5);

//          pattern30(5);

        pattern17(4);
    }

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");

            }
            System.out.print("\n");
        }
    }
    static void pattern2(int n){
        for(int row = 0; row<n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print("* ");

            }System.out.print("\n");
        }
    }

    static void pattern3(int n){
        for(int row = 0; row<n; row++){
            for(int col = n - row; col>0; col--){
                System.out.print("* ");

            }System.out.print("\n");
        }
    }

    static void pattern4(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col+" ");

            }System.out.print("\n");
        }
    }

    static void pattern5(int n){

        for(int row = 0; row<n/2; row++){
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }System.out.print("\n");
        }

        for(int row2 = n/2; row2<n; row2++){
            for(int col2 = n - row2; col2>0; col2--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void pattern5_2(int n){
        for(int r = 1; r <= 2*n-1; r++){
            int nr = 0;
            if(r<=n){
                nr = r;
            }
            else {
                nr = 2 * n - r;
            }
            for(int c = 1; c<=nr; c++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern28(int n){
        for(int r = 1; r <= 2*n-1; r++ ){
            int nr = 0;

                if(r<=n){
                    nr = r;
                }
                else {nr = 2 * n - r;}

            //Spaces

            int ns = 0;

            if(r<=n){
                ns = n-r;
            }
            else{
                ns = r - n;
            }

            for(int s = 1; s<= ns; s++){
                System.out.print(" ");
            }

            //Columns
            for(int c = 1; c<=nr; c++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern30(int n){
        //Rows
        for(int r = 1; r<=5; r++){

        //Spaces

        for(int s = 0; s<=n-r; s++){
            System.out.print(" ");
        }

            //Columns
            for(int c = r; c>=1; c--){
                System.out.print(c);
            }

            for(int c = 2; c<=r; c++){
                System.out.print(c);
            }

            System.out.println(" ");
        }
    }
    static void pattern30_2(int n){
        for(int r = 1; r<=n ; r++){
            //Spaces
            for(int s = 1; s<=n-r; s++){
                System.out.print("  ");
            }

            //Columns
            for(int c = r; c>=1; c--){
                System.out.print(c+" ");
            }
//            System.out.println();

            for(int c = 2; c<=r; c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int r = 1; r<= 2*n-1; r++){

            int ns = 0;
            if(r<=n){
                ns = n - r;
            }
            else{
                ns = r - n;
            }

        for(int s = 0; s<=ns; s++){
            System.out.print(" ");
        }


        for(int c = r; c>=1; c--){
            System.out.print(c);
        }



            System.out.println();
        }
    }
}
