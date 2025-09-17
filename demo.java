
import java.util.Scanner;
class animal{
	
	int age = 12;
	animal(String name){
		System.out.println(name);
	}
	void makesound() {
		System.out.println("Animal makes sound");
	}
}
class dog extends animal{
	dog(){
		super ("monkey");
		super.makesound();
		System.out.println("dog");
		System.out.println(super.age);
	}
}
class cat extends animal{
	cat(){
	super ("rabbit");
	super.makesound();
	System.out.println("cat");
	System.out.println(super.age);
	}
}
public class Demo {
	
    public static void main(String args[]) {
    	dog d1 = new dog ();
    	cat c1 = new cat ();
    	
       }
    }



