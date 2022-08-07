package day15_ForLoops;

import java.util.Scanner;

public class StartWithX {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();

        if (word.charAt(0) == 'x'){
            word = word.replace("x", "a");
        }
        System.out.println(word);













    }
}
