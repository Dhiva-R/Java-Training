import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double b,h;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter b:");
        b=sc.nextInt();
        System.out.println("Enter c");
        h=sc.nextInt();
      double  area=0.5*h*b;
        System.out.println("Area" +area);

    }
}
