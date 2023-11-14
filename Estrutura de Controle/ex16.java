import java.io.IOException;
import java.util.Scanner;

public class ex16 {
    public static void main ( String [] agrs ) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int km = teclado.nextInt();

        int min = km * 2;
        
        System.out.println(min + " minutos");

        teclado.close();
    }
}