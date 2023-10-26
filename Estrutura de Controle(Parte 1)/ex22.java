import java.util.Scanner;
import java.io.IOException;

public class ex22{
    public static void main (String [] agrs) throws IOException {
        Scanner teclado = new Scanner(System.in);

        char a = (char)System.in.read();
        char b = (char)System.in.read();
        char c = (char)System.in.read();
        char d = (char)System.in.read();

        if(b > c && d > a){
            if((c + d) > (b + a)){
                if(c > 0 && d > 0 ){
                    if(a % 2 == 0){
                        System.out.println("Valores aceitos");
                    }else{
                        System.out.println("Valores nao aceitos");
                    }
                }else{
                    System.out.println("Valores nao aceitos");
                }
            }else{
                System.out.println("Valores nao aceitos");
            }
        }else{
            System.out.println("Valores nao aceitos");
        }
        teclado.close();
    }
}