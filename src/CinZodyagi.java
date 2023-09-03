import java.sql.SQLOutput;
import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int yil, a;
        String[] zodyag = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        System.out.print("Doğum Yılınızı Giriniz : ");
        yil = ipt.nextInt();

        a = yil % 12;
        System.out.println(zodyag[a]);

    }
}
