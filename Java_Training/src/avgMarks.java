import java.util.Scanner;

public class avgMarks {
    public static void main(String[] args) {
        int firstMark,secondMark,thirdMark;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mark 1:");
        firstMark=sc.nextInt();
        System.out.println("Enter mark 2:");
        secondMark=sc.nextInt();
        System.out.println("Enter mark 3:");
        thirdMark=sc.nextInt();
        int avg=(firstMark+secondMark+thirdMark)/3;

        if(avg>=70){
            System.out.println("Grade A");
        }else if (avg>=60&&avg<=69){
            System.out.println("Grade B");
        }
        else if (avg>=50&&avg<=59){
            System.out.println("Grade C");
        }
        else if (avg>=40&&avg<=49){
            System.out.println("Grade D");
        }
        else if (avg<40){
            System.out.println("Grade E");
        }
    }
}
