// static variable is intance of class and make a different block of space

public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhi";
        // It changes college name for all objects
        s1.collegeName = "DU";
        
        System.out.println(s1.collegeName);

        Student s2 = new Student();
        System.out.println(s2.collegeName);

        Student s3 = new Student();
        // now it change the IITR for all object
        s3.collegeName = "IITR";
        System.out.println(s3.collegeName);

        System.out.println(s1.collegeName);
        System.out.println(s2.collegeName);
    }
}

class Student {
    String name;
    int roll;

    static String collegeName;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}