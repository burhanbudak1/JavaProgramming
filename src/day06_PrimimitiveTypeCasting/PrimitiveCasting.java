package day06_PrimimitiveTypeCasting;

public class PrimitiveCasting {
    public static void main(String[] args) {
    // implicit casting
        byte a = 100;
        short b = a;

        // short b = (short)a;

        int c = b;
        // int c = (int)b

        long d = c;
        // long d = (long)c

        float e = d;
        double f = e;


    // Explicit casting
        System.out.println("--------------------");

        int x = 55;
        short y = (short)x;

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j+" : "+k);

        double n = 10.8;
        int s = (int) n;
        System.out.println(n + " : " + s);


        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(s1 + " : " + d1);
        System.out.println("--------------------");

        System.out.println("Result A" + 0 + 1 );








    }
}
