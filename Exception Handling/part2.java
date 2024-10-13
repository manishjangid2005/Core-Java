import java.io.IOException;
import java.util.*;

public class part2 {
    public static void main(String[] args) {
        System.out.println("A");
        try {
            throw new IOException("Printer not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());// TODO: handle exception
        }
        
    }
}
