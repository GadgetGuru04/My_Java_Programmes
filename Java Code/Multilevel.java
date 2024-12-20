import java.util.Scanner;

class A{
    static int a = 1;
}
class B extends A{
    static int b = 2;
}
class Multilevel extends B{
    static int c = 3;
  
    public static void main(String[] args){

        System.out.println(a+b+c);
    }
}