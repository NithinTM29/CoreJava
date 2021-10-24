import java.util.*;
public class kmtomile {
    public static void main(String[] args) {
        double km, mile , mileval=0.621371;
        Scanner  sc = new Scanner(System.in);
        System.out.println("please enter number to convert mile from km ");
        km = sc.nextDouble();
        System.out.println("the conversion from " + km + " kilometer to mile is " + mileval*km );
    }        
}
