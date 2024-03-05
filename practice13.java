//Day 13 - Subsets

import java.util.ArrayList;

public class practice13 {
    public static void main(String[] args) {
        String up = "abc";
        System.out.println(subset(up, ""));
    }
    static ArrayList<String> subset(String up, String p){



        if(up.isEmpty()){
            ArrayList<String> list1 = new ArrayList<>();
            list1.add(p);
            return list1;
        }


        char ch = up.charAt(0);

        ArrayList<String> ans = subset(up.substring(1), p);
        ArrayList<String> ans2 = subset(up.substring(1), p+ch);

        ans2.addAll(ans);
        return ans2;
    }

}
