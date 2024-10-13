// Types of constructor

public class basic115 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Manish Jangid");
        Student s3 = new Student(123);
        // Student s4 = new Student("mannu", 5643); show error 
    }
}

class Student {
    String name;
    int roll;

    Student() { // Non-Parameterized
        System.out.println("Coustructor is called...");
    }
    
    Student(String name) { // Parameterized
        this.name = name;
    }

    Student(int roll) { // Copy Constructor
        this.roll = roll;
    }
}
