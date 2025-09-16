import java.util.Scanner;
public class demo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
       int Salary = scan.nextInt();
       int age = scan.nextInt();  
       if (Salary>=20000&& age <= 25? true : false){
           System.out.println("eligible for loan");
       }
       else {
        System.out.println("you are not eligible for loan");
       }
    }
}
