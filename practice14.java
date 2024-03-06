//Day 14 - Permutation Questions

import java.util.ArrayList;

public class practice14 {

    public static void main(String[] args) {
        String str = "abc";

        //Q1: Write recursive code to print all the
        // possible subsets of the given String
        System.out.println(subset(str,""));


        //Q2: Print all the possible
        //    subsequences for given String.
        System.out.println(subsequence(str, ""));

        //Q3: Print how many subsequences can be formed
        //    from the given String.
        System.out.println(subseqCount(str, ""));
    }

    static ArrayList<String> subset(String up, String p){



        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> list1 = subset(up.substring(1), p );
        ArrayList<String> list2 = subset(up.substring(1), p+ch);

        list2.addAll(list1);
        return list2;
    }

    static ArrayList<String> subsequence(String up, String p){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> listnew = new ArrayList<>();

        for (int i = 0; i<up.length() ; i++) {

            char ch = up.charAt(i);

            String lhs = up.substring(0, i);
            String rhs = up.substring(i+1);



            listnew.addAll(subsequence(lhs + rhs, p+ch));
        }
            return listnew;
        }

        static int subseqCount(String up, String p){

        if(up.isEmpty()){
            return 1;
        }

        int count = 0;

        for(int i = 0; i<up.length(); i++)

        {
            char ch = up.charAt(i);
            String lhs = up.substring(0,i);
            String rhs = up.substring(i+1);

            count = count + subseqCount(lhs + rhs, p+ch);
        }

        return count;

        }

    }


