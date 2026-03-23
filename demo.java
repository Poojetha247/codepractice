
import java.util.*;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
	int[] num = {2,4,3,56,78,546};
	int max =Integer.MIN_VALUE;
	for(int x :num){
		 max = Math.max(max,x);
	}
     System.out.println(max);
	
	}
}
 