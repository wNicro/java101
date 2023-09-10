import java.sql.SQLOutput;
import java.util.Scanner;
public class EnBuyuSayi {
    public static void main(String[] args) {

        Scanner ipt = new Scanner(System.in);
        int n=0;


        System.out.print("Kaç tane sayi Gireceksiniz : ");
        n = ipt.nextInt();


        if (n <= 0) {
            System.out.println("Lütfen pozitif bir sayı girin.");
            return;
        }
        int[] diziAdet= new int[n];

        for(int i =0; i<n;i++){
            System.out.print(i+1+". Sayıyı Giriniz :");
            diziAdet[i] = ipt.nextInt();

        }

        int enbuyuk =diziAdet[0];
        int enkucuk = diziAdet[0];

        for (int i =0; i<n;i++){
            if(enbuyuk <= diziAdet[i]){ enbuyuk = diziAdet[i];}
            if(enkucuk >= diziAdet[i]){ enkucuk = diziAdet[i];}

        }
        System.out.println(" En Büyük Sayi : " + enbuyuk);
        System.out.println(" En Küçük Sayi : "+ enkucuk);
    }
}
