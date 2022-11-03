import java.util.Scanner;

public class ArrayNumerosAleatorios0Al9 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tamaño array");
        int tamanio=sc.nextInt();
        int lista []=new int[tamanio];
        int suma=0;
        for (int i = 0; i <lista.length; i++){
            lista[i]=(int)Math.floor(Math.random()*10);
            System.out.println("El valor es: " + lista[i]);
            suma=suma+lista[i];
            System.out.println("Posición es: " +(i+1));
        }

        System.out.println("La suma es: " + suma);
    }
}
