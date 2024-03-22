package tryS;

import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {
        String str = "patika";
        char a = 99;

        System.out.println(a);
        System.out.println(str.charAt(1));
        System.out.println(str.concat(".dev"));

        String[] sp = str.split("a");
        System.out.println(Arrays.toString(sp));
    }
}
