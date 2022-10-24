import java.io.IOException;
import java.util.Scanner;

public class ComparadorCaracteres {
    public static void main(String[] args) throws IOException {
        char car1, car2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un caracter");
        car1= (char) System.in.read();
        System.in.read();
        System.out.println("Introduce otro");
        car2= (char) System.in.read();
        if (car1==car2){
            System.out.println("Son iguales");
        } else System.out.println("Son diferentes");

    }
}

