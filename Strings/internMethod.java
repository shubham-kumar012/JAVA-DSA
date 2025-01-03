public class internMethod {
    public static void main(String[] args) {
        // Automatically Intern to the string pool
        String str1 = "Hello";
        String str2 = "Hello";

        // Explicitly create string
        String str3 = new String("Hello");
        
        // Manually pooled
        String str4 = str3.intern();

        System.out.println(str1==str2); // true, both refer to the same object in the pool
        System.out.println(str1==str3); // false, str3 is the separate obj in the heap
        System.out.println(str1==str4); // true, str4 refers to pooled obj
    }
}
