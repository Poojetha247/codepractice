import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        char c = scan.next().trim().charAt(0);
        if (c>= 'a'&& c<='z') {
        	System.out.println("lowercase");
        }else {
        	System.out.println("uppercase");
        }
         }
}
