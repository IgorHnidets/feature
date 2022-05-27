package First;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "E:\\" + separator + "Input.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
//    File Input.txt is on disk E with text
//            123456, "LG", "Television M156", 800
//            759603, "Apple", "iPhone 11 Pro Max", 1200
//            756662, "Samsung", "A50 smartphone", 450
//            523680, "Tefal", "Opti Grill 125N", 300

