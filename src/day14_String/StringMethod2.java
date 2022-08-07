package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python"); // Python is fun, I love learning Python
        System.out.println(str2);

        String email = "bbudak035@hotmail.com";
        String email1 = email.replace("hotmail", "gmail");
        System.out.println("email1 = " + email1);

        String sentence = "Java Java Pythom Pythom C# C# C++ C++ Pythom Pythom Pythom Pythom";

        String sentence1 = sentence.replace("Pythom", "");

        System.out.println("sentence1 = " + sentence1);

        String s = "Dog Dog Dog Dog Dog Dog Dog Dog Dog Dog";
        String s1 = s.replace("Dog", "Cat");
        System.out.println("s1 = " + s1);


        String s2 = "C# is fun, C# is cool";

        s2 = s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("a", "e");
        System.out.println("s3 = " + s3);

        System.out.println("-------------------------------------------------");

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);

        String result1 = "Java";
        result1 = result1.replaceFirst("a", "o");
        System.out.println(result1);

        System.out.println("---------------------------------------------------");




























    }
}
