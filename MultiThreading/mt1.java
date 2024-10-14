public class mt1 {
    public static void main(String[] args) {
        test t = new test();
        Thread t1 = new Thread(t);
        t1.start();
        for( ; ; ) {
            System.out.println("Hello");
        }
    }
}