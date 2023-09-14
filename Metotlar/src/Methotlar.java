
import java.sql.SQLOutput;
import java.util.Scanner;
public class Methotlar {
    static int fac(int x){
        int result;
        if(x==1){
            return 1;
        }
        result = fac(x-1)*x;

        return result;

    }
    public static void main(String[] args) {


        System.out.println(fac(10));
    }
}
