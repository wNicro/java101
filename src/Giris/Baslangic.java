package Giris;

public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
        {
        System.out.print(array[i] + " ");
        }
        }
public class Baslangic {
    public static void main(String[] args) {

        int[] list = new int[10];
        int[] list2 ={10,20,30,40,50,60,70,80,90,100};

        for(int i =0 ; i<list.length;i++) {
            list[i] = (i * 10) +10;
            System.out.println(list[i]);
            System.out.println(list2[i]);
        }
    }
}
