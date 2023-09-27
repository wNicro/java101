import java.sql.SQLOutput;
import java.util.Scanner;
public class UstAlma {
    static int ustAl(int t,int n){
        int result=1;

        if(n==0){
            return 1;
        }
        result = ustAl(t,n-1)*t;
        return  result;
    }
    public static void main(String[] args) {

        Scanner ipt = new Scanner(System.in);
        int x=0;
        while(x==0) {
            System.out.print("Taban değeri giriniz : ");
            x = ipt.nextInt();
            System.out.println();
        }
        System.out.print("Üs değerini giriniz  : ");
        int y = ipt.nextInt();

        System.out.println("Sonuç : " + ustAl(x,y));
    }
}
