

public class demo {
	 int mark;
	 String name;
	
	  demo(int mark,String name) {
		 this.mark =mark;
		 this.name =name;
	 }
    public static void main(String args[]) {
    	demo d1 = new demo (23,"sri");
    	demo d2 = new demo (32,"name");
    	System.out.println(d2.mark);
    	System.out.println(d1.name);
    	System.out.println("abc".split(","));
        
    	}
}
