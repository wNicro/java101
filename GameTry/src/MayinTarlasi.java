import java.util.Scanner;
import java.util.ResourceBundle.Control;
import java.util.Arrays;
import java.util.Random;


class MayinSweeper{
    int row;
    int col;
    String[][] MayinMap;
    String[][] OyunMap;
    int c4_Adet;
    int r;
    int c;
    int count;
    boolean isTrue = true;

    public MayinSweeper(int row, int col)
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
        System.out.println("Mayınlarin Konumları");
        //randomNumber();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (!this.MayinMap[i][j].equals("*")) {
                    this.MayinMap[i][j] = "-";
                }
                 System.out.print(this.MayinMap[i][j] + " ");
            }
             System.out.println();
        }
         //System.out.println("==================================");
         //System.out.println("Welcome to Minesweeper Game!");
    }

    public void printOyunMap(){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                this.OyunMap[i][j] ="-";
                System.out.print(this.OyunMap[i][j]+" ");
            }
        }
    }

    public void control(){
        count=0;
        for(int i=(r-1); i <= (r+1); i++){
            for (int j = (c-1); j <= (c+1); j++) {
                if(i<0 || j<0 || i >= this.row || j >= this.col){
                    continue;
                }
                if(this.MayinMap[i][j].equals("*")){
                    count++;
                }
            }
        }
        this.OyunMap[r][c] = String.valueOf(count);
        this.MayinMap[r][c] = String.valueOf(count);

        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                System.out.print(this.OyunMap[i][j]+" ");
            }
            System.out.println();
        }
    }

    public  boolean finish(){
        int sayac=0;
        for(int i=0; i<this.row;i++){
            for(int j=0; j<this.col;j++){
                if(this.OyunMap[i][j].equals("-")) {
                    sayac++;
                    System.out.println(sayac);
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println(this.row);
                    System.out.println(this.col);
                    return false;
                }
            }
        }
        return true;
    }
    public void ChooseIndex(){
        Scanner sc = new Scanner(System.in);
        isTrue = false;
        while(!isTrue){
            System.out.print("Hadi X Kordinatını Gir : ");
            r = sc.nextInt();
            System.out.print("Şimdide sıra Y de ! : ");
            c = sc.nextInt();

            r-=1; // Normalde matrix 0 dan başlar biz vurada onu 1e eşitliyoruz
            c-=1;

            if(r>row || c>col ){
                System.out.println("Kordinatları fazla girdin galiba heyecanlandın. Sorun yok tekrar dene !");
                continue;
            }
            if(MayinMap[r][c].equals("*")){
                System.out.println("Mayin Patladi Geçmiş Olsun Kaybettin !");
                break;
            }
            control();

            if(finish()){
                System.out.println("Helal Senden beklenmedik performans ! Kazandınn !!");
                break;
            }else{
                System.out.println(" BOŞ");
            }

        }
    }
    public void run(){

        MayinMap();
        randomNumber();
        printMayinMap();
        ChooseIndex();
    }
}


public class MayinTarlasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Satır Numarsı Gir: ");
        int row = sc.nextInt();
        System.out.print("Sütün Numarası Gir ");
        int col = sc.nextInt();
        MayinSweeper mayinSweeper = new MayinSweeper(row,col);
        mayinSweeper.run();
    }
}
