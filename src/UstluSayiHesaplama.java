import java.sql.SQLOutput;
import java.util.Scanner;
public class UstluSayiHesaplama {
    public static void main(String[] args) {
        int n,k,t=1;
        Scanner ipt = new Scanner(System.in);
        System.out.print("Üssü alınacak sayi : ");
        n = ipt.nextInt();
        System.out.print("Üs olacak sayi : ");
        k = ipt.nextInt();

        for(int i = 1; i<=k; i++){
            t= t*n;
        }
        System.out.print("Sonuç : "+t);
    }
}
