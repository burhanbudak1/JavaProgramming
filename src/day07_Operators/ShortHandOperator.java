package day07_Operators;

public class ShortHandOperator {
    public static void main(String[] args) {
        String word = "Java Proğramming";

        System.out.println("word = " + word);

        word = "Wooden Spoon"; // = means Assignment

        System.out.println("word = " + word);


        System.out.println("--------------------------------");

        //Addition aasignment

        int x = 100;
        System.out.println("x = " + x);

        System.out.println(x + 200);

        System.out.println("x = " + x);

        // x = x + 200;

        x += 200;
        System.out.println("x = " + x);

        String str = "Wooden";
        
        str += " Spoon";
        System.out.println("str = " + str);

        double num1= 2.5;
        System.out.println("num1 = " + num1);

        num1 += 5.5;
        System.out.println("num1 = " + num1);
        
        
        double avilableBalance = 1000.5;
        
        // deposit 300$
        
        avilableBalance += 300;

        System.out.println("avilableBalance = " + avilableBalance);

        System.out.println("------------------------");

        // withsrawing 500$

        avilableBalance -= 500;

        System.out.println("avilableBalance = " + avilableBalance);
        
        // withdrawing 200$, then depositing 400$
        
        avilableBalance -= 200;
        avilableBalance += 400;
        System.out.println("avilableBalance = " + avilableBalance);

        System.out.println("----------------------------");

        // Multipication assignment

        double salary = 50000.50;
        salary *= 2;
        System.out.println("salary = " + salary);

        System.out.println("--------------------");

        // Division assignment

        double num2 = 25000.0;
        num2 /=2;
        System.out.println("num2 = " + num2);

        System.out.println("------------");

        // remainder assignment

        double num3 = 100;

        num3 %= 3;
        System.out.println("num3 = " + num3);

        System.out.println("-----------------------------");
        int amount = 127; // cents

        int quarters = amount / 25;
        int cent = amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cent = " + cent);


        System.out.println("-----------------------------");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);






    }
}
