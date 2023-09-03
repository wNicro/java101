import java.util.Scanner;
public class SayilarıSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,y,z;


        System.out.print("1. Sayiyi Gir..");
        x = inp.nextInt();
        System.out.print("2. Sayiyi Gir ..");
        y = inp.nextInt();
        System.out.print("3. Sayiyi Gir ..");
        z = inp.nextInt();
        if((x>y)&&(x>z)){
            if(y>z){
                System.out.println("x>y>z");
            }
            else{
                System.out.println("x>z>y");
            }
        }else if ((y>x)&&(y>z)){
            if(x>z){
                System.out.println("y>x>z");
            }else{
                System.out.println("y>z>x");
            }
        }else{
            if(x>y){
                System.out.println("z>x>y");
            }else{
                System.out.println("z>y>x");
            }

        }
    }
}
