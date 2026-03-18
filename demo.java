
import java.util.*;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
	String  arr = "poojetha";
	char target = 'e';
	boolean ans = linearSearch(arr , target);
	System.out.println(ans);
	}
	static boolean linearSearch(String str, char target){
		if(str.length() == 0){
			return false;
		}
		for (char letter : str.toCharArray())	{
			if (target == letter){
				return true;
			}
		}
	return false;
        
	}
}
 