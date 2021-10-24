import java.util.*;
public class persentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TMarks = 500;
        System.out.println("Enter the 1st subject marks");
        int sub1 = sc.nextInt();
        System.out.println("Enter the 2st subject marks");
        int sub2 = sc.nextInt();
        System.out.println("Enter the 3st subject marks");
        int sub3 = sc.nextInt();
        System.out.println("Enter the 4st subject marks");
        int sub4 = sc.nextInt();
        System.out.println("Enter the 5st subject marks");
        int sub5 = sc.nextInt();

        float sum = (sub1+sub2+sub3+sub4+sub5);
        float avg = ((sum/TMarks)*100);
        System.out.println(sum);
        System.out.println(avg);
    }

}

