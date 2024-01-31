import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int temp=1;
        while(n>0){
            temp=n*temp;
            n--;
        }
        System.out.println("Factorial is :" +temp);
    }
}
