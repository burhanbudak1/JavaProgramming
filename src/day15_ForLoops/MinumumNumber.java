package day15_ForLoops;

import java.util.Scanner;

public class MinumumNumber {

    public static void main(String[] args) {

        int min = 2147483647;

        Scanner scan = new Scanner(System.in);

        for (int i = 10; i <15 ; i++) {

            System.out.println("Enter a number:");

            int num = scan.nextInt();

            if (num<min){

                num=min;
            }

        }
        System.out.println("scan = " + scan);

        scan.close();


























    }
}
