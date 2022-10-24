import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
    public static void main (String [] args) throws IOException {
        char calcular;
        double
                num1, num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdudce el primer valor");
        num1= sc.nextInt();
        System.out.println("Inroduce el segundo valor");
        num2= sc.nextInt();
        System.out.println("Introduce el símbolo de la operacion a realizar \n 1. * para multiplicar \n 2./ para dividir\n 3. % para resto");
        calcular=(char)System.in.read();
        switch(calcular){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
            default:
                System.out.println("Introduce un valor correcto");

        }

    }
}
