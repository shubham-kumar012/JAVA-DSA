package Recursion;

class reverseStringUsingRecursion {
    static String reverseStr(StringBuilder str, int i, int j) {
        // base case
        if(i >= j) return str.toString();
        // swap
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
        
        return reverseStr(str, i+1, j-1);
        
    }
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(reverseStr(new StringBuilder(str), 0, str.length()-1));
    }
}