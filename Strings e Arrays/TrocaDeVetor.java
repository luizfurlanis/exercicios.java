import java.util.Scanner;
import java.io.IOException;

public class TrocaDeVetor {
    public static void main(String[] args) throws IOException {
        int[] array = new int[100000000];
        Scanner teclado = new Scanner(System.in);
        int temp = 0;

        for(int i = 0; i < 20; i++){
            array[i] = teclado.nextInt();
        }

        for(int i = 0; i < 10; i++){
            temp = array[i];
            array[i] = array[19 - i];
            array[19 - i] = temp;
        }

        for(int i = 0; i < 20; i++){
            System.out.println("N[" + i + "] = " + array[i]);
        }

        teclado.close();
    }
}
