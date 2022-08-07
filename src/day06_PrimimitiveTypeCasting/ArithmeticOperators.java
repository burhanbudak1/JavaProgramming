package day06_PrimimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12" + 1); // 121 cancation
        System.out.println(10 + 20); // 30
        System.out.println(100 - 50); // 50
        System.out.println(10 * 6); // 60

        System.out.println(100/3); // 33
        System.out.println(10.0/4); // 2.5
        System.out.println(10/4.0); // 2.5
        System.out.println(10d/4);  // 2.5

        int a = 100;
        double b = a/6; // 16.0
        System.out.println(b);

         double c = (double)a/6;
        System.out.println(c);
         /*
         1. double b = a/6.0;
         2. double b = a/6d;
         3. double b = (double)a/6;
          */





    }


}


/*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division
            in math:
                10/4 = 2.5
                100/3 = 33.3333
            in java:
                10/4= 2
                10.0/4 = 2.5
                100/3 = 33
    %: Remainder
 */