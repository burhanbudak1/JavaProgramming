package day07_Operators;

public class RelationOperators {
    public static void main(String[] args) {
        // All logical operators return Boolean (true or false)
        // >,>=,< , <=

        boolean result1 = 200 > 400; // false
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; // true
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; // true
        System.out.println("result3 = " + result3);

        boolean result4 = 100 < 200;
        System.out.println("result4 = " + result4);

        int score = 59;
        boolean hasFailed = score <= 59;
        System.out.println("hasFailed = " + hasFailed);

        System.out.println("-----------------------------------");

        int x = 100;
        int y = 200;
        boolean equal = x == y; // false
        System.out.println("equal = " + equal);

        boolean result5 = "Muhtar" == "Good Guy"; // false
        System.out.println("result5 = " + result5);

        boolean result6 = 'A' == 'a';
        System.out.println("result6 = " + result6);

        boolean result7 = "Java" == "Java";
        System.out.println("result7 = " + result7);

        System.out.println("---------------------------");

        boolean result8 = 100 != 200; // true
        System.out.println("result8 = " + result8);









    }
}
