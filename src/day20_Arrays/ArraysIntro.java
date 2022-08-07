package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String [] myGroupe = new String[5]; // 0-4

        myGroupe [0] ="Gunay";
        myGroupe [1] ="Neira";
        myGroupe [2] ="Suat";
        myGroupe [3] ="Hulya";
        myGroupe [4]="Mikael";

        System.out.println(Arrays.toString((myGroupe)));


        System.out.println("---------------------------------------------------------------");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 1;

        if (number <1 || number >7){

            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println( days[number-1] );


















    }
}
