public class multiLevelInherit {
    public static void main(String[] args) {
        Dog sheru = new Dog();
        sheru.color = "brown";
        sheru.legs = 4;
        System.out.println(sheru.legs);
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

// Derieved Class
class Mammal extends Animal {
    int legs;
}

// Derieved Class
class Dog extends Mammal {
    String breed;
}