import java.util.Scanner;
import java.io.IOException;

public class EncaixaOuNão {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("quantidade de casos:");
        int c = teclado.nextInt();
        String a = new String();
        String b = new String();

        for(int i = 0; i < c; i++){
            a = teclado.next();
            b = teclado.next();

            if(a.endsWith(b)){
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
        teclado.close();
    }
}