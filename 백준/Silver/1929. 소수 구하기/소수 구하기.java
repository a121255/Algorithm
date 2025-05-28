import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] num = br.readLine().split(" ");

        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);

        boolean[] isPrime = new boolean[m+1]; 
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;
        for(int i=2; i*i <= m; i++) {
            if(isPrime[i]) {
                for(int j = i*i; j <= m; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for(int i = n; i <= m; i++) {
            if(isPrime[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
