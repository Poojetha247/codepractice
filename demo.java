
import java.util.*;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
	int[] arr = {1,334,56,27,47,89,90};
	
	System.out.println(max(arr,1,5));
	}
	static int max(int [] arr , int start, int end){
		if(end<start){
			return -1;
		}
		if (start == end) {
			return arr[start];
		}
		if (arr.length ==0){
			return -1;
		}

		int max = arr[start];
		for (int i = start ; i < end ; i++){
			if (max< arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
}
 