package day23_CustomMethods_Void;

public class CustomMethodWithParameters {

    public static void main(String[] args) {

        oddOrEven(15);

        System.out.println("------------------------------------");

        ageOfPerson(1980);

    }

    public static void oddOrEven(int number){

        if (number %2 == 0){

            System.out.println(number + " is even number");
        }else {

            System.out.println(number + " is odd number");
        }


    }


    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;
        System.out.println("Your age is: "+ age );

    }


    public static void printNumbers(int x, int y){



    }

















}
