import java.util.Scanner;

public class sumOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int temp=0;
        while(n>0){
            temp=temp+n;
            n--;
        }
        System.out.println("Sum of digits:" +temp);
    }
}
