import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class DiasSemanLaborales {
    public static void main (String [] args){
        int dias;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un día de la semana");
        dias= sc.nextInt();
        switch (dias){
            case 1:
                System.out.println("Laboral");
                break;
            case 2:
                System.out.println("Laboral");
                break;
            case 3:
                System.out.println("Laboral");
                break;
            case 4:
                System.out.println("Laboral");
                break;
            case 5:
                System.out.println("Laboral");
                break;
            case 6:
                System.out.println("No laboral");
                break;
            case 7:
                System.out.println("No laboral");
                break;
            default:
                System.out.println("Escribe otro valor");
                break;
        }
    }
}
