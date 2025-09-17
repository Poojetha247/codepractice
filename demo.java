
import java.util.Scanner;
class animal{
	String name;
	int age;
	void makesound() {
		System.out.println("Animal makes sound");
	}
}
class dog extends animal{
	String  breed;
	void makesound() {
		System.out.println("dog barks");
	}
	void fetch() {
		System.out .println("dog is fetching");
	}
}
class cat extends animal{
	String color;
	void makesound() {
		System.out.println("cat meows");
	}
	void climb() {
		System.out.println("cat is climbing");
	}
}
public class Demo {
	
    public static void main(String args[]) {
    	dog d1 = new dog ();
    	cat c1 = new cat ();
    	d1.name = "jimmy";
    	d1.age = 3;
    	d1.breed="bull dog";
    	d1.makesound();
    	d1.fetch();
    	c1.makesound();
    	c1.climb();
    	c1.name = "mile";
    	c1.age = 4;
    	c1.color ="black";
    	System.out.println(d1.name);
    	System.out.println(d1.age);
    	System.out.println(d1.breed);
    	System.out.println(c1.name);
    	System.out.println(c1.age);
    	System.out.println(c1.color);
    	
       }
    }



