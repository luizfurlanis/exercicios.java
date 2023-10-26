import java.io.IOException;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        String nome = teclado.nextLine();
        double salarioFixo = teclado.nextDouble();
        double totalVenda = teclado.nextDouble();
        
        double salarioTotal = salarioFixo + totalVenda * 0.15;
        
        System.out.printf("%s/nTOTAL = R$ %.02f\n", nome, salarioTotal);
        teclado.close();
    }
}