package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String str = "I love java, Java is cool";

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {

            result += str.charAt(i);

        }

        System.out.println(result);














    /*Write a program that can reverse a String
        Ex:
        input:
        Wooden Spoon
        output:
        noopS nedooW
/*
     */







    }
}
