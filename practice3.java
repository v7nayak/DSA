//Day 3 - Binary Search Questions

import java.util.Arrays;

public class practice3 {
    public static void main(String[] args) {
    //Q1: Find first and last occurring position of element in the array
    int[] arr = {1,3,5,6,6,6,7,7,7,8,10};
    int target = 7;
        System.out.println(Arrays.toString(findFirstandLast(arr, target)));

    //Q2: Find an element from an infinite array
    int[] arr2 = {1,3,7,12,15,28,30,50,68,73,79,83,100};
    int target2 = 7;  //choosing an element in chunk bigger than the arr size  will result in an index out of bounds error
    int pr = infArr(arr2, target2);
        System.out.println(pr);
    }

    static int[] findFirstandLast(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = search(arr, target, true);
        if(ans[0]!=-1){
            ans[1] = search(arr, target, false);
        }
        System.out.println(ans);
        return ans;
    }

    static int search(int[] arr, int target, boolean findingFirst){
    int ans = -1;
    int s = 0;
    int e = arr.length -1;
    while(s<=e){
        int m = s + (e-s)/2;
        if(arr[m]>target){
            e = m-1;
        }
        if(arr[m]<target){
            s = m+1;
        }
        if(arr[m] == target){
            ans = m;
            if(findingFirst){
                e = m-1;
            }
            if(!findingFirst){
                s = m+1;
            }
        }
    }
    return ans;
    }

    static int infArr(int[] arr, int target){
        int s = 0;
        int e = 1;
        while(target > arr[e]) {
            int temp = e+1;
            e = e + ((e-s+1)*2);
            s = temp;
        }

        int ans = binarySearch(s,e,arr,target);
        return ans;
    }

    static int binarySearch(int s, int e, int arr[], int target){
        int ans = -1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m]>target){
                e = m-1;
            }
            if(arr[m]<target){
                s = m+1;
            }
            if(arr[m]==target){
                return m;
            }
        }
        return ans;
    }
}
