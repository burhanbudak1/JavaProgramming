package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1 = 400,
                n2 = 200;

        boolean n1IsMin = n1 < n2,
                n2IsMin = n2 < n1,
                equel = n1 == n2;

        if(n1IsMin){
            System.out.println(n1 + " is the minimum number");
        }
        if(n2IsMin){
            System.out.println(n2 + " is the minimum number");
        }
        if(equel){
            System.out.println(n1 + " is equel to "+ n2);
        }


    }

}
