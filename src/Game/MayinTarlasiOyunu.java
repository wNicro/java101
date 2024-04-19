package Game;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasiOyunu {
    int row;
    int col;
    String[][] MayinMap;
    String[][] OyunMap;
    int c4_Adet;
    int r;
    int c;
    int count;
    boolean isTrue = true;

    public MayinTarlasiOyunu(int row, int col)
    {
        this.row =row;
        this.col=col;
        this.OyunMap = new String[row][col];
        this.MayinMap = new String[row][col];
        this.c4_Adet  = (row * col)/4;
    }

    //    Mayinların Matrisini Çizgi İle doldurduk
    public void MayinMap(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                MayinMap[i][j] = "-";
                OyunMap[i][j] = "-";
            }
        }
    }
    //Bu kod parçası, Mayın Tarlası oyununda mayınları rastgele yerleştirmeyi sağlar.
    public void randomNumber(){
        Random r = new Random();
        for(int i=0;i<this.c4_Adet;i++){
            int r_col = r.nextInt(this.row);
            int r_row = r.nextInt(this.col);
            if(!this.MayinMap[r_row][r_col].equals("*")){
                this.MayinMap[r_row][r_col] = "*";
            }
        }
    }
    // Mayinların yerlerini görmek için;
    public void printMayinMap() {
        //  System.out.println("Location of Mines");
        randomNumber();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (!this.MayinMap[i][j].equals("*")) {
                    this.MayinMap[i][j] = "-";
                }
                // System.out.print(this.MineMap[i][j] + " ");
            }
            // System.out.println();
        }
        // System.out.println("==================================");
        // System.out.println("Welcome to Minesweeper Game!");
    }




    public void run(){
        //MineMap();
        //printMineMap();
        //ChooseIndex();
    }






}
