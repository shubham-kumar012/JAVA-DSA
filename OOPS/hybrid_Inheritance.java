/*          Animal
 *       /     |   \
 *      /      |    \
 *     /       |     \
 *  Mammal    Fish   Bird
 *    /\        /\      \
 *   /  \      /  \      \ 
 * Human Dog  Tuna Shark  Peacock
 * 
 */

public class hybrid_Inheritance {
    public static void main(String[] args) {
        Peacock pk = new Peacock();
        pk.fly();
    }
}

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
    // class that extends Mammal class
    class Human extends Mammal {
    String name;
    void name() {
        System.out.println(name);
    }
}
    // class that extends Mammal Class
    class Dog extends Mammal {
    String breed;
    void breedName() {
        System.out.println(breed);
    }
}


// class extends parent class
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swim");
    }
}
    // Class extends fish class
    class tuna extends Fish{
        void name() {
            System.out.println("Tuna Fish`");
        }
    }
    // Class Extends Fish Class
    class Shark extends Fish {
    void name() {
        System.out.println("Shark Fish");
    }
}


// class extends parent class
class Bird extends Animal {
    String sound;
    void fly() {
        System.out.println("fly");
    }
}
    //class extends Bird class
    class Peacock {
        void fly() {
            System.out.println("Rarely Fly");
        }
    }
