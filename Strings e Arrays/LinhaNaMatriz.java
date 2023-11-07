import java.util.Scanner;
import java.io.IOException;

public class LinhaNaMatriz {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        double[][] matriz = new double[12][12];
        String t = teclado.next();
        int l = teclado.nextInt();
        double resultado1 = 0;
        double resultado2 = 0;

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                matriz[i][j] = teclado.nextDouble();
            }
        }   
        for(int j = 0; j < 12; j++){
            resultado1 += matriz[l][j];
        }   

        resultado2 = resultado1/12;

        if(t == "S"){
            System.out.printf("%.1f", resultado1);
        } else if (t == "M"){
            System.out.printf("%.1f", resultado2);
        } else {
            System.out.println("error");
        }
        teclado.close();
    }
}