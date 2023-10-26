import java.util.Scanner;
import java.io.IOException;

public class ex21 {
    public static void main (String [] agrs) throws IOException{
        Scanner teclado = new Scanner(System.in);
        double quant1 = teclado.nextDouble();
        int n100;
        int n50;
        int n20;
        int n10;
        int n5;
        int n2;
        int n1;

        n100 = quant1 / 100;
        n50 = (quant1 % 100) / 50;
        n20 = (quant1 % 50) / 20;
        int quant2 = quant1 % 50;
        n10 = (quant2 % 20) / 10;
        n5 = (quant1 % 10) / 5;
        n2 = (quant1 % 5) / 2;
        quant2 = quant1 % 5;
        n1 = (quant2 % 2);
        int n05 = (quant1 % 1) / 0.5;
        int n025 = (quant1 % 0.5) / 0.25;
        int n01 = (qunat1 % 0.25) / 0.1;
        quant2 = quant1 % 0.25;
        int n005 = (quant2 % 0.1) / 0.05;
        int n001 = (quant2 % 0.05);

        System.out.printf("NOTAS:\n%d nota(s) de R$ 100.00\n%d nota(s) de R$ 50.00\n%d nota(s) de R$ 20.00\n%d nota(s) de R$ 10.00\n%d nota(s) de R$ 5.00\n%d nota(s) de R$ 2.00\nMOEDAS:\n%d moeda(s) de R$ 1.00\n%d moeda(s) de R$ 0.50\n%d moeda(s) de R$ 0.25\n%d moeda(s) de R$ 0.10\n%d moeda(s) de R$ 0.05\n%d moeda(s) de R$ 0.01\n", n100, n50, n20, n10, n5, n2, n1, n05, n025, n01, n005, n001);
    }
}