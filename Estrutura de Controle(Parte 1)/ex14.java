import java.io.IOException;
import java.util.Scanner;
 
public class ex14 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int km = teclado.nextInt();
        double litros = teclado.nextDouble();
        
        System.out.printf("%.03f km/l\n", km/litros);
        teclado.close();
    }
}