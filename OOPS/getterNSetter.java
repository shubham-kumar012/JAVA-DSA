public class getterNSetter {
    public static void main(String[] args) {
        // making object of class
        Pen p1 = new Pen();

        // setting a size
        p1.setColor("pink");
        // calling the getter
        System.out.println(p1.getColor());
        
        // setting a tip size
        p1.setTipSize(2);
        // calling the getter
        System.out.println(p1.getTip());
    }
}

// making a class Pen
class Pen {
    private String color = "blue";
    private int tipSize = 5;

    // set the color (setter)
    void setColor(String color) {
        this.color = color;
    }

    // (getter)
    String getColor() {
        return this.color;
    }

    // set the tip size of pen (setter)
    void setTipSize(int size) {
        tipSize = size;
    }

    // (getter)
    int getTip() {
        return tipSize;
    }
}
