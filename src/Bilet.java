import java.sql.SQLOutput;
import java.util.Scanner;
public class Bilet {
    public static void main(String[] args) {
        int km;
        int age;
        int yolculukTipi;
        int err;
        double tutar;
        Scanner ipt = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = ipt.nextInt();
        if(km < 0){err=1;}
        System.out.print("Yaşınızı giriniz : ");
        age = ipt.nextInt();
        System.out.print("Yolculuk tipini giriniz.(1 = Tek yön / 2= Gidiş Dönüş)  :");
        yolculukTipi = ipt.nextInt();

        if(km < 0  | (yolculukTipi != 1 & yolculukTipi!=2)){
            System.out.println( "Hatalı Veri Girdiniz !");
        }else{
            tutar = km*(0.10);
            if(age<12) {
                tutar = tutar - tutar*(0.5);
            } else if (age>=12 & age<=24) {
                tutar = tutar - tutar*(0.1);
            } else if (age>64) {
                tutar = tutar -tutar*(0.3);
            }
            if(yolculukTipi==2){
                tutar=tutar - tutar*(0.2);
                tutar = tutar*2;
            }
            System.out.println( "Tutar : "+tutar+" TL");
        }


    }
}
