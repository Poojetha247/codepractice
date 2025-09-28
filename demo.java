import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the celcius:");
        float tempC = scanner.nextFloat();
        float tempF = (tempC *9/5)+32;
        System.out.println(tempF);
        
        }
}