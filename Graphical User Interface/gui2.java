import javax.swing.*;

public class gui2 extends JFrame  {
    gui2(String s) {
        super(s);
    }
    gui2() {

    }
    void setComponents() {
        JLabel l1 = new JLabel("Welcome");
        JTextField t1 = new JTextField();
        setLayout(null);
        l1.setBounds(200, 100, 100, 30);
        t1.setBounds(200, 200, 100, 30);
        add(l1);
        add(t1);
    }
    public static void main(String[] args) {
        gui2 s  = new gui2("Welcome to Coding Empire");
        s.setVisible(true);
        s.setSize(700, 700);
        s.setComponents();
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
