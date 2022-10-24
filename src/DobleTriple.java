import java.util.Scanner;

public class DobleTriple {
    public static void main (String [] args) {
        int num1, doble, triple;
        Scanner src =new Scanner(System.in);
        System.out.println("Introduce un número");
        num1= src.nextInt();
        doble=num1*2;
        triple=num1*3;
        System.out.println("El doble de tu número es: " + doble + " y el triple es: " + triple);
    }
}
