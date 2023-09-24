import java.sql.SQLOutput;
import java.util.Scanner;
public class odevPatika {

    static int func(int sayi,int x,int sayi2){

        System.out.print(sayi +"  ");
        if(sayi<=0){x+=1;}
        if(x==0)
        {
            func(sayi-5,x,sayi2);
        }
        if(x==1)
        {
            if(sayi == sayi2)return 1;
            func(sayi+5,x,sayi2);
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);


        System.out.print("N Sayisi : ");
        int x = ipt.nextInt();
        func(x,0,x);
    }

}
