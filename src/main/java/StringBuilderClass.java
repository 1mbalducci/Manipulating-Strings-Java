public class StringBuilderClass {

    public static void main(String[] args) {
        int number1 =5;

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

        sampleSentance.replace(34,40,"PROS");// replaces "fine" with "pros"
        // starting at the index of 34 the characters are removed but not the character at 40
        System.out.println(sampleSentance);

        sampleSentance.delete(39,42).insert(39,"&");// deletes "and" add "&"
        // starting at the index of 49 the characters are removed but not the character at 42
        System.out.println(sampleSentance);


        //The capacity() method of StringBuilder class returns the current capacity of the Builder.
        // The default capacity of the Builder is 16. If the number of character increases from its
        // current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your
        // current capacity is 16, it will be (16*2)+2=34.
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2


        sampleSentance.insert(4,number1).insert(5," ");
        System.out.println(sampleSentance);





        }
}
