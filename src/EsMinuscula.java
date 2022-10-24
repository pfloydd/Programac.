import java.io.IOException;
import java.util.Scanner;

public class EsMinuscula {
    public static void main (String [] args) throws IOException {
        char car1, car2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un caracter");
        car1= (char)System.in.read();
        System.in.read();
        System.out.println("Introduce otro");
        car2= (char) System.in.read();
        if (Character.isLowerCase(car1) && (Character.isLowerCase(car2))){
            System.out.println("Son minúscula");
        }
            else System.out.println("No son minúscula");

    }
}
