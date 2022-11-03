import java.util.Scanner;

public class CircunferenciaFunciones {
    public static void main (String [] args){
        double radio;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el radio");
        radio=sc.nextDouble();
        calculoArea(radio);
        calculoLongi(radio);
    }

    public static void calculoArea(double rad){
        double area;
        area= Math.PI * Math.pow(rad, 2);
        System.out.println("Área: " + area);
    }

    public static void calculoLongi(double rad){
        double longi;
        longi=Math.PI*rad;
        System.out.println("Longitud: " + longi);
    }
}
