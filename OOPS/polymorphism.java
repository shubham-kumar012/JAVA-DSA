// There are Two Types of Polymorphism -->
// Compile Time(Static) Polymorphism (Method Overloading)
// Runtime(Dynamic) Polymorphism (Method Overriding)

public class polymorphism {
    public static void main(String[] args) {
        // Compile time Polymorphism
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2,5)); //7
        System.out.println(cal.sum((float)1.0,(float)1.5)); // 2.5
        System.out.println(cal.sum(1,2,3)); // 6

        // Runtime Polymorphism
        Deer dd = new Deer();
        dd.eat();
    }
}

// Method Overloading
class Calculator {
    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a, float b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }
}

// Method Overriding
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer {
    void eat() {
        System.out.println("eats grass");
    }
}

