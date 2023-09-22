import java.sql.SQLOutput;
import java.util.Scanner;
public class FibonacciMed {
    static  int fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int eleman;
        Scanner ipt = new Scanner(System.in);
        System.out.print(" Eleman Sayisi Giriniz : ");
        eleman = ipt.nextInt();
        System.out.println(fib(eleman));

    }
}
