
import java.util.Scanner;
public class demo {
    public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
      int num[]=new int [5];
      for (int i = 0 ;i<5;i++) {
    	num[i]= scan.nextInt();      }
      for (int var:num){
        System.out.println(var);
      }
        }
    }


