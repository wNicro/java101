import  java.util.Arrays;
public class Main {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] reverse(int[] list)
    {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
        {
            result[j] = list[i];
        }

        return result;
    }
    public static void main(String[] args) {

       /* int[] list = {10,20,30,40,50,60,70,80,90,100};
        int[] newListe = reverse(list);
        //printArray(newListe);

        String[] weekDays = new String[] { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

        int[] liste = new int[5];

        int[][] matris = new int[6][6];

        int[][] uzaklik ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        int[] list2 = {1,2,3,4,5,6,7,8,9,10};
Arrays.fill(list2,10);
        System.out.println(Arrays.toString(list2));*/

        int[] list = {15,2,5,7,32,5,3};
        int sum =0;


        for(int i =0; i<list.length;i++){
             sum +=list[i];
        }
        double avarage = (double) sum /list.length;
        System.out.println(avarage);



    }
}