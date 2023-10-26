import java.util.Scanner;
import java.io.IOException;

public class Combinador {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String []a = new String[50];
        String []b = new String[50];
        String []ab = new String[100];

        for(int i = 0 ; i < 50; i ++){
            a[i] = teclado.nextLine();
            b[i] = teclado.nextLine();
        }

        for(int i = 0; i < 100;i ++){
            ab[i] = a[i] + b[i];
            System.out.println(ab[i]);
        }
        teclado.close();
    }
}

