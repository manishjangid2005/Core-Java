// Use can use multiple catch with a single try statement 

import java.util.*;

public class basic {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        }
        catch(NullPointerException n1) {
            System.out.println(n1.getMessage());
        } 
        System.out.println("a");
        try {
            System.out.println(5/0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());// TODO: handle exception
        }
        System.out.println("b");
    }
}