public class abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.walk();

        // Chicken chick = new Chicken();
        // System.out.println(chick.color);
        // chick.changeColor();
        // System.out.println(chick.color);
        // chick.walk();

        // Contructor calling
        Mustang h = new Mustang();
        h.color = "dark-brown";
        // Animal -> Horse -> Mustang
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
    String color = "brown";
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = "dark-brown";
    }
    void walk() {
        System.out.println("Walk on 4 legs.");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("walk on 2 legs.");
    }
}