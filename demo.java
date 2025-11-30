import java.util.Scanner;

public class Demo {

    public static void main(String args[]) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int count = 0;
		while(n>0) {
			int rem = n%10;
			if (rem == 5) {
				count ++;
			}
			n = n/10;
		}
		System.out.println(count);
		    }
    }