//Day 4 - Binary Search Questions
public class practice4 {
    public static void main(String[] args) {
        //Q1: Find peak element in a mountain / bitonic array
//        int[] arr = {0, 2, 5, 7, 9, 4, 3, 1};
//        System.out.println(findPeak(arr));

        //Q2: Find a target element in a mountain array
//        int[] arr2 = {1,3,7,10,25,18,9};
//        int target2 = 25;
//        System.out.println(findinMountArr(arr2, target2));

        //Q3: Find an element in a rotated array
        int[] arr3 = {4,7,10,21,3,5,8,12,15};
        int target3 = 15;
        int ans = findAns(arr3, target3);
        System.out.println(ans);
    }

    static int findPeak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m + 1]) {
                e = m;
            }
            if (arr[m] < arr[m + 1]) {
                s = m + 1;
            }
        }
    return s;
    }

    static int findinMountArr(int[]arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while(s<e){
            int m = s + (e-s)/2;
            if(arr[m]>arr[m+1]){
                e = m;
            }
            if(arr[m]<arr[m+1]){
                s = m+1;
            }
        }
        int peak = s;
        int ans1 = binarysearch(0, peak, target, arr);
        if(ans1==-1){
            return binarysearch(peak,e,target, arr);
        }
        else {
        return ans1;}
    }

    static int binarysearch(int s, int e, int target, int[] arr){
        while(s<=e){
            int m = s+ (e-s)/2;
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
        return -1;
    }
    static int findAns(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        int peak = 0;
        while(s<e){
            int m = s + (e-s)/2;
            if(m<e && arr[m]>arr[m+1]){
                peak = m;
            }
            if(arr[m]<arr[m-1]){
                peak = m-1;
            }
            if(arr[s]>=arr[m]){
                e = m-1;
            }
            if(s<m){
                s = m+1;
            }
        }
        int ans1 = findInRotated(0,peak,arr,target);
        if(ans1==-1){
            return findInRotated(peak+1, arr.length-1, arr, target);
        }
        else{
            return ans1;
        }
    }

    static int findInRotated(int s, int e, int[] arr, int target){
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m]>target){
                e = m-1;
            }
            if(arr[m]<target){
                s = m+1;
            }
            if(arr[m] == target){
                return m;
            }
        }
        return -1;
    }
}