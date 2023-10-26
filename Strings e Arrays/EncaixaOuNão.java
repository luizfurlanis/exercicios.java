import java.util.Scanner;
import java.io.IOException;

public class EncaixaOuNão {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("insira os valores A:");
        int a = teclado.nextInt();
        System.out.println("insira os valores B:");
        int b = teclado.nextInt();
        
        if(a.contains(b)){
            System.out.println("encaixa");
        }else{
            System.out.println("nao encaixa");
        }
        teclado.close();
    }
}