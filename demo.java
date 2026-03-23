
import java.util.*;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
	String name = "poojetha";
	int count = 0;
	for(char c : name.toCharArray()){
		if("aeiou".indexOf(c) != -1){
			count++;
		}
	}
	System.out.println(count);
	}
}
 