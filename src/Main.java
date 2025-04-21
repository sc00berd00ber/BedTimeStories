import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the name of the story you would like to read: ");
            String fileName = input.nextLine();

            try {
                FileInputStream file = new FileInputStream(fileName);
                Scanner fileScanner = new Scanner(file);

                int i = 1;
                while(fileScanner.hasNextLine()){
                    System.out.println(i + ". " + fileScanner.nextLine());
                    i++;
                }
            }catch (FileNotFoundException e){
                System.out.println("File not found!");
            }
    }
}
