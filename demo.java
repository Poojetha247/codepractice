import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      int ans =0;
      while(true) {
    	  System.out.println("Enter the operator:");
    	  char op = scan.next().trim().charAt(0);
    	  if (op=='+'||op=='-'||op=='/'||op=='*'||op=='%') {
    		  System.out.print("enter num1:");
    		  int num1 = scan.nextInt();
    		  System.out.print("enter num2:");
    		  int num2 = scan.nextInt();
    		  if (op=='+') {
    			  ans=num1+num2;
    		  }
    		  if(op=='-') {
    			  ans=num1-num2;
    		  }
    		  if(op=='*') {
    			  ans=num1*num2;
    		  }
    		  if(op=='/') {
    			  if(num2!=0) {
    			  ans=num1/num2;
    			  }
    		  }
    		  if(op=='%') {
    			  ans=num1%num2;
    		  }
    		  System.out.println(ans);
    	  }
    	  else if(op=='x'||op=='X') {
    		  System.out.println("Existing calculator");
    		  break;
    	  }
    	  else {
    		  System.out.println("invalid operator");
    	  }
      }
     
         }
}
