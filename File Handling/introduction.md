# File Handling in Java

Java provides robust tools for file handling, allowing easy file management and buffered reading/writing. Below are key classes used in file handling.

## 1. File Class
   - **Package**: `java.io`
   - Purpose: Used for creating, deleting, and managing files and directories.
   - Common methods:
     - `createNewFile()`: Creates a new file.
     - `exists()`: Checks if the file or directory exists.
     - `delete()`: Deletes a file or directory.
     - `isDirectory()`, `isFile()`: Checks if it's a directory or file.
     - `list()`: Lists files in a directory.

## 2. Buffered Classes
   Buffered classes enhance efficiency by buffering data during reading and writing operations.

   - **BufferedReader**:
     - Wraps `FileReader` to read text from a file.
     - Common methods:
       - `readLine()`: Reads one line at a time.
       - `close()`: Closes the stream.
   - **BufferedWriter**:
     - Wraps `FileWriter` to write text to a file.
     - Common methods:
       - `write()`: Writes a string to the file.
       - `newLine()`: Adds a new line.
       - `close()`: Closes the stream.

Using these classes simplifies file handling and improves data processing speed.
