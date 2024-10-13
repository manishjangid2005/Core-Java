// Getters & Setters
// get = to return the value
// set = to modify the value
// this = this keyword is used to refer to the current object

public class basic113 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);  
        System.out.println(p1.gettip());
    }
}

class Pen {
    private String color;
    private int tip;


    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
