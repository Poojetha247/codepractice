import java.util.Scanner;
public class demo {
	String name ;
	int age;
	demo(String name , int age ){
		this.name = name ;
		this.age= age;
		System.out.println("heloo");
	}
    public static void main(String args[]) {
    	demo d1 = new demo("john",23);
    	demo d2 = new demo("henry",34);
    	System.out.println(d1.age);
    	System.out.println(d2.name);
        }
    }





