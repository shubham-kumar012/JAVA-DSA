public class bitOperations {

    // get the ith bit if it is zero or one
    static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask)==0) {
            return 0;
        } else {
            return 1;
        }
    }

    // set the ith bit to 1 if it is zero or one
    static int setIthBit(int n, int i) {
        int bitMask = (1<<i);
        return n | bitMask;
    }

    // clear the ith bit to 0 if it zero or one
    static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    // update ith bit to newBit 
    static int updateIthBit(int n, int newBit, int i) {
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    static int clearLastIBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    static int clearBitInRange(int n, int i, int j) {
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }


    public static void main(String[] args) {
        System.out.println(getIthBit(5, 0)); // 1
        System.out.println(setIthBit(10, 2)); // 14
        System.out.println(clearIthBit(10, 2)); // 10
        System.out.println(updateIthBit(15, 0,0)); // 11
        System.out.println(clearLastIBits(15, 2)); // 10
        System.out.println(clearBitInRange(10, 2,4)); // 2

    }
}
