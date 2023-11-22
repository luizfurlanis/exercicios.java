import java.util.Scanner;
import java.io.IOException;

public class TempoMinutos {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int hora;
        int minuto;
        int horaFinal;
        int minutoFinal;

        for(int i = 0; i < hora; i += 15){
            horaFinal += 1;
        }
        for(int i = 0; i < minuto; i += 6){
            minutoFinal += 1;
        }

        if(horaFinal < 10){
            Sistem.out.println("0" + horaFinal);
        } else {
            Sistem.out.println(horaFinal);
        }

        if(minutoFinal < 10){
            Sistem.out.println("0" + minutoFinal);
        } else {
            Sistem.out.println(minutoFinal);
        }
    }
}
