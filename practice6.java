//Day6 - Strings
public class practice6 {
    public static void main(String[] args) {
        String name1 = "Vinayak";
        String name2 = "Vinayak";
        String name3 = new String("Vinayak");

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
//
        System.out.println("\n"+name1.equals(name2));
        System.out.println(name1.equals(name3));
//
        System.out.println("\n"+name1.charAt(2));

        String palin = "alamala";
        System.out.println(checkPalindrome(palin));
    }

    static boolean checkPalindrome(String word){

        word = word.toLowerCase();

        int s = 0;
        int e = word.length() - 1;

        while(s<=e){

            if(word.charAt(s)!=word.charAt(e)){
                return false;
            }

            s++;
            e--;

        }
        return true;
    }
}