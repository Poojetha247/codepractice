
import java.util.*;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
	int n = 34567;
	int sum = 0;
	while(n>0){
		sum+=n%10;
		n= n/10;
	}
	System.out.println(sum);
	}
}
 