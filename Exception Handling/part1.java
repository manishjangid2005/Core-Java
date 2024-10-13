// Use of throw & throws

import java.util.*;

public class part1 {
    public static void main(String[] args) {
        int cb = 10000; //current balance
        int wb = 4000;  //withdraw balance

        try {
            if (cb<wb) {
                throw new ArithmeticException("Insufficient Balance");
            }
            cb -= wb;
            System.out.println("Transaction Successful");
            System.out.println("Current Balance is " +cb);
        } 
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Current Balance is " +cb);
        }
    }
}
