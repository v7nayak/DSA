//Day1 - Binary Search + OrderAgnostic Binary Search

public class practice1{public static void main(String[] args){
    int[] arr = {1,4,7,10,23,25,30};
    int[] desc = {90,78,42,32,30,23,21,9,2};
    int target = 33;
//    int ans = bsearch(target, arr);
//    System.out.println(ans);
    int ans2 = orderAgnosticBS(desc, target);
    System.out.println(ans2);
}

static int bsearch(int target, int[] arr){
    int s = 0;
    int e = arr.length - 1;

    while(s<=e){
        int m = s + (e - s)/2;
        if(arr[m]>target){
            e = m-1;
        }
        if(arr[m] == target){
            return m;
        }
        if(arr[m]<target){
            s = m+1;
        }

    }
    return -1;
}

static int orderAgnosticBS(int[] arr, int target){
    int s = 0;
    int e = arr.length - 1;
    boolean isAsc = arr[s]<arr[e];

        while(s<=e)
        {
            int m = s + (e-s)/2;
            if (arr[m] == target){
                return m;
            }
            if(isAsc){
                if(arr[m]>target){
                    e = m-1;
                }
                if(arr[m]<target){
                    s = m+1;
                }
            }
            if(!isAsc){
                if(arr[m]>target){
                    e = m-1;
                }
                if(arr[m]<target){
                    s = m+1;
                }
            }
        }
        return -1;
}
}
