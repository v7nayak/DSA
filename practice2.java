//Day2 - Binary Search Questions + Ceiling + Floor of a Number
public class practice2 {
    public static void main(String[] args) {
    int[] arr = {1,3,6,9,10,20};
    int num = 5;
  System.out.println(ceiling(arr,num));
        System.out.println(floor(arr,num));
    }

    static int ceiling(int[] arr, int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int s = 0;
        int e = arr.length - 1;
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
        return arr[s];
    }

    static int floor(int[] arr, int target){
        if(target<arr[0]){
            return -1;
        }
        int s= 0;
        int e = arr.length - 1;
        while(s<=e){
            int m = s+ (e-s)/2;
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
        return e;
    }
}

