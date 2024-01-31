import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter your name");
        String na=n.next();
        System.out.println("Enter your  age");
        int ag=n.nextInt();


        System.out.println("hi" +na + "your age is"+ag);
    }
}
