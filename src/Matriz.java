public class Matriz {

    public static void main(String[] args) {
        final int filas = 4;
        final int columnas = 5;
        int[][] numero = new int[filas][columnas];
        RellenarMatriz(numero, filas, columnas);
        MostraArrayYSuma(numero, filas, columnas);
    }

    public static void RellenarMatriz(int[][] lista, int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                lista[i][j] =(int)(Math.random()*10);
            }
        }
    }

    public static void MostraArrayYSuma(int[][] lista, int fil, int col) {
        int suma=0;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(lista[i][j] + "\t");
                suma+=lista[i][j];
            }
        }

        System.out.println(suma);
    }

}
