import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      int num = scan.nextInt();
      int count =0;
      while (num>0) {
    	  int rem = num%10;
    	  if (rem == 5) {
    		  count++;
    	  }
    	  num = num/10;
      }
      
      System.out.println(count);
         }
}
