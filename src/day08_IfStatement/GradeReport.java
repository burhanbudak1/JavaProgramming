package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        /*
        System.out.println( true == !false); // true
        System.out.println( !true == false);  // false
        System.out.println( !false == true); // true

        System.out.println(!!false); // false
        System.out.println(!!!true); // false
                 */
        int score = 85;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        // boolean b = score >= 80 && !a;
        boolean c = score >= 70 && score <= 79;
        // boolean c = score >= 70 && !a && !b;
        boolean d = score >= 60 && score <= 69;
        // boolean f = !a && !b && !c && !d;
        boolean f = score >= 0 && score <59;

        if(a){
            System.out.println("Excellent");
        }
        if(b){
            System.out.println("Great");
        }
        if(c){
            System.out.println("Good");
        }
        if(d){
            System.out.println("Passed");
        }
        if(f){
            System.out.println("Failed");
        }

    }
}


