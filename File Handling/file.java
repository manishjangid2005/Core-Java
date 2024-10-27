import java.io.*;

// We use buffer reader and writer in the place of the file reader and writer and also use close it the file after do any task

public class file {
    public static void main(String[] args) throws Exception{
        System.out.println("File Handling in Java");
        File file = new File("abc.txt");

        // To create a new file
        file.createNewFile(); //Sometimes it shows error so we use execption handling in it 
        // To check the existance of the file
        System.out.println(file.exists());

        // To write in a file
        // FileWriter  fw = new FileWriter(file);
        // BufferedWriter bw = new BufferedWriter(fw);
        // bw.write("Hey I am Manish Jangid");

        // When we write in a file we also need to close a file 
        // fw.close();
        //    or
        // bw.close();

        // To read in a file
        FileReader fr = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(fr);;
        System.out.println(br.readLine());
        br.close();
    }
}