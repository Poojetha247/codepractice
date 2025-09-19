import java.util.Scanner;
public class Demo{
public static void main(String [] args){	
Scanner scan = new Scanner(System.in);	
int n = scan.nextInt();
String[] res = {"even", "odd"};
System.out.println(res[n % 2]);
}
}


