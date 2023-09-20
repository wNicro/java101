import java.util.Arrays;
import java.util.Collections;
public class DiziPalindron {
    public static void main(String[] args) {

        int[] dizi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] dizi2;
        int elamansayisi = dizi.length;

        int t=0;
        for(int i =0; i<10;i++){
            t=0;
            for (int j =i;j<elamansayisi;j++){
                if(i==dizi[j]){t++;}
            }
            if(t%2)
        }


    }
}
