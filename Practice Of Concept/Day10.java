import java.io.File;
import java.io.IOException;

public class Day10 {
    public static void main(String[] args) {
        try {
            File myObj = new File("Day11.java");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
              } else {
                System.out.println("File already exists.");
              }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
     

    }
}