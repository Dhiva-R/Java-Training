import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }

    }
}
