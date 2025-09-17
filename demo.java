import java.util.Scanner;
 class Teacher{
	static int totallesson ;
 }
class student extends Teacher {
	void lesson() {
		System.out.println("2 lesson completed");
	}
}
public class Demo  {
	
    public static void main(String args[]) {
    	student s1 = new student();
    	s1.totallesson = 5;
    	student s2 = new student ();
    	s2.totallesson = 10;
    	System.out.println(s1.totallesson);
       }
    }

