import java.sql.SQLOutput;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int N =0;

        while (N<=0) {
            System.out.print(" N değeri Giriniz : ");
            N = ipt.nextInt();
            if(N<=0){
                System.out.println(" Geçersiz Bir N Değeri. ");
            }
        }
        int t=0;
        int k=1;
        int z=0;

        System.out.print(t+" "+k+" ");

        for(int i =0;i<N;i++){
            z = t+k;
            t=k;
            k=z;
            System.out.print(z+" ");

        }

    }
}
