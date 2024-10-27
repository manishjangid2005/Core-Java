# Object-Oriented Programming (OOP) in Java: Definitions & Example Code

This example covers the fundamental OOP concepts in Java with definitions, details, and a complete code example for **Classes & Objects**, **Inheritance**, **Polymorphism**, **Abstraction**, and **Encapsulation**.

## OOP Concepts Explained
1. **Classes and Objects**
   - **Class**: A blueprint for creating objects. It defines attributes (fields) and behaviors (methods).
   - **Object**: An instance of a class that contains data and uses methods.
   
2. **Encapsulation**
   - The practice of wrapping data (fields) and methods in a single unit (class) and restricting direct access.
   - Achieved by declaring fields as `private` and providing `public` getter and setter methods.
   
3. **Inheritance**
   - Allows a class (subclass) to inherit properties and methods from another class (superclass).
   - Promotes code reuse and establishes a hierarchical relationship.

4. **Polymorphism**
   - Enables methods to have different behaviors in different contexts.
   - **Compile-Time Polymorphism (Method Overloading)**: Multiple methods with the same name but different parameters.
   - **Runtime Polymorphism (Method Overriding)**: A subclass provides a specific implementation of a method declared in its superclass.

5. **Abstraction**
   - Hides implementation details and exposes only essential features.
   - Achieved using abstract classes and interfaces.

## Example Code

```java
// Base class demonstrating Encapsulation
class Employee {
    private int id;               // Encapsulated field
    private String name;          // Encapsulated field

    // Constructor to initialize Employee objects
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter and Setter methods (Encapsulation)
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
    private String department;    // Additional field for Manager class

    // Constructor to initialize Manager objects
    public Manager(int id, String name, String department) {
        super(id, name);          // Calls superclass (Employee) constructor
        this.department = department;
    }

    // Overriding the work method to demonstrate Polymorphism
    @Override
    public void work() {
        System.out.println(getName() + " is managing the " + department + " department.");
    }
}

// Interface demonstrating Abstraction
interface Project {
    void startProject();          // Abstract method to be implemented by classes
}

// Class implementing the interface
class Developer extends Employee implements Project {
    private String language;      // Additional field for Developer class

    // Constructor to initialize Developer objects
    public Developer(int id, String name, String language) {
        super(id, name);          // Calls superclass (Employee) constructor
        this.language = language;
    }

    // Implementation of abstract method from Project interface (Abstraction)
    @Override
    public void startProject() {
        System.out.println(getName() + " is starting a new project using " + language + ".");
    }

    // Overriding the work method to demonstrate Polymorphism
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
        emp.work(5); // Method overloading (Polymorphism)

        Manager mgr = new Manager(102, "Bob", "Sales");
        mgr.work(); // Method overriding (Polymorphism)

        Developer dev = new Developer(103, "Charlie", "Java");
        dev.work(); // Method overriding (Polymorphism)
        dev.startProject(); // Abstraction
    }
}
