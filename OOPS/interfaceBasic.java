// Class - Class is blueprint of Object
// Interface - Inteface is a blueprint of class

public class interfaceBasic {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();  
        
        Beer b = new Beer();
        b.eat();
    }
}

// Example of multiple inheritance
interface Herbivore {
    void eat();
}

interface Carnivore {
    void eat();
}

// This class implement both interfaces properties Herbivore and Carnivore
class Beer implements Herbivore, Carnivore {
    public void eat() {
        System.out.println("He is both Herbivore and Carnivore");
    }
}


// Use of interface implements
interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("left, right, up, down, (all 4 derns)");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("left, right, up, down");
    }
}

class king implements chessPlayer {
    public void moves() {
        System.out.println("left, right, up, down, diagonal by 1 step");
    }
}