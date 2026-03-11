
import java.util.*;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
	int[] arr = {1,334,56,27,47,89,90};
	reverse(arr);
	System.out.println(Arrays.toString(arr));
	}
	static void reverse(int [] arr ){
		int start= 0;
		int end = arr.length-1;
	    while (start<end){
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
	}
}
 