
import java.util.*;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
	int[] arr = {1,334,56,27,47,89,90};
	int target = 27;
	int ans = linearSearch(arr , target);
	System.out.println(ans);
	}
	static int linearSearch(int [] arr ,int target){
		if (arr.length ==0){
			return -1;
		}
		for (int element : arr){
			if(element == target){
				return element;
			}
		}
		return -1;
	}
}
 