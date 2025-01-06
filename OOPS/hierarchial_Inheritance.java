public class hierarchial_Inheritance {
    public static void main(String[] args) {
        Bird chi = new Bird();
        chi.fly();
        chi.eat();

        // Just like that we can try on another classes 
        // This classes inherit the property of parent class and it example of hierarchial inheritance
    }
}

// Base Class / Parent Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breathes");
    }
}

// class extends parent class
class Mammal extends Animal {
    int legs;
    void walk() {
        System.out.println("walks");
    }
}

// class extends parent class
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swim");
    }
}

// class extends parent class
class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}
