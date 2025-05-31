import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] num = br.readLine().split(" ");

        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);

        boolean[] isNotPrime = new boolean[m+1];

        isNotPrime[0] = isNotPrime[1] = true;
        for(int i=2; i*i <= m; i++) {
            if(!isNotPrime[i]) {
                for(int j = i*i; j <= m; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        for(int i = n; i <= m; i++) {
            if(!isNotPrime[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}