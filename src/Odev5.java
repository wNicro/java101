import java.sql.SQLOutput;
import java.util.Scanner;
public class Odev5 {
    public static void main(String[] args) {
        double boy,vKitleIndex;
        int kilo;
        Scanner ipt = new Scanner(System.in);

        System.out.print( " Lütfen Boyunuzu (Metre Cinsinden) Giriniz : ");
        boy = ipt.nextDouble();
        System.out.print( " Lütfen Kilonuzu Giriniz :");
        kilo = ipt.nextInt();

        vKitleIndex = kilo / (boy*boy);
        System.out.print(" Vücüt Kitle İndeksiniz : "+vKitleIndex);
    }
}
