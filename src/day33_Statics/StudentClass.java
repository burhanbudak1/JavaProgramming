package day33_Statics;

import java.util.Arrays;

public class StudentClass {
    public static void main(String[] args) {

        Student student1 = new Student("Burhan");
        System.out.println(student1);

        Student student2= new Student("Ülkü", 'F');

        Student student3 = new Student("Doğu", 11);

        Student student4= new Student("Momo", 11, 'A');

        Student student5 = new Student("Öykü", 'F', 7);

        Student student6 = new Student("Pervin", 'F', 32, 32);

        Student student7= new Student("Necla", 'F', 55, 33, 'B');

        System.out.println(student1==student2);


        Student [] students = {student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));








    }
}
