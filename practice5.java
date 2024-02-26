//Day 5 - Binary Search in 2D arrays (row & col sorted)
import java.util.Arrays;

public class practice5 {

    public static void main(String[] args) {
        int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,8,9},
                        {10,11,12} };
        int target = 14;
//        System.out.println(arr.length);
        System.out.println(Arrays.toString(find(arr, target)));
    }

    static int[] find(int[][]arr, int target){
        int r = 0;
        int c = arr[0].length - 1;
//        if(arr[arr.length-1][arr[0].length-1]<target){
//            return new int[] {-1,-1};
//        }
        while(r<arr.length && c>=0){
            if(arr[r][c]>target){
                c--;
            }
            if(arr[r][c]<target){
                r++;
            }
            if(arr[r][c]==target){
                return new int[] {r,c};
            }
        }
        return new int[] {-1,-1};
    }
}
