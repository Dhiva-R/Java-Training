import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        while(n>0){
            n=n%10;
            System.out.println(n);
            n=n/10;
        }
    }
}
