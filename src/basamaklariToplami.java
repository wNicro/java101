import java.sql.SQLOutput;
import java.util.Scanner;
public class basamaklariToplami {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int number=0;
        int basamakAdeti=0;
        int toplam=0;

        System.out.print(" Bir Sayi Giriniz : ");
        number = ipt.nextInt();
        basamakAdeti=number;
        while(basamakAdeti !=0){
            toplam = toplam +basamakAdeti%10;
            basamakAdeti = basamakAdeti/10;
        }
        System.out.print(number+" Sayisiniz Rakamlari Toplami : "+toplam);
    }
}
