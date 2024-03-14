public class Transpoz {
    public static void main(String[] args) {
        int[][] matris1 = {
                {2, 3, 4},
                {5, 6, 4}
        };
        int[][] matris2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Matris 1:");
        printMatrix(matris1);
        System.out.println("Transpoz 1:");
        printMatrix(transpose(matris1));

        System.out.println("\nMatris 2:");
        printMatrix(matris2);
        System.out.println("Transpoz 2:");
        printMatrix(transpose(matris2));
    }

    // Fonksiyon: Matrisin transpozunu alır
    public static int[][] transpose(int[][] matris) {
        int rows = matris.length;
        int cols = matris[0].length;

        int[][] transpozMatris = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        return transpozMatris;
    }

    // Fonksiyon: Matrisi ekrana yazdırır
    public static void printMatrix(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }
}