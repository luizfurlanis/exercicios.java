import java.io.IOException;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int un1 = teclado.nextInt();
        double preco1 = teclado.nextDouble();

        int un2 = teclado.nextInt();
        double preco2 = teclado.nextDouble();
        
        double precoTotal = (un1 * preco1) + (un2 * preco2);
        
        System.out.printf("VALOR A PAGAR: R$ %.02f\n", precoTotal);

        teclado.close();
    }
}