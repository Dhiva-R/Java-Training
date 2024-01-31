import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        float a,c;
        double b,r1,r2;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter b:");
        b=sc.nextDouble();
        System.out.println("Enter a");
        a=sc.nextFloat();
        System.out.println("Enter c");
        c=sc.nextFloat();
        double roots = b * b - 4 * a * c;

        if (roots >= 0) {

            double root1 = (-b + Math.sqrt(roots)) / (2 * a);
            double root2 = (-b - Math.sqrt(roots)) / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            System.out.println("The roots are complex");
        }

    }
}
