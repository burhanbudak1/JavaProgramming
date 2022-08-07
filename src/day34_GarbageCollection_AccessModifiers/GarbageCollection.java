package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day32_Constructor.Car;
import day33_Statics.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {

        String str ="Wooden Spoon";// after here it is eligible for garbage collection.
        str = null;
        System.out.println(str);

        System.out.println("------------------------------");

        Car car1 = new Car("Toyota");
        car1 = null;
        System.out.println(car1);

        System.out.println("----------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 =  new Dog();
        dog1.name = "Max";


        System.out.println(dog1);

        String language = "Python";
        language =  "Java";

        System.out.println(language);

        System.out.println("------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println("---------------------------------------");

        Student student1 = new Student("Tahir", 'M', 30, 12, 'A');
        student1.grade = 'B';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("--------------------------------------------");
















    }
}
