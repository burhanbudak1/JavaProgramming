package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your gender: ");
        String gender = input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName= input.nextLine();

        System.out.println("Enter your phone number: ");
        long phoneNumber = input.nextLong();
        input.nextLine();

        System.out.println("Enter your zip code: ");
        int zipCode = input.nextInt();
        input.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName= input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state name: ");
        String stateName= input.nextLine();

        System.out.println("Enter your buliding number: ");
        int bNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter your street name: ");
        String streetName= input.nextLine();

        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("zipCode = " + zipCode);
        System.out.println("schoolName = " + schoolName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("bNumber = " + bNumber);
        System.out.println("streetName = " + streetName);



        input.close();













    }
}
