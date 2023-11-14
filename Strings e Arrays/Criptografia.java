import java.io.IOException;
import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        for(int k = 0; k < n; k++){
            StringBuilder sb = new StringBuilder(readLine(teclado));

            for(int i = 0; i < sb.length(); i++){
                char c = sb.charAt(i);
                if((c > 64 && c < 91) || (c > 96 && c < 123)){
                    c += 3; 
                    sb.setCharAt(i, c);
                }
            }
            sb.reverse();

            for(int i = sb.length() / 2; i < sb.length(); i++){
                char w = (char) (sb.charAt(i) - 1);
                sb.setCharAt(i, w);
            }
            System.out.println(sb.toString());
        }
        teclado.close();
    }
    public static String readLine(Scanner teclado) {
        String line = teclado.nextLine();
        while (line.isEmpty())
			line = teclado.nextLine();
        return line;
    }
}