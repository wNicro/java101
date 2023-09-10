import java.sql.SQLOutput;
import java.util.Scanner;
public class AsalSayiBulma {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);

        System.out.print(" Bir Sayi Giriniz : ");
        int n = ipt.nextInt();

        while (n<=1){
            System.out.println("Geçersiz Sayi ! ");
        }
        int sayac=0;

        for(int i =2;i<=n;i++)
        {
            sayac=0;
            for(int k =1; k<=i;k++){
                if(i%k==0){sayac++;}
            }
            if(sayac<=2){
                System.out.print(i+" , ");
            }
        }

    }
}
