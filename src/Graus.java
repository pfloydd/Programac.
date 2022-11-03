import java.util.Scanner;

public class Graus {
    public static void main (String [] args) {
        double grados, resultado;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduce los grados en centígrados");
        grados=sr.nextDouble();
        resultado=(32 + (9*grados/5));
        System.out.println("Grados son " +resultado);
    }
}
