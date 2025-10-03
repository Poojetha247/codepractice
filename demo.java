import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      int num = scan.nextInt();
      int ans = 0;
      while (num>0) {
    	  int rem = num%10;
    	  ans = ans *10+rem;
    	  num = num/10;
      }
      
      System.out.println(ans);
         }
}
