import java.sql.SQLOutput;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String contra = "paco";
        String user = "";
        int intentos = 1;
        Scanner sc = new Scanner(System.in);
        while (contra.equals(user) == false && intentos < 4) {
            System.out.println("Introduce la contra");
            user = sc.next();
            intentos++;

            if (contra.equals(user) == false) {
                System.out.println("Prueba de nuevo");
            } else System.out.println("Correcto");
            if (intentos > 3) {
                System.out.println("Demasiados intentos");
            }

        }
    }
}