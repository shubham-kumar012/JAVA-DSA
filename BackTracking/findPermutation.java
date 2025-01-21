public class findPermutation {
    public static void main(String[] args) {
        String s = "abc";
        permutation(s, "");
    }
    
    public static void permutation(String s, String ans) {
        // base case
        if(s.length() <= 0) {
            System.out.println(ans);
            return;
        }
        
        // recursion
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            String updatedStr = s.substring(0,i) + s.substring(i+1);
            permutation(updatedStr, ans+ch);
            
        }
    }
}

