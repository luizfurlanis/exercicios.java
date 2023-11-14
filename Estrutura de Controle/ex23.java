import java.util.Scanner;
import java.io.IOException;
import java.lang.Math;

public class ex23{
    public static void main (String [] agrs) throws IOException {
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        
        if(a == 0){
            System.out.println("Impossivel calcular");
        }else if((b * b) - (4 * a * c) < 0){
            System.out.println("Impossivel calcular");
        }else if(((b * b) - Math.sqrt((b * b) - (4 * a * c))) / 2 * a < 0) {
            System.out.printf("R1: %.05f\nR2 = %.05f\n");
        }
        teclado.close();
    }
}