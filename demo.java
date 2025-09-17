import java.util.Scanner;
public class demo {
    int sum(int a,int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
    int mul(int a , int b){
        return a*b;
    }
    int div(int a ,int b){
        return a/b;
    }
    void add (){
        System.out.println("lorem ipsum");
    }
    public static void main(String args[]) {
       demo d1 = new demo();
       int addition = d1.sum(34,76);
       int subtraction = d1.sub(98,43);
       int multiply = d1.mul(54,98);
       int division = d1.div(45,3);
       System.out.println(addition);
       System.out.println(subtraction);
       System.out.println(multiply);
       System.out.println(division);
       d1.add();
        }
    }


