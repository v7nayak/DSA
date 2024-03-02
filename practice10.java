//Day 10 - Recursion Questions

//Try to use both methods for recursive calls - static variable list, list in parameter, list addAll

import java.util.ArrayList;

public class practice10 {

    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,6,6,6,7,7,7,7,8,9,10};
        int target = 6;

    //Method1 - Static
//        System.out.println(method1(arr, target, 0));

    //Method2 - List as parameter in the function
//        System.out.println(method2(arr, target, 0, list));

    //Method3 - List add all method
        System.out.println(method3(arr, target, 0));
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> method1(int[] arr, int target, int index){

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return method1(arr, target, index+1);
    }

    static ArrayList<Integer> method2(int[] arr, int target, int index, ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return method2(arr, target, index+1, list);

    }

    static ArrayList<Integer> method3(int[] arr, int target, int index){

        ArrayList<Integer> list1 = new ArrayList<>();

        if(index == arr.length){
            return list1;
        }

        if(arr[index] == target){
            list1.add(index);
        }

        ArrayList<Integer> listnew = method3(arr, target, index+1);
        list1.addAll(listnew);

        return list1;

    }

}
