public class findSubsets {

    static void findSubset(String str, StringBuilder ans, int i) {
        // base case
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }

        // Yes Choice
        findSubset(str, ans.append(str.charAt(i)), i+1);
        // No Choice
        ans.deleteCharAt(ans.length()-1);
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, new StringBuilder(""), 0);
    }
}
