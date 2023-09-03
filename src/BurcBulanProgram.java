import java.sql.SQLOutput;
import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {

        int day;
        String mount;
        String burc = "";
        Scanner input = new Scanner(System.in);


        System.out.print("Doğduğunuz Ay : ");

        mount = input.nextLine();
        mount = mount.toLowerCase();
        System.out.print("Doğduğunuz Gün : ");
        day = input.nextInt();

        boolean isError = false;

        if(mount.equals("ocak")) {
            if(day<1 && day>31){isError=true;}
            else{
            if(day>21){
                burc = "KOVA"; //System.out.println("KOVA Burcusun .. !");
            }else{
                burc = "OĞLAK"; //System.out.println("OĞLAK Burcusun .. !");
            }}

        } else if (mount.equals("şubat")) {
            if(day<1 && day>29){isError=true;}
            else{
            if(day>19){
                burc = "BALIK"; //System.out.println("BALIK Burcusun .. !");
            }else{
                burc = "KOVA"; //System.out.println("KOVA Burcusun .. !");
            }}
        }
        else if (mount.equals("mart")) {
            if(day<1 && day>31){isError=true;}
            else{
            if(day>20){
                burc = "KOÇ"; //System.out.println("KOÇ Burcusun .. !");
            }else{
                burc = "BALIK"; //ystem.out.println("BALIK Burcusun .. !");
            }}
        }else if (mount.equals("nisan")) {
            if(day<1 && day>30){isError=true;}
            else{
            if(day>20){
                burc = "BOĞA"; //System.out.println("BOĞA Burcusun .. !");
            }else{
                burc = "KOÇ"; //System.out.println("KOÇ Burcusun .. !");
            }}
        }else if (mount.equals("mayıs")) {
            if(day<1 && day>31){isError=true;}
            else{
            if(day>21){
                burc = "İKİZLER"; //System.out.println("İKİZLER Burcusun .. !");
            }else{
                burc = "BOĞA"; //System.out.println("BOĞA Burcusun .. !");
            }}
        }else if (mount.equals("haziran")) {
            if(day<1 && day>30){isError=true;}
            else{
            if(day>22){
                burc = "ASLAN"; //System.out.println("ASLAN Burcusun .. !");
            }else{
                burc = "İKİZLER"; //System.out.println("İKİZLER Burcusun .. !");
            }}
        }else if (mount.equals("temmuz")) {
            if(day<1 && day>31){isError=true;}
            else{
            if(day>22){
                burc = "ASLAN"; //System.out.println("ASLAN Burcusun .. !");
            }else{
                burc = "ASLAN"; //System.out.println("YENGEÇ Burcusun .. !");
            }}
        }else if (mount.equals("ağustos")) {
            if(day<1 && day>30){isError=true;}
            else{
            if(day>22){
                burc = "BAŞAK"; //System.out.println("BAŞAK Burcusun .. !");
            }else{
                burc = "ASLAN"; //System.out.println("ASLAN Burcusun .. !");
            }}
        }else if (mount.equals("eylül")) {
            if(day<1 && day>31){isError=true;}
            else{
            if(day>22){
                burc = "TERAZİ"; //System.out.println("TERAZİ Burcusun .. !");
            }else{
                burc = "BAŞAK"; //System.out.println("BAŞAK Burcusun .. !");
            }}
        }else if (mount.equals("ekim")) {
            if(day<1 && day>30){isError=true;}
            else{
            if(day>22){
                burc = "AKREP"; //System.out.println("AKREP Burcusun .. !");
            }else{
                burc = "TERAZİ"; //System.out.println("TERAZİ Burcusun .. !");
            }}
        }else if (mount.equals("kasım")) {
            if(day<1 && day>31){isError=true;}
            else{
            if(day>21){
                burc = "YAY"; //System.out.println("YAY Burcusun .. !");
            }else{
                burc = "AKREP"; //System.out.println("AKREP Burcusun .. !");
            }}
        }else if (mount.equals("aralik")) {
            if(day<1 && day>31){isError=true;}
            else{
            if(day>21){
                burc = "OĞLAK"; //System.out.println("OĞLAK Burcusun .. !");
            }else{
                burc = "YAY"; //System.out.println("YAY Burcusun .. !");
            }}
        }
        else {
            isError=true;
        }

        END:
        if(isError == true){
            System.out.print("Doğum Tarihinizde Bir Hata Var..");
        }else{
            System.out.print(burc+"    Burcusun Güzel Burç :)");
        }


    }
}
