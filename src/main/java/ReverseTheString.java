import java.util.Arrays;

public class ReverseTheString {
    public static void main(String[] args){
        String s = "I like this program very much ";
        char [] charArray= s.toCharArray();
        // Function call
        char[] p = HelperReversingTheString.reverseWords(charArray);
        System.out.print(p);

        System.out.print("________________________");

        String temp;
        String word="babys are small people";
        String[] babyChar= word.split(" ");
        int start =0;
        int end=babyChar.length-1;

        while (start <= end) {
            // Swapping the first
            // and last character
            temp = babyChar[start];
            babyChar[start] = babyChar[end];
            babyChar[end] = temp;
            System.out.println(Arrays.toString(babyChar));
            start++;
            end--;
        }

        StringBuilder newString= new StringBuilder();

        for (String theWord :babyChar){
            newString.append(theWord).append(" ");
        }

        System.out.println(newString);














    }
}







