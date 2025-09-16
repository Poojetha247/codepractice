import java.util.Scanner;
public class demo {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a, int b){
        System.out.println(a-b);
    }
    void mul(int a , int b){
        System.out.println(a*b);
    }
    void div(int a ,int b){
        System.out.println(a/b);
    }
    public static void main(String args[]) {
       demo d1 = new demo();
       d1.sum(34,76);
       d1.sub(98,43);
       d1.mul(54,98);
       d1.div(45,3);
        }
    }


