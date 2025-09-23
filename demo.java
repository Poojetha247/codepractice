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
        int i=0;
        while(Math.sqrt(c)<=num){
            if (num%c==0){
                System.out.println("Not a prime number");
                i=1;
                break;
            }
            c++;
            
        }
        if(i==0)
        System.out.println("Prime number");
    }
}