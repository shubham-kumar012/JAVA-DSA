// StringBuffer is slower than String & StringBuilder due to synchronization
// It is best for Creating mutithreaded applications

public class string_Buffer_Basic {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");

        // append
        buffer.append(" World");
        System.out.println(buffer); // Hello World

        // inserting
        buffer.insert(5, ",");
        System.out.println(buffer); // Hello, World

        // replace
        buffer.replace(7,12,"Java");
        System.out.println(buffer); // Hello, Java

        // delete
        buffer.delete(5, 7);
        System.out.println(buffer); // HelloJava

        // reverse
        buffer.reverse();
        System.out.println(buffer); // avaJolleH

        // check capacity & length
        System.out.println("Capacity: "+ buffer.capacity());
        System.out.println("Length : "+ buffer.length()); 

    }
}