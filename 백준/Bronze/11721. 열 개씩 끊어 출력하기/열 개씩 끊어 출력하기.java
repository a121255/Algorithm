import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();

        while(true) {
            if(a.length() < 10) {
                sb.append(a);
                break;
            }
            sb.append(a, 0, 10).append("\n");
            a = a.substring(10);
        }
        System.out.println(sb);
    }
}