import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.time.LocalDate; // import the LocalDate class
import java.time.format.DateTimeFormatter;


public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("streak.txt");
      LocalDate dato = LocalDate.now();
      DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      String formattedDate = dato.format(myFormatObj);
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.write(formattedDate);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}