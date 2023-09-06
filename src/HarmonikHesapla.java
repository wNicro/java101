import java.sql.SQLOutput;
import java.util.Scanner;
public class HarmonikHesapla {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int n=0;
        int B=0;

        System.out.print("N sayisini girininiz : ");
        n = ipt.nextInt();

        double result=0;
        for(double i=1;i<=n;i++){
         result += (1/i);
        }
        System.out.print(result);
    }
}
