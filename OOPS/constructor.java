public class constructor {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "Abhi";
        // s1.roll = 32;
        // Student s2 = new Student("Vishal",29);
        // Student s3 = new Student("Rohan");
        // Student s4 = new Student(12);


        // Copy Constructor -->
        // Shallow & Deep Copy
        Student s1 = new Student();
        s1.name = "Abhi";
        s1.roll = 32;
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;

        // Shallow Copy ---->
        Student s2 = new Student(s1);
        // s2.roll = 45;
        // System.out.println(s2.roll);
        s2.marks[0] = 70; // we change in s2 data
        System.out.println(s1.marks[0]); // but it also affect on s1 data which is conflict because it doesn't copy the value it only refences to s1 marks data
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }


        // If we want to remove this conflict we have to use Deep Copy (see on class constructor on deep & shallow copy)




    }
}

class Student {
    String name;
    int roll;
    int[] marks;

    // Many constructor with same name the difference is only paramater is also called as Constructor Overloading
    // Non-Parameterized Constructor
    Student() {
        marks = new int[3];
    }
    // Parameterized Constructor
    Student(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    // Shallow copy constructor
    // Student(Student s) {
    //     marks = new int[3];
    //     this.name = s.name;
    //     this.roll = s.roll;
    //     this.marks = s.marks;
    // }

    // Deep Copy Constructor
    Student(Student s) {
        marks = new int[3];
        this.name =  s.name;
        this.roll = s.roll;
        for(int i=0; i<marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }

}
