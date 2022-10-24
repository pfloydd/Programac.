import java.util.Scanner;

public class ConversorMoneda {
    public static void main (String [] args) {
        int menu;
        double pesetas, euros;
        Scanner sc=new Scanner(System.in);
        System.out.println("Si quiere convertir a euros, 1, pesetas 2");
        menu=sc.nextInt();
        if (menu==1) {
            System.out.println("Introduce las pesetas");
            pesetas=sc.nextDouble();
            euros=pesetas/166.386;
            System.out.println("El total de euros son: " + euros + "€");
        }

        else {
            System.out.println("Introduce los euros");
            euros= sc.nextDouble();
            pesetas=euros*166.386;
            System.out.println("El total de pesetas son: " + pesetas + " pesetas");
        }
    }
}
