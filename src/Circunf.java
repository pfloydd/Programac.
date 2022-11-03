import java.util.Scanner;

public class Circunf {
        public static void main (String[] args) {

            double radio, area, longitud;
            Scanner sc=new Scanner(System.in);
            System.out.print("Introduce radio");
            radio=sc.nextDouble();
            area=Math.PI*Math.pow(radio,2);
            longitud=Math.PI*radio;
            System.out.println("Area circ es:" + area);
            System.out.println("Longitud es: " + longitud);

        }
}
