import java.util.Scanner;

public class MetrosSeg {
    public static void main(String[] args) {
        double velocidad, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce velocidad en Km/h");
        velocidad = sc.nextDouble();
        resultado = velocidad * 1000 / 3600;
        System.out.println("La velocidad es: " + resultado);

    }

}
