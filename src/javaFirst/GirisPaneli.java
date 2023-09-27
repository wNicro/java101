package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class GirisPaneli {
    public static void main(String[] args) {
        String userName,password;
        String controlP;
        int xDeger=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();


        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız..");
        }
        else {
            System.out.println("Bilgileriniz Yanlış..");
            System.out.println("Şifrenizi Sıfırlamak İstermisiniz.. \n 1- Evet \n 2- Hayır");
            xDeger = inp.nextInt();
        }

        if(xDeger==1){
            System.out.print("Yeni Şifrenizi Giriniz .. ");
            controlP = inp.nextLine();
            //xDeger = inp.nextInt();
/*
            if(newPassword.equals("java123")) {
                System.out.print("Şifre Oluşturalamadı.. ");
            }else{
                System.out.print("Şifre Oluşturuldu");
                password=newPassword;
            }*/

        }
    }
}
