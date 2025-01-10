package Recursion;

public class removeDuplicateFromString {

    static void removeDuplicate(String s, int idx, StringBuilder newStr, boolean[] map) {
        // base case
        if(idx == s.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = s.charAt(idx);

        if(map[currChar-'a'] == false) {
            map[currChar-'a'] = true;
            removeDuplicate(s, idx+1, newStr.append(currChar), map);
        } else {
            removeDuplicate(s, idx+1, newStr, map);
        }

    }
    public static void main(String args[]) {
        String s = "appnaacollegge"; //apncoleg
        removeDuplicate(s, 0, new StringBuilder(""), new boolean[26]);

    }
}
