import javax.swing.*;

public class gui3 extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JButton b1, b2;

    gui3(String s) {
        super(s);
    }
    gui3() {

    }

    void setComponents() {
        l1 = new JLabel("Welcome to my login page");
        l2 = new JLabel("UserName : ");
        l3 = new JLabel("Password");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Login");
        b2 = new JButton("Sign up");
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        l1.setBounds(100, 50, 300, 30);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 350, 100, 30);
        l4.setBounds(100, 550, 100, 30);
        t1.setBounds(350, 200, 100, 30);
        t2.setBounds(350, 350, 100, 30);
        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(400, 450, 100, 30);
    }

    public static void main(String[] args) {
        gui3 s = new gui3("Login Page");
        s.setVisible(true);
        s.setSize(700, 700);
        s.setComponents();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
