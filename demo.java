import java.util.Scanner;
public class demo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int evencount = 0;
        int oddcount = 0;
       for (int i = a; i<=b;i++){
        if (i%2==0){
             
            evencount++;
            
        }
        else {
        	oddcount++;
        }
       }
       System.out.println("the even count is :"+ evencount);
       System.out.println("the odd count is :"+ oddcount);
    }
}

