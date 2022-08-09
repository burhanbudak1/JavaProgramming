package day40_FinalKeyWord;

public class FinalVariable {

    final String birthDay;

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;


        final String name;

        name = "Java";

        // name = "C";

        System.out.println(name);

        System.out.println("------------------------");

        FinalVariable obj = new FinalVariable("May/01");

        System.out.println(obj.birthDay);










    }
}
