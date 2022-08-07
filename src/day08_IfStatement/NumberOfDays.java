package day08_IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 5;

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31Days = !has28Days && !has30Days;

        if(has28Days){
            System.out.println("28 days");
        }
        if (has30Days){
            System.out.println("30 days");
        }
        if (has31Days){
            System.out.println("31 days");
        }
    }

    public static class MaxNumber {
        public static void main(String[] args) {
            int n1 = 100,
                    n2 = 200;

            boolean n1IsMax = n1 > n2,
                    n2IsMax = n2 > n1,
                    equel = n1 == n2;
            if(n1IsMax){
                System.out.println(n1 + " is maximum");
            } else if (n2IsMax) {
                System.out.println(n2 + " is maximum");
            }else {
                System.out.println(n1 + " is equel to " + n2);
            }


        }



    }
}
