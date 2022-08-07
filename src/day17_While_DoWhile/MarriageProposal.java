package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.err.println("Will you marry me? Yes/No");
        String a = scan.next().toLowerCase();

        while (  !(a.equals("yes") || a.equals("no"))){

            System.err.println("Invalid answeri please re-enter");
            a = scan.next().toLowerCase();

        }



        if(a.equals("yes")){
            System.err.println("Congrats");
        }else {
            System.err.println("Goodbye");
        }

        scan.close();


























    }
}
