import java.util.ArrayList;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer>list = new ArrayList <>(10);
	    for(int i= 0; i<10;i++){
            list.add(scan.nextInt());
		}
		for (int i = 0;i<10;i++){
	         System.out.println(list.get(i));
        }	
		list.add (100);
		list.set(1,34);
		list.remove(4);
		System.out.println(list);	
	}
}
 