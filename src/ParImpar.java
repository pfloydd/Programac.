import java.util.Scanner;

public class ParImpar {
    public static void main (String [] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número");
        num= sc.nextInt();
        if (num%2==0){
            System.out.println("Número par");
        }
        else{
            System.out.println("Impar");
        }
    }
}
