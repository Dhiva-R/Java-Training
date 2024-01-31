import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        age=sc.nextInt();
        if(age>13 && age<55){
            System.out.println("Young");
        } else if (age>55) {
            System.out.println("Old");
        } else if(age<13){
            System.out.println("child");
        }
    }
}
