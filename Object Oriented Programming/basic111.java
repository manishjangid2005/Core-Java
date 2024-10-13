// Class and object

public class basic111 {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object called constructer
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

/**
 * Pen
 */
class Pen {
    String color;
    int tip;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Percentage {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int math, int chem) {
        percentage = (phy + math + chem) / 3;
    }
}
