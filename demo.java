import java.util.Scanner;
abstract class vehicle {
	abstract void speed () ;
	void brand() {
		System.out.println("wert");
	}
}
class bike extends vehicle{
	void speed() {
		System.out.println("1233");
	}
}
public class Demo {
	
    public static void main(String args[]) {
    	bike b1 = new bike();
    	b1.speed();
    	b1.brand();
       }
    }

