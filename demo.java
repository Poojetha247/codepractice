
class vehicle{
	String brand ;
	int year;
	void startengine(){
		System.out.println("engine is stared");
	}
}
class car extends vehicle{
	String feild_type ;
	void startengine() {
		System.out.println("car engine started");
	}
    void drive() {
    	System.out.println("car is driving");
    }
}

class truck extends vehicle{
    int loadcapacity ;
    void startenging() {
    	System.out.println("truck engine started");
    }
    void haul() {
    	System.out.println("truck is hauling");
    }
}
public class Demo {
	
    public static void main(String args[]) {
    	truck t1 = new truck ();
    	car c1 = new car ();
    	t1.startengine();
    	t1.haul();
    	c1.startengine();
    	c1.drive();
    	
    	System.out.println(t1.brand= "werr");
    	System.out.println(t1.year =23);
    	System.out.println(t1.loadcapacity =345);
    	System.out.println(c1.brand = "xyz");
    	System.out.println(c1.year = 34);
    	System.out.println(c1.feild_type ="fef");
    	
       }
    }



