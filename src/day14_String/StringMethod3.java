package day14_String;

public class StringMethod3 {
    public static void main(String[] args) {
        // substring(beginning index, ending index)
        String word = "Cydeo School";
        String brand = word.substring(0, 4+1);
        System.out.println(brand);

        String str1 = word.substring(6);
        System.out.println(str1);

        System.out.println("------------------------------------------------");
        String word2 = "Java Programming Language";

        String s1= word2.substring(0, word2.indexOf(" ")),
                s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" ")),
                s3 = word2.substring(word2.lastIndexOf(" ")+1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("--------------------------------------------------------");

        String email = "Cydeo.Scholl@gmail.com";
        email = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println(email);




















    }
}
