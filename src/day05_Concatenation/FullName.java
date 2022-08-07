package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Burhan";
        String lastName = "Budak";
        int age = 42;
        String jobTitle = "SDET";
        String companyName = "CYDEO";
        String fullName = firstName + " " + lastName;

        // Full name of the person is _____

        System.out.println(fullName + " is " + age + " years old.");

        //Full name is JObTitle + at + CompanyName

        System.out.println(fullName + " is " + jobTitle + " at "
                + companyName);





    }
}
