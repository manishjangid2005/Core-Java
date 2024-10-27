# Object-Oriented Programming (OOP) in Java: Example Code

This example covers the key OOP principles in Java: **Classes & Objects**, **Inheritance**, **Polymorphism**, **Abstraction**, and **Encapsulation**.

```java
// Base class demonstrating Encapsulation
class Employee {
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters (Encapsulation)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Polymorphism - Method Overloading
    public void work() {
        System.out.println(name + " is working.");
    }

    public void work(int hours) {
        System.out.println(name + " is working for " + hours + " hours.");
    }
}

// Derived class demonstrating Inheritance and Polymorphism (Method Overriding)
class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    // Overriding the work method
    @Override
    public void work() {
        System.out.println(getName() + " is managing the " + department + " department.");
    }
}

// Interface demonstrating Abstraction
interface Project {
    void startProject();
}

// Class implementing the interface
class Developer extends Employee implements Project {
    private String language;

    // Constructor
    public Developer(int id, String name, String language) {
        super(id, name);
        this.language = language;
    }

    // Implementation of abstract method from Project
    @Override
    public void startProject() {
        System.out.println(getName() + " is starting a new project using " + language + ".");
    }

    // Overriding the work method
    @Override
    public void work() {
        System.out.println(getName() + " is coding in " + language + ".");
    }
}

// Main class demonstrating Classes & Objects
public class Main {
    public static void main(String[] args) {
        // Creating objects (Classes & Objects)
        Employee emp = new Employee(101, "Alice");
        emp.work();
        emp.work(5); // Method overloading

        Manager mgr = new Manager(102, "Bob", "Sales");
        mgr.work(); // Method overriding

        Developer dev = new Developer(103, "Charlie", "Java");
        dev.work(); // Method overriding
        dev.startProject(); // Abstraction
    }
}
