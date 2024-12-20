import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        int c;
        FileReader in = null;

        try {
            // Open the file "demo.txt" for reading
            in = new FileReader("demo.txt");
            
            // Read and print characters until the end of the file
            while ((c = in.read()) != -1) {
                System.out.print((char) c); // Cast to char to display the actual character
            }
        } finally {
            // Ensure the FileReader is closed
            if (in != null) {
                in.close();
            }
        }
    }
}
