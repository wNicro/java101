import java.util.Scanner;

public class Harmonik {

    public static void main(String[] args) {

        double sum =0;
        int n=0;
        System.out.print(" Harmonik Seri N değeri Giriniz : ");
        Scanner har = new Scanner(System.in);
        n = har.nextInt();

        for(int i =1;i<=n;i++) sum += (1.0 / i);
        System.out.println("Harmonik Ortalama  = " + n/sum);



    }

    }
