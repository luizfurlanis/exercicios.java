import java.io.IOException;
import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    double x = teclado.nextDouble();
    double y = teclado.nextDouble();

    if(x == y && y == 0){
        System.out.println("Origem");
    } else if(x > 0 && y > 0){
        System.out.println("Q1");
    } else if(x < 0 && y > 0){
        System.out.println("Q2");
    } else if(x < 0 && y < 0){
        System.out.println("Q3");
    } else if(x > 0 && y < 0){
        System.out.println("Q4");
    } else if(x == 0 && y != 0){
        System.out.println("Eixo Y");
    } else if(x != 0 && y == 0){
        System.out.println("Eixo X");
    }
    teclado.close();
    }
}