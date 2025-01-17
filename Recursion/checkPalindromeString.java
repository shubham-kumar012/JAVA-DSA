package Recursion;

class checkPalindromeString {
    static public boolean checkPalindrome(String str) {
        // base case for length 1 or empty string
        if(str.length() <= 1) {
            return true;
        }
        
        // base case for length 2 
        if(str.length() == 2) {
            return str.charAt(0) == str.charAt(1);
        }
        // check first and last chars
        if(str.charAt(0) == str.charAt(str.length()-1)) {
            // call for substring
            return checkPalindrome(str.substring(1, str.length()-1));
        }
        // if last char doesn't match
        return false;
    }
    public static void main(String[] args) {
        String str = "abbaa";
        System.out.println(checkPalindrome(str));
    }
}