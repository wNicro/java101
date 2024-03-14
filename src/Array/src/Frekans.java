import  java.util.Arrays;

public class Frekans {
        static boolean ifFind(int[] arr, int value){
            for(int i:arr){
                if(i==value){
                    return true;
                }
            }
            return false;
        }
    public static void main(String[] args) {
        int[] list = {6,2,4,5,4,7,89,98,6,5,43,2,34,5,4,7,8,9,98,48};
        int[] duplicate = new int[list.length];
        int[] dpindex  = new int[list.length];
        int startIndex=0;
        int adetIndex=0;

        for(int i = 0; i < list.length; i++)
            if (!ifFind(duplicate, list[i])) {
                duplicate[startIndex++] = list[i];
            }
        for(int i =0; i< duplicate.length;i++){
            for(int j=0; j<list.length;j++)
                if (duplicate[i] == list[j]) {
                    adetIndex++;
                    dpindex[i] = adetIndex;
                }
            adetIndex=0;
        }
        System.out.println("Tekrar Eden Sayilar");
            for(int i=0; i<duplicate.length;i++){
                if(duplicate[i]!=0) {
                    System.out.println(duplicate[i] + " sayisi " + dpindex[i] + " kere tekrar edildi.");
                }
        }

    }
}
