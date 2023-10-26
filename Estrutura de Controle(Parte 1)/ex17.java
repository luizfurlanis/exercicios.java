import java.io.IOException;
import java.util.Scanner;

public class ex17 {
    public static void main ( String [] agrs ) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int temp = teclado.nextInt();

        double kmhora = teclado.nextDouble();

        double resp = ( temp * kmhora ) / 12;

        System.out.printf("%.03f\n", resp);

        teclado.close();
    }
}