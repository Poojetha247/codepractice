import java.util.Scanner;
public class demo {
    int apple_price= 20;
    int apple_count = 10;
   
    void total_money(){
        int total = apple_price*apple_count;
        System.out.println(total);
    }
    public static void main(String args[]) {
       demo d1 = new demo();
       d1.total_money();
        }
    }


