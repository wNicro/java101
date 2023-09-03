import java.sql.SQLOutput;
import java.util.Scanner;
public class HesapMakinasi {
    public static void main(String[] args) {
        int n1, n2,select;

        Scanner ipt =new Scanner(System.in);
        System.out.print("İlk Sayisini Giriniz :");
        n1 = ipt.nextInt();
        System.out.print("İkinci Sayisini Giriniz :");
        n2 = ipt.nextInt();

        System.out.println(" 1- Toplama \n 2- Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.print("Seçiniz...    ");
        select = ipt.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplam :"+(n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma :"+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpma :"+(n1*n2));
                break;
            case 4:
                if(n2!=0) {
                    System.out.print("Bölme :" + (n1 / n2));
                }
                else{
                    System.out.print("Bir sayi 0'a Bölünemez..");
                }
                break;
            default:
                System.out.println("Doğru değer girmediniz..");

        }
    }
}
