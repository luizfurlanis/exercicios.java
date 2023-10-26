import java.io.IOException;
import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int a = teclado.nextInt();
    int b = teclado.nextInt();
    
    System.out.println(a % b == 0 ? "Sao Multiplos" : "Nao sao Multiplos");
    teclado.close();
    }
}