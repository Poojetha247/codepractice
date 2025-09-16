import java.util.Scanner;
public class demo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        if (name.equals("mark")){
            System.out.println("hello mark");
        }
        else{
            System.out.println("who are you?");
        }
    }
}
