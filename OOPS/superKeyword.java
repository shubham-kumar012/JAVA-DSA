class superKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}

// super keyword used to refers the object of parent class
// this keyword used to refers the object of current class

class Animal {
    String color;
    Animal() {
        System.out.println("Animal Constructor is Called");
    }
}

class Horse extends Animal {
    Horse() {
        // super();
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}