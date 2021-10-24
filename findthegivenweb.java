import java.util.Scanner;

public class findthegivenweb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (str.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (str.endsWith(".org")) {
            System.out.println("Organizational website");
        } else if (str.endsWith(".in")) {
            System.out.println("indian website");
        }
    }
}
