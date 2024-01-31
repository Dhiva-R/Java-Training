import java.util.Scanner;

public class skipContinue {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        a=sc.nextInt();
        System.out.println("Enter b");
        b=sc.nextInt();

        for(int i=0;i<100;i++){
            if(i==a){
                continue;
            }else if(i==b){
                break;

            }else
                System.out.println(i);
        }
    }
}
