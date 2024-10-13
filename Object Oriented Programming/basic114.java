// Encapsulation
// It is defined as the wrapping up of data and methods under a single unit. It alse implement data hiding.

// Constructors 
// It is a special method which is invoked automaticaly at the time of object creation.
// Properties of the constructor
// Cons have the same name as the class or structure.
// Cons dont't have a return type.(Not even void)
// Cons are only caled once, at object creation.
// Memory allocation happens when constructor is called.


public class basic114 {
    public static void main(String[] args) {
        Student s1 = new Student("Manish");
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;

    Student(String name) {
        // System.out.println();
        this.name = name;
        System.out.println("Coustructor is called...");
    }
}
