public class HelperReversingTheString {

    // Reverse the letters
    // of the word
    static void reverse(char str[], int start, int end)
    {
        // Temporary variable
        // to store character
        char temp;

        while (start <= end) {
            // Swapping the first
            // and last character
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
    // Function to reverse words
    static char[] reverseWords(char[] s)
    {
        // Reversing individual words as

        int start = 0;
        for (int end = 0; end < s.length; end++) {
            // If we see a space, we
            // reverse the previous
            // word (word between
            // the indexes start and end-1
            // i.e., s[start..end-1]
            if (s[end] == ' ') {
                System.out.println("start is:" + start);
                System.out.println("end is:" + end);
                System.out.println(s);
                reverse(s, start, end);
                System.out.println("start is this AFTER the reverse:" + start);
                System.out.println("end is this AFTER the reverse:" + end);
                System.out.println(s);

                start = end + 1;
                System.out.println("start is this after the add:" + start);
            }
        }
        System.out.println("__________________");


        // Reverse the entire String
        System.out.println(s);
        reverse(s, 0, s.length - 1);
        System.out.println(s);
        System.out.println("0000000000000");
        return s;


    }
}
