public class MainClass {

    public static void main(String[] args) {
        StringBuilder sampleSentance = new StringBuilder("One day I will code like the giants and work with my cousin at Apple.");
        //don't forget with StringBuilder to make a new StringBuilder! Can't instantiate like a
        //normal String

        //adds to the end of the string
        sampleSentance.append("If I can build a string! Well, and then there is Python and C#...");

        System.out.println(sampleSentance);

        sampleSentance.reverse();// reverses the string
        System.out.println(sampleSentance);

        sampleSentance.reverse(); // reverse the string back to the original string
        System.out.println(sampleSentance);

        sampleSentance.insert(4,"fine ");// ads "fine at the index of 4
        System.out.println(sampleSentance);
    }
}
