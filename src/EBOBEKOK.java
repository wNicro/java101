import java.sql.SQLOutput;
import java.util.Scanner;
public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("1. Sayiyi Giriniz :");
        int n1 = giris.nextInt();
        System.out.print("2. Sayiyi Giriniz : ");
        int n2 = giris.nextInt();

        int ebob = 1;
        int ekok = 1;

        int bSayi=0;
        int kSayi=0;
        if(n1<n2){
            bSayi = n2;
            kSayi = n1;
        }else{
            bSayi = n1;
            kSayi = n2;
        }
        int k = kSayi;
        while(k>=1){
            if( kSayi % k == 0 && bSayi % k ==0){
                ebob = k;
                break;
            }
            k--;
        }
        System.out.println(" Ebob = "+ebob);
        int t= 2;
        while( kSayi*bSayi>=t) {
            if( t % kSayi == 0 && t % bSayi ==0){
                ekok = t;
                break;
            }
            t++;
        }
        System.out.println(" Ekok = "+ekok);
    }
}
