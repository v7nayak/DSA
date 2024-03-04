//Day 12 - Recursion Questions (Skipping "apple", "app", "app" but not "apple", etc)

public class practice12 {

    public static void main(String[] args) {
        skipA("", "vinayak");
        String ch = skipApple("adbcapple");
        System.out.println(ch);
    }

    static void skipA(String p, String up){

        if(up.length() == 0){
            System.out.println(p);
            return;
        }

        char ch = p.charAt(0);

        if(ch=='a'){
            skipA(up.substring(1), p);
        }
        else{
           skipA(up.substring(1), p+ch);
        }
    }

    static String skipApple(String up){

        if(up.isEmpty()){
            return up;
        }

        char ch = up.charAt(0);

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
            return ch + skipApple(up.substring(1));
    }
}
