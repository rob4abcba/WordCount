import java.io.File;
import java.util.Scanner;

public class GuessMovie {

    public static void main(String [] args) throws Exception {
        File file = new File("MovieListUTF-8.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        int totalWords = 0;
        int lineNum = 0;
        String[] wordArray;
        int wordArrayIndex = 0;


        while(scanner.hasNextLine()) {
            lineNum++;
            String line = scanner.nextLine();
            wordArray = line.split(" ");
            words = line.split(" ").length;
            wordArrayIndex = (int)(Math.random()*words);
            totalWords += line.split(" ").length;
            System.out.println("line"+lineNum+": " + line + " words: " + words + " word"+(wordArrayIndex+1)+": " + wordArray[wordArrayIndex]);
        }

        // System.out.println("The file contains: " + totalWords + " totalWords.");
        System.out.println("The movie list contains: " + totalWords + " totalWords.");


    }
}
