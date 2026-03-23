
import java.util.*;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
	int [] num = {2,4,3,56,78,546};
	int count =0;
	for(int x: num){
		if(x%2==0){
           count++;
		}
	}
	System.out.println(count);
	}
}
 