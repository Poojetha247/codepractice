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
    	Teacher.totallesson = 5;
    	student s2 = new student ();
    	Teacher.totallesson = 10;
    	System.out.println(s1.totallesson);
       }
    }



