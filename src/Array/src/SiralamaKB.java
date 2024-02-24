import java.util.Scanner;
import  java.util.Arrays;
public class SiralamaKB {

    static int siralaF (int[] arr){
        int kucukSayi=0;
        int uzunluk = arr.length;
        int[] newArr = new int[arr.length];
        int[] index =new int[arr.length];
        int n=0;
        kucukSayi = arr[0];
        for(int i=0; i<uzunluk;i++){
            for(int j =0; j<uzunluk;j++){
                if(kucukSayi >= arr[j]) {
                    kucukSayi = arr[j];
                }
            }
            newArr[i] = kucukSayi;
        }
    return 0;
    }

    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        System.out.print("Dizinin Boyutu n  : ");
        int n = ipt.nextInt();

        int[] list  = new int[n];
        System.out.println("Dizinin Elemanlarını Giriniz  : ");
        for(int i =0;i<n;i++){
            System.out.print((i+1)+". Elemanı : ");
            list[i] = ipt.nextInt();
            System.out.println(" ");
        }

        Arrays.sort(list);
        System.out.print("Siralama : ");
        for (int eleman : list) {
            System.out.print(eleman + " ");
        }




    }
}
