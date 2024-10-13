// Access Modifier

public class basic112 {
    public static void main(String[] args) {
        Bankaccount myAcc = new Bankaccount();
        myAcc.username = "Manish Jangid";
        System.out.println(myAcc.username);
        // myAcc.password = "mannu"; It shows error because we not cannot use the private things outside the class
        myAcc.setPassword("abcdefghijklmnopqurestuvwxyz");

    }
} 

class Bankaccount {
    public String username;
    private String password;
    public void setPassword(String pass) { // In this function we can also use defalut as the compare of public void
        password = pass;
    }
}
