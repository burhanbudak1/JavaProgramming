package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b = 15,
                c = 20;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < c);

        boolean bIsMedian = (b > c && b < c) || (b > a && b < c);

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            System.out.println(a + " is median number");
        }
        if (bIsMedian) {
            System.out.println(b + " is meadian nummber");
        }

        if (cIsMedian) {
            System.out.println(c + " is meadian number");
        }

    }

}