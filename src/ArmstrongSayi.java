import java.sql.SQLOutput;
import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int number = ipt.nextInt();
        int basamakSayisi=0;
        int basamak=0;
        int kalan=0;
        int toplam=0;
        int carpim=0;


        basamakSayisi = number;
        while(basamakSayisi !=0) {
          basamakSayisi = basamakSayisi/10;
          basamak++;
        }
        int tempNumber = number;
        while(tempNumber!=0){
            kalan = tempNumber % 10;
            tempNumber = tempNumber/10;
            carpim = 1;
            for(int i =1; i<=basamak;i++){
                carpim *=kalan;
            }
            toplam = toplam+carpim;
        }

        if (toplam == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }

    }
}
