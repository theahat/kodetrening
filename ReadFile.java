import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("input.txt");
        Scanner in = new Scanner(inputFile);
        while (in.hasNext()){
            String name = in.nextLine();
            System.out.println(name);
        }
        in.close();

        PrintWriter out = new PrintWriter("output.txt");
        out.println("Hello, World");
        out.close();
    }
}
