package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] groupe1={"Ali", "Layan", "Aysenur" };
        String[] groupe2={"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String [] students = new String[groupe1.length + groupe2.length];

        int i =0;

        for (String each : groupe1) {
            students[i++]= each;
        }

        for (String each : groupe2) {
            students[i++]= each;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("--------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j++]= ch;

        }

        for (char ch : ch2) {
            chars[j++]= ch;

        }

        System.out.println(Arrays.toString(chars));























    }
}
