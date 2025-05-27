import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = Integer.parseInt(br.readLine());

        int s = 1;
        for (int i = 1; i <= cnt; i++) {
            for (int j = 1; j <= cnt - i; j++){
                sb.append(" ");
            }
            for (int j = 0; j < s; j++) {
                sb.append("*");
            }
            s += 2;
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
