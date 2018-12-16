import java.io.File;
import java.util.Scanner;

public class WordCount {

    public static void main(String [] args) throws Exception {
        File file = new File("ShuoHuangUTF-8.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        int totalWords = 0;


        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            words = line.split(" ").length;
            totalWords += line.split(" ").length;
            System.out.println("line: " + line + " words: " + words);
        }

        // System.out.println("The file contains: " + totalWords + " totalWords.");
        System.out.println("The file contains: " + totalWords + " totalWords.");


    }
}
