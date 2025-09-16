import java.util.Scanner;
public class demo {
    int apple_price;
    int apple_count ;
   
    void total_money(int apple_price,int apple_count){
        int total = apple_price*apple_count;
        System.out.println(total);
    }
    public static void main(String args[]) {
       demo d1 = new demo();
       d1.total_money(3,9);
        }
    }


