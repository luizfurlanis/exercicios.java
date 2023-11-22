import java.util.Scanner;
import java.io.IOException;

public class Combinador {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String c = teclado.nextLine();
        String g = teclado.nextLine();

        char[] e = c.toCharArray();
        char[] w = g.toCharArray();

        for(int i = 0; i < 100;i ++){
            System.out.println(e[i] + w[i]);
        }
        teclado.close();
    }
}

