import java.util.ArrayList;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>>list = new ArrayList <>(10);
		for (int i= 0 ;i<10;i++){
			list.add(new ArrayList<>());
		}
		for (int i = 0;i<10;i++){
			for(int j= 0 ;j<10;j++){
				list.get(i).add(scan.nextInt());
			}
		}
		System.out.println(list);
	    
	}
}
 