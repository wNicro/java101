import java.sql.SQLOutput;
import java.util.Scanner;
public class AsalSayi {
    static boolean asalBul(int sayi,int bolen){
        if (sayi < 2) { // sayi 2 den küçükser zaten  asal değildir.
            return false;
        }
        if(bolen>=sayi){// bolen sayiya kadar hiç false döndürmediysedemekki asaldır.
            return true;
        }
        if(sayi % bolen == 0)// sayi bolene tam bölünüyorsa demekki kendisi haricinden bir pozitif tam bölen i vardır
        {
            return false;
        }
        return asalBul(sayi,bolen+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        scanner.close();

        if (asalBul(sayi, 2)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }
}
