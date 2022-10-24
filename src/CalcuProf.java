import java.util.Scanner;

public class CalcuProf {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        String contraseña="pene";
        String user;
        final int INTENTOS=3;
        boolean acierto=false;
        for (int i=0; i<INTENTOS && !acierto; i++){
            System.out.println("Introduce contra");
            user=sc.next();

            if(contraseña.equals(user)){
                System.out.println("Correcto");
                acierto=true;
            }else System.out.println("Sigue intentando");
        }
    }
}
