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
    	
    	Teacher.totallesson = 5;
    	
    	Teacher.totallesson = 10;
    	System.out.println(Teacher.totallesson);
       }
    }



