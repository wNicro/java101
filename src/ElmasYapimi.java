import java.util.Scanner;

public class ElmasYapimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasın yüksekliğini Tek Sayi girin: ");
        int n = scanner.nextInt();

        while(n %2 ==0){
            System.out.print("Elmasın yüksekliğini Tek Sayi girin: ");
            n = scanner.nextInt();
        }

int orta = n/2;

        for(int i= 1; i<=orta+1;i++)
        {
            for(int j=1; j<=((orta+1)-i);j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1 ;k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int a=1; a<=orta;a++){
            for(int b=1; b<=a;b++ ) {
                System.out.print(" ");
            }
            for(int c=1;c<= (2*orta+1)-(2*a);c++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
