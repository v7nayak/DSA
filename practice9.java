//Day 9 - Recursion Questions

import java.util.ArrayList;

public class practice9 {

    public static void main(String[] args) {

        //Q1: Use a recursive function to count the total number of 0s in a number
//        System.out.println(findZeros(0, 10));

        //Q2: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
//        System.out.println(ans(14));

        //Q3: Check if an array is sorted using recursion
//        int[] arr = {1,4,5,6,12,15};
//        System.out.println(arrSorted(arr));

        //Q4: Linear Search using recursion
//        int target = 15;
//        System.out.println(LinSearch(arr, target));

        //Q5: Linear Search with multiple occurrences of the array (Put indices into an ArrayList)
        int[] arr2 = {1,3,4,6,6,6,7,7,7,7,8,9,12,15};
        int target2 = 7;
        System.out.println(findMultipleOccurrences(arr2, target2));
    }



    static int findZeros(int count, int n){

        if(n<10){
            return count;
        }

        if(n%10==0){
            return findZeros(count+1, n/10);
        }
        return findZeros(count, n/10);
    }

    static int myCount = 0;
    static int ans(int n){

        if(n==0){
            return myCount;
        }

        if(n%2 == 0){
            myCount++;
            return ans(n/2);
        }

        myCount++;
        return ans(n-1);

    }

    static boolean arrSorted(int[] arr){
        int index = 0;
        return helper(arr, index);
    }

    static boolean helper(int[] arr, int index){

        if(index == arr.length-1){
            return true;
        }

        return (arr[index]<arr[index+1] && helper(arr, index+1));
    }

    static int LinSearch(int[] arr, int target){
        int index = 0;
        return helper2(arr, index, target);
    }

    static int helper2(int[] arr, int index, int target){

        if(index > arr.length - 1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return helper2(arr, index+1, target);
    }

    static ArrayList findMultipleOccurrences(int[] arr, int target){
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        return helper3(arr, target, index, list);
    }

    static ArrayList<Integer> helper3(int[] arr, int target, int index, ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return helper3(arr, target, index+1, list);

    }

}
