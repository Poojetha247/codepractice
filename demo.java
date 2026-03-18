
import java.util.*;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
	String  arr = "poojetha";
	char target = 'e';
	int ans = linearSearch(arr , target);
	System.out.println(ans);
	}
	static int linearSearch(String str, char target){
		if(str.length() == 0){
			return -1;
		}
		for (int letter :str.charAt[i])	{
			if (target == letter){
				return letter;
			}
		}
	return-1;}
}
 