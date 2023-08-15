public class MainClass {

    public static void main(String[] args) {
        StringBuilder sampleSentance = new StringBuilder("One day I will code like the giants and work with my cousin at Apple.");

        sampleSentance.append("If I can build a string! Well, and then there is Python and C#...");
        System.out.println(sampleSentance);

        sampleSentance.reverse();
        System.out.println(sampleSentance);
    }
}
