import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int i = 2;
        while(num != 1) {
            if(num % i == 0){
                sb.append(i).append("\n");
                num /= i;
            }else {
                i++;
            }
        }
        System.out.println(sb);
    }
}