import java.util.Scanner;

public class Areas {
    public static void main (String [] args) {
        double base, altura, resultado;
        int menu;
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Si quieres cuadrado\n2. Si quieres triángulo\n3. Si quieres pentágono");
        menu= sc.nextInt();
        if (menu==1) {
            System.out.println("Introduce un lado");
            base=sc.nextDouble();
            resultado=base*base;
            System.out.println("El área es: " + resultado);
        }
        else if (menu==2) {
            System.out.println("Introduce base");
            base=sc.nextDouble();
            System.out.println("Introduce altura");
            altura= sc.nextDouble();
            resultado=base*altura/2;
            System.out.println("El área es: " + resultado);
        }
        else {
            System.out.println("Introduce base");
            base=sc.nextDouble();
            System.out.println("Introduce apotema");
            altura= sc.nextDouble();
            resultado=(5*base*altura)/2;
            System.out.println("El área es: " + resultado);
        }
    }
}
