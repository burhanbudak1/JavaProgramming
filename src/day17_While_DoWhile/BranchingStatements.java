package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {
        for (char i = 'A'; i <='Z' ; i++) {

            System.err.println(i+" ");

            if (i == 'F'){

                break;
            }
        }

        System.err.println("------------------------");
        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter a number: ");

            int num = scan.nextInt();

            if (num <0){

                break;
            }
        }



        scan.close();



















    }
}
