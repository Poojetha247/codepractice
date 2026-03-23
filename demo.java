
import java.util.*;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
	String s = "HeLLoWwORlD";
	int count =0;
	for(int c: s.toCharArray()){
		if(Character.isUpperCase(c)){
			count++;
		}

	}
	System.out.println(count);
	}
}
 