import java.util.Scanner;
import java.io.IOException;

public class SentençaDançante {
    public static void main(String[] args) throws IOException{
        Scanner teclado = new Scanner(System.in);
        String sentenca = teclado.next();
        char[] c = sentenca.toCharArray();
        for(int i = 0; i < 50; i++){
            if(c[i] = null){ 
                i++; 
            }
        }
        for(int i = 0; i < 50; i++){
            if(i % 2 == 0){
                toUpperCase(c[i]);
            } else if {
                toLowerCase(c[i]);
            }
        }
        teclado.close();
    }
}
