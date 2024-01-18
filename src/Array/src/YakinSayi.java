public class YakinSayi {

    public static void main(String[] args) {

        int[] list={15,12,22,788,1,-1-778,2,0};
        int girilenSayi=45;

        int min=list[0];
        int max=list[0];
        int farkMax=0;
        int farkMin=0;

        int minS=0;
        int maxS=0;
        for (int i : list) {
            if (i < min) {
                minS = i;
            }
            if (i > max) {
                maxS = i;
            }
        }
        farkMax = maxS-minS;
        farkMin = farkMax;
        for(int i : list)
        {
            if(i>girilenSayi)
            {
                if(farkMax>=(i-girilenSayi)){
                    farkMax = i-girilenSayi;
                    max=i;
                }
            }
            else{
                 if(farkMin>(girilenSayi-i)){
                     farkMin = girilenSayi-i;
                     min=i;
                 }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);


    }
}
