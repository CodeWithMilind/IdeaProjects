package File_Management;

import java.io.File;
import java.io.IOException;

public class Tut111_File {
    public static void main(String[] args) {
        File f = new File("Tut111.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }
}
