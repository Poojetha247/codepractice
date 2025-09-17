import java.util.Scanner;
public class demo {
	String name ;
	int age;
	demo(String a , int b ){
		name = a ;
		age= b;
		System.out.println("heloo");
	}
    public static void main(String args[]) {
    	demo d1 = new demo("john",23);
    	System.out.println(d1.age);
        }
    }




