# Exception Handling in Java

Java provides structured exception handling to manage runtime errors, ensuring smoother execution and enhanced code reliability.

## 1. Basics of Exception Handling
   - **Exception**: An event that disrupts the normal flow of a program.
   - **Hierarchy**:
     - `Throwable` (base class)
       - `Exception` (recoverable issues)
       - `Error` (unrecoverable issues)

## 2. Types of Exceptions
   - **Checked Exceptions**: Checked at compile-time, e.g., `IOException`, `SQLException`.
   - **Unchecked Exceptions**: Checked at runtime, e.g., `ArithmeticException`, `NullPointerException`.
   - **Errors**: Represent serious issues, e.g., `OutOfMemoryError`.

## 3. Exception Handling Keywords
   - `try`: Block of code where an exception may occur.
   - `catch`: Block to handle the exception.
   - `finally`: Block that executes regardless of whether an exception occurs.
   - `throw`: Used to explicitly throw an exception.
   - `throws`: Declares an exception in the method signature.

## 4. Common Examples
   - **Try-Catch Block**:
     ```java
     try {
         int result = 10 / 0; // may throw ArithmeticException
     } catch (ArithmeticException e) {
         System.out.println("Cannot divide by zero: " + e);
     }
     ```
   - **Finally Block**:
     ```java
     try {
         int[] numbers = {1, 2, 3};
         System.out.println(numbers[5]); // may throw ArrayIndexOutOfBoundsException
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Index is out of bounds: " + e);
     } finally {
         System.out.println("This will always execute.");
     }
     ```
   - **Throwing an Exception**:
     ```java
     public void checkAge(int age) {
         if (age < 18) {
             throw new ArithmeticException("Not eligible to vote");
         }
     }
     ```

## 5. Best Practices
   - Catch specific exceptions rather than a generic `Exception`.
   - Always include a `finally` block for resource cleanup.
   - Avoid handling `Errors` unless absolutely necessary.

Exception handling in Java helps maintain code flow and manage unexpected conditions effectively.
