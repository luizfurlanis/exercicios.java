import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class ex15 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();
        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.printf("%.4f\n", distancia);
        teclado.close();
    }
}