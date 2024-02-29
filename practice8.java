//Day 8 - Recursion Questions

import java.lang.Math;

public class practice8 {

    public static void main(String[] args) {

        //Q1: Find sum of first n numbers using recursion
//        int sum = sumOf(5);
//        System.out.println(sum);

        //Q2: Find sum of the digits of a number using recursion
//        System.out.println(sumOfDigits(132));

        //Q3: Reverse the digits of a number using recursion
//        System.out.println(revNum(1243));

        //Q4: Check if a number is a palindrome or not
        System.out.println(isPalindrome(124321));
    }

    static int sumOf(int n){
        if(n==1){
            return 1;
        }

        return n + sumOf(n-1);
    }

    static int sumOfDigits(int n){

        if(n<10){
            return n;
        }

        return n%10 + sumOfDigits(n/10);
    }

    static int revNum(int n){

        if(n<10){
            return n;
        }

        int product = (int) Math.log10(n);

        return (int) ((n%10)* Math.pow(10,product) + revNum(n/10));
    }

    static boolean isPalindrome(int n) {
        return n == rev(n);
    }
    static int rev(int n){

        if(n<10){
            return 10;
        }

        int d = (int) Math.log10(n);

        return (int) ((n%10) * Math.pow(10,d) + rev(n/10));
    }

}
