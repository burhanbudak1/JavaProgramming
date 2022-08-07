package day14_String;

public class StringMethods1_SubString {
    public static void main(String[] args) {
        String str1 = "      batch 25      ";
        str1 = str1.trim(); // "batch 25"
        System.out.println(str1);

        System.out.println("------------------------------------------------------");

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming language";
        int n3 = str3.indexOf("an");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g ");
        System.out.println("n4 = " + n4);


        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);


        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
        System.out.println("firstA = " + firstA);

        System.out.println("-------------------------------------------------");





















    }
}
