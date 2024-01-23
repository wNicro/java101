import  java.util.Arrays;
public class TekrarEdenSayi {
    static boolean ifFinf(int[] arr, int value){
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
        int startIndex=0;
        for(int i = 0; i < list.length; i++){
            for(int j =0; j<list.length;j++){
                if((i!=j) && (list[i]==list[j])){
                    if(list[i] % 2 ==0){
                        if(!ifFinf(duplicate,list[i])){
                            duplicate[startIndex++]=list[i];
                        }
                    }

                }
            }
        }

        for(int value:duplicate){
            if(value!=0){
                System.out.print(value+" - ");
            }
        }
    }
}
