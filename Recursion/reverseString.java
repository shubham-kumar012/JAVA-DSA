package Recursion;

public class reverseString {

    static void reverseStr(String s) {
        if(s==null || s.length()<=1) {
            System.out.print(s.charAt(s.length()-1));
            return;
        }

        System.out.print(s.charAt(s.length()-1));
        reverseStr(s.substring(0, s.length()-1));
    }
    public static void main(String[] args) {
        reverseStr("hello");
    }
}
