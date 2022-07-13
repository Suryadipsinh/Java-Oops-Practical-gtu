import java.util.Date;
import java.util.Scanner;

/*
 Practicle_2: Write a program that solves the following equation and displays the value x and y:
 1) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation
 ax+by=e x=ed-bf/ad-bc
 cx+dy=f y=af-ec/ad-bc )
*/

public class Practical_2 {

    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 2");
        System.out.println("Aim:- Write a program that solves the following equation and displays the value x and y:\n" +
                " 1) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation\n" +
                " ax+by=e x=ed-bf/ad-bc\n" +
                " cx+dy=f y=af-ec/ad-bc )");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        /* Equation-1 */
        System.out.println("Enter values of Equation 1: ");
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of e: ");
        double e = sc.nextDouble();
        System.out.println(a + "x " + " + " + b + "y "+ " = "+ e);

        /* Equation-2 */
        System.out.println("Enter values of Equation 2: ");
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();
        System.out.print("Enter value of d: ");
        double d = sc.nextDouble();
        System.out.print("Enter value of f: ");
        double f = sc.nextDouble();
        System.out.println(c + "x " + d + "y "+ " = "+ f);

        /* Cramer's rule */
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));

        /* Answer printing */
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);

    }
}
