package day15_ForLoops;

public class StringMethods {
    public static void main(String[] args) {
        String str = "      ";
        boolean r = str.isEmpty();
        System.out.println(r);

        boolean r1 = str.isBlank();

        System.out.println(r1);

        System.out.println("-----------------------------------------------");

        String s1 = "CYDEO",
                s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("-----------------------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);

        System.out.println("-----------------------------------");

        String input1 = "I love jAvA",
                input2 = "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.contains(input2));

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("--------------------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");

        boolean z = a.toLowerCase().startsWith("wooden");

        System.out.println(y);
        System.out.println(x);
        System.out.println(z);






















    }
}
