public class classNobject {
    public static void main(String[] args) {
        // making object of class
        Pen p1 = new Pen();

        // setting a size
        p1.setColor("pink");
        System.out.println(p1.color);
        
        // setting a tip size
        p1.setTipSize(2);
        System.out.println(p1.tipSize);
    }
}

// making a class Pen
class Pen {
    // set it's properties
    String color = "blue";
    int tipSize = 5;

    // set the color
    void setColor(String color) {
        this.color = color;
    }

    // set the tip size of pen
    void setTipSize(int size) {
        tipSize = size;
    }
}
