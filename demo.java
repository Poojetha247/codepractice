import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(Math.max(c,Math.max(a,b)));
         }
}



