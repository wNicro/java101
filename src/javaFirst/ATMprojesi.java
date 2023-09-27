package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ATMprojesi {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        String userName,password;
        int girisHakki=3;
        double balance=1500;
        int select=99;
        while(girisHakki>0)
        {
            System.out.println("Merhaba,");
            System.out.print("Kullanici Adınızı Giriniz : ");
            userName = ipt.nextLine();
            System.out.print("Paralanızı Giriniz : ");
            password = ipt.nextLine();
            select=99;

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
            while(select !=4){
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = ipt.nextInt();
                switch (select){
                    case 1: {
                        System.out.print(" Yatıracağınız Para Miktari : ");
                        int price = ipt.nextInt();
                        balance+=price;
                        System.out.println("Güncel Bakiyeniz :"+balance);
                        break;
                    }
                    case 2:{
                        System.out.print("Çekmez İstediğiniz Miktar : ");
                        int price = ipt.nextInt();
                        if(price>balance) {
                            System.out.println(" Yeterli paraniz yok.");
                        }else{
                            balance-=price;
                            System.out.println("Güncel Bakiyeniz : "+balance);
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Bakiyeniz :"+balance);
                    }
                }
            }

            }else{
                girisHakki--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (girisHakki == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + girisHakki);
                }
            }
        }

    }
}
