import java.util.Scanner;

public class NotasValor {
    public static void main (String [] args){
        int nota;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu nota numérica");
        nota= sc.nextInt();
        switch (nota){
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable bajo");
                break;
            case 8:
                System.out.println("Notable alto");
                break;
            case 9:
                System.out.println("Excelente");
                break;
            case 10:
                System.out.println("Matrícula de honor");
                break;
            case 1, 2, 3, 4:
                System.out.println("Suspenso");
                break;

            default:
                System.out.println("Valor incorrecto");
                break;
        }
    }
}
