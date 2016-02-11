package hackit.upc.edu.presentacio;

import hackit.upc.edu.Exceptions.InvalidFormatException;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader reader = new InputReader(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (InvalidFormatException e) {
            System.out.println("Invalid format exception");
        }
    }
}
