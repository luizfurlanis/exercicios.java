import java.util.Scanner;
import java.io.IOException;

public class TDARacional {
    public static void main(String[] args) throws IOException{
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        for(int i = 0; i < n; i++){ 
            int g = 0;
            int d = 0;
            String c = teclado.nextLine();
            char[] e = c.toCharArray();

            if(e[4] == '+'){
                g = (e[0] * e[12] + e[8] * e[4]); 
                d = (e[12] * e[4]);
            } else if(e[4] == '*'){
                g = (e[0] * e[8]);
                d = (e[12] * e[4]);
            } else if(e[4] == '/'){
                g = (e[0] * e[12]);
                d = (e[8] * e[4]);
            } else if(e[4] == '-'){
                g = (e[0] * e[12] - e[8] * e[4]); 
                d = (e[12] * e[4]);
            }
            System.out.println( g + " / " + d );
        }
        teclado.close();
    }
}