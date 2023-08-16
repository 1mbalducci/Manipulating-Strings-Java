import java.util.Arrays;
import java.util.List;

public class LongestWordInSentance {

    public static void main (String[] args) {


        String sentance = "One day I will code like a giantest and work with my cousin at Apple.";
        String[] sentanceArray = sentance.split(" ");
        int lengthOfArray=sentanceArray.length;
        String longestWord=sentanceArray[0];
        String smallestWord=sentanceArray[0];

        System.out.println(lengthOfArray);

        for (int i=0; i<lengthOfArray;i++ ) {
            if (sentanceArray[i].length() > longestWord.length()) {
                longestWord = sentanceArray[i];
            }
            else if (sentanceArray[i].length() < smallestWord.length()) {
                    smallestWord= sentanceArray[i];
            }
        }
            System.out.println(longestWord);
            System.out.println(smallestWord);

    }
}