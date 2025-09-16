import java.util.Scanner;
public class demo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int num[]= new int [size];
        for (int i = 0;i<size;i++){
            num[i]= scan.nextInt();

        }
        for (int j =0;j<size;j++){
            System.out.println(num[j]);
        }
            
}
}

