public class checkNumberIsPowerOfTwo {

    static boolean checkPowOfTwo(int n) {
        if((n & (n-1)) == 0) {
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkPowOfTwo(16)); 
    }
}
