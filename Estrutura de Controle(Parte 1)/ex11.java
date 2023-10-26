import java.io.IOException;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        double raio = teclado.nextDouble();
        
        double volume = (4.0/3) * 3.14159 * (raio * raio * raio);
        
        System.out.printf("VOLUME = %.03f\n", volume);
        teclado.close();
    }
}