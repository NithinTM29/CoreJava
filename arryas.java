import java.util.Scanner;

public class arryas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st type
        int[] marks = new int[5];
        marks[0] = 99;
        marks[1] = 98;
        marks[2] = 97;
        marks[3] = 96;
        marks[4] = 95;

        // 2nd type
        int[] marks1;
        marks1 = new int[5];
        marks1[1] = 11;
        marks1[2] = 22;

        // 3rd type
        int[] marks2 = { 100, 200, 300, 400, 500 };

        //printing
        System.out.println(marks[0]);
        System.out.println(marks1[1]);
        System.out.println(marks2[3]);


        //1st type
        // extraction using for loop

        for (int i = 0; i < marks.length; i++) {
        System.out.println(marks[i]);
        }

        // 2nd type
        // extraction using each for loop
        for (int element : marks2) { 
            System.out.println(element);
        }
    }

}