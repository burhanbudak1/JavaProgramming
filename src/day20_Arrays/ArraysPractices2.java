package day20_Arrays;

import java.util.Arrays;

public class ArraysPractices2 {
    public static void main(String[] args) {

        char[] letters = new char[26];

        /*
        letters[0] = 'A';
        letters[1] = 'B';
        letter[2] = 'C';
        ....
         */


        for (int i = 0, j= 'A'; i < letters.length; i++, j++) {

            letters[i]= (char) j;
            
        }

        System.out.println("------------------------------");

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {

            letters[i] = ch++;

        }

        System.out.println(Arrays.toString(letters));























    }
}
