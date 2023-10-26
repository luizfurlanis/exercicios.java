import java.io.IOException;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        
        double triangulo = a * c / 2;
        double circulo = 3.14159 * (c * c);
        double trapezio = (a + b) * c /2;
        double quadrado = b * b;
        double retangulo = a * b;
        
        System.out.printf("TRIANGULO: %.03f\n", triangulo);
        System.out.printf("CIRCULO: %.03f\n", circulo);
        System.out.printf("TRAPEZIO: %.03f\n", trapezio);
        System.out.printf("QUADRADO: %.03f\n", quadrado);
        System.out.printf("RETANGULO: %.03f\n", retangulo);
        teclado.close();
    }
}