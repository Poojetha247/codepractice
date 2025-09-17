import java.util.Scanner;
class person{
	String name;
	person(String name){
		this.name = name;
		System.out.println(name);
	}
	
}
class employee extends person{
	int employeid ;
	employee(){
		super("john");
	}
}

public class Demo {
	
    public static void main(String args[]) {
    	employee e1 = new employee();
    	
       }
    }

