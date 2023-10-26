import java.util.Scanner;
import java.io.IOException;

public class LinhaNaMatriz {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        double [][]array = new double[12][12];
        char w = (char)System.in.read();
        array[12][12] = teclado.nextDouble();

        switch (w) {
            case 1:
            break;
            case 2:
            break;
        }
        teclado.close();
    }
}