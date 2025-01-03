public class stringCompression {

    static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        int i = 0;
        int count = 1; 
        while(i<str.length()-1) {
            if(str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
            else {
                sb.append(str.charAt(i));
                if(count>1) sb.append(count);
                count = 1;
            }
            i++;
        }

        sb.append(str.charAt(i));
        if(count>1) sb.append(count);

        return sb.toString();
        
    }
    public static void main(String[] args) {
        String str = "abc"; // a3b2c1d2
        System.out.println(compress(str));
    }
}
