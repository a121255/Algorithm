import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 2*cnt-1; i++) {
            if(i <= cnt) {
                for(int j = 1; j <= i; j++) {
                    sb.append("*");
                }
                for(int j = 1; j <= (cnt * 2) -  (i * 2); j++) {
                    sb.append(" ");
                }
                for(int j = 1; j <= i; j++) {
                    sb.append("*");
                }
            }else{
                for(int j = 1; j <= (2 * cnt - i); j++) {
                    sb.append("*");
                }
                for(int j = 1; j <= i - (2 * cnt-i); j++) {
                    sb.append(" ");
                }
                for(int j = 1; j <= (2 * cnt - i); j++) {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}