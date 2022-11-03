import java.util.Scanner;

public class FuncionGraus {
    public static void main (String [] args){
        double grados;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce los grados en cenígrados");
        grados=sc.nextDouble();
        CalcularGrados(grados);

    }

    public static void CalcularGrados (double gr){
        double resu;
        resu=(32 + (9*gr/5));
        System.out.println("Resultado es: " + resu);

    }
    
}
