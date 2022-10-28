import java.util.Scanner;

public class Aray1Al10 {
    public static void main(String[] args) {
        int[] num=new int[10];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int posicionMax=0;
        int posicionMin=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea 10 valores por pantalla");
        for (int i=0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] <= min) {
                min = num[i];
                posicionMin = i+1;
            }
            if (num[i] >= max) {
                max = num[i];
                posicionMax = i + 1;
            }
        }
        System.out.println ("Número máximo: " + max + "\nPosición máxima: " + posicionMax + "\nNúmero mínimo: " + min + "\nPosición mínima: " +posicionMin);
    }
}
