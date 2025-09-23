import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        if (num<=1){
            System.out.println("Not a prime ");
            return;
        }
        int c=2;
        
        while(c*c<=num){
            if (num%c==0){
                System.out.println("Not a prime number");
               
                break;
            }
            c++;
            System.out.println("Prime number");
        }
        
        
    }
}