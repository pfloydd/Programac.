public class DosMatricesSumadas {
    public static void main(String[] args) {
        final int FILA = 5;
        final int COLUMNA = 5;
        int[][] numero1 = new int[FILA][COLUMNA];
        int[][] numero2 = new int[FILA][COLUMNA];
        int[][] numero3 = new int[FILA][COLUMNA];
        RellenarMatriz(numero1, FILA, COLUMNA);
        RellenarMatriz(numero2, FILA, COLUMNA);
        SumarMatrices(numero1, numero2, numero3, FILA, COLUMNA);
        MostrarMatrizFinal(numero1, FILA, COLUMNA);
        MostrarMatrizFinal(numero2, FILA, COLUMNA);
    }

    public static void RellenarMatriz(int[][] num1, int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; i++) {
                num1[i][j] = (int) (Math.random() * 100);

            }
        }
    }

    public static void SumarMatrices(int[][] num1, int[][] num2, int[][] num3, int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; i++) {
                num3[i][j] = num1[i][j] + num2[i][j];
            }

        }
    }

    public static void MostrarMatrizFinal(int[][] num3, int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num3[i][j] + "\t");
            }
        }

    }
}
