//Day 7 - Recursion

public class practice7 {
    public static void main(String[] args) {
     //Q1: Fibonacci no using recursion
        System.out.println(fibo(6));

     //Q2: Print factorial of a number
        System.out.println(fact(6));

     //Q3: Perform Binary Search using recursion

        int[] arr = {1,3,7,10,20};
        int target = 7;
        System.out.println(bsearchrec(0, arr.length-1, arr, target));
    }

    static int fibo(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibo(n-1)+fibo(n-2);

    }

    static int fact(int n){
        if(n<2){
            return n;
        }
        return n*fact(n-1);
    }

    static int bsearchrec(int s, int e, int[] arr, int target){

        if(s>e){
            return -1;
        }

        while(s<=e){

            int m = s + (e-s)/2;

            if(arr[m]>target){
                return bsearchrec(s, m-1, arr, target);
            }
            if(arr[m]<target){
                return bsearchrec(m+1, e, arr, target);
            }
            if(arr[m] == target){
                return m;
            }
        }
        return -1;

    }
}
