
import java.util.*;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
	int [] arr = {34,67,22,54,97,12,45};
	int target = 54;
	int start = 2;
	int end = 6;
	int ans = linearSearch(arr , target,start,end);
	System.out.println(ans);
	}
	static int linearSearch(int [] arr , int target, int start,int end){
		if(arr.length == 0){
			return -1;
		}
		for (int i = start; i<end;i++)	{
			if (target == arr[i]){
				return i;
			}
		}
	return -1;
        
	}
}
 