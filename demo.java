import java.util.Scanner;
public class demo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
       int Salary = scan.nextInt();
       int age = scan.nextInt();  
       if (Salary>=20000&& age <= 25){
        int loan = scan.nextInt();
        if (loan<=50000){
            System.out.println("you are eligible for loan");
        }
        else {
            System.out.println("maximum loan amount is 50000");
        }
       }
       else {
        System.out.println("not eligible for loan");
       }  
    }
}
