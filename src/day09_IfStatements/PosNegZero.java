package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int n = 100;
        boolean positive = n > 0,
                negative = n < 0,
                zero = n == 0;

        if(positive){
            System.out.println("Positive");
        }
        if(negative){
            System.out.println("Negative");
        }
        if(zero){
            System.out.println("Zero");
        }
        System.out.println("-----------------------------------------");

        if(positive){
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }


    }




}


