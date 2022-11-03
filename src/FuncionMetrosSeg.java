import java.util.Scanner;

public class FuncionMetrosSeg {
    public static void main (String [] args){
        double velocidad;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la velocidad en Km/h");
        velocidad=sc.nextDouble();
        ConversorMetros(velocidad);
    }

    public static void ConversorMetros (double vel){
        double resultado;
        resultado=vel*1000/3600;
        System.out.println("La velocidad es: " + resultado);

    }
}
