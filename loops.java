import java.util.Scanner;
public class loops{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number:");
       int n = sc.nextInt();
       
       /* my code
       int i=1;
       while (i<11){
            System.out.println(n+ "*"+ i +" = " + n*i);
            i++;
        }
        below code is running in HackerRank
        */
        int i=1;
        while (i<11){
            System.out.println(n+" x "+i+" = "+ n*i);
            i++;
        }
    }
}
    
//=============
        //float x=20;
        //float y=3;
        //float exp= (x*x )- (y*y);
        //System.out.println(exp);
        //=============