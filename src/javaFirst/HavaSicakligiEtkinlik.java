package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class HavaSicakligiEtkinlik {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int heat;

        System.out.print("Hava Sıcakligini Giriniz..");
        heat = inp.nextInt();

        if(heat<5){
            System.out.println("Kayak Yapabilirsin..");
        }else if (heat>=5 && heat <10) {
            System.out.println("Sinema İzle..");
        }else if (heat>=10 && heat <15){
            System.out.println("Sinema yada Piknik yapabilirsin..");
        } else if (heat>=15 && heat<25) {
            System.out.println("Piknik Yapabilirsin.");
        }else if(heat>25){
            System.out.println("Git Yüz Kardes..");
        }

    }
}
