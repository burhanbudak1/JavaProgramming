package day09_IfStatements;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 75;
        String result = "";

        if (age < 2) {
            System.out.println("Infant");
        } else if (age <= 5) {
            System.out.println("Toddler");
        } else if (age <=9) {
            System.out.println("Kid");
        } else if (age <= 12) {
            System.out.println("Pre-teen");
        } else if (age<=17) {
            System.out.println("Teenager");
        } else if (age<=20) {
            System.out.println("Young Adult");
        } else if (age<=39) {
            System.out.println("Adult");
        } else if (age<=49) {
            System.out.println("Young Middle-Aged Adult");
        } else if (age<=54) {
            System.out.println("Middle-Aged Adult");
        } else if (age<=64) {
            System.out.println("Very Young Senior Citizen");
        } else if (age <=74) {
            System.out.println("Young Senior Citizen");
        } else if (age<=84) {
            System.out.println("Senior Citizen");
        }else {
            System.out.println("Old Senior Citizen");
        }


    }
}
