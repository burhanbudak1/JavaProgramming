package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("----------------");

        double [] arr2={1.5, 2.5, 3.5, 4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("-----------------");

        char[] arr3= {'A', 'B', 'C', 'D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("------------------");

        String[] arr4 = {"Ali", "Veli", "Burhan", "Hakan"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("-----------------");

        int [] n1 = {10,25,3,69,78,};
        int max1 = ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        System.out.println("-------------------------");

        double[] n2 = {2.5,3.6,7.8,11.9};
        double max2 = ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("---------------");

        int[] a1 = {1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.contains(a1, 6);
        System.out.println("r1 = " + r1);

        System.out.println("----------------------");




    }
}
