import java.io.IOException;
import java.util.Scanner;

public class MayusMinus {
    public static void main (String [] args) throws IOException {
        char car1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce caracter");
        car1=(char) System.in.read();
        if(Character.isUpperCase(car1)){
            System.out.println("Mayúscula");
        }else System.out.println("Minúscula");
    }
}
