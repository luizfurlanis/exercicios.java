import java.io.IOException;
import java.util.Scanner;
 
public class ex19 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int seg = teclado.nextInt();
        int horas = seg / 3600;
        int minutos = (seg % 3600) / 60;
        int segundos = (seg % 3600) % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        teclado.close();
    }
}