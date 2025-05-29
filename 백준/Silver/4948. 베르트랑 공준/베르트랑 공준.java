import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int s;
        while((s = Integer.parseInt(br.readLine())) != 0) {
            sb.append(isPrime(s)).append("\n");
        }
        System.out.println(sb);
    }

    public static int isPrime(int num) {
        int m = num * 2;
        boolean[] isNotPrime = new boolean[m + 1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for(int i = 2; i * i <= m; i++) {
            if(!isNotPrime[i]) {
                for(int j = i*i; j <= m; j+=i ){
                    isNotPrime[j] = true;
                }
            }
        }

        int cnt = 0;
        for(int i = num + 1; i <= m; i++){
            if(!isNotPrime[i]) cnt++;
        }
        return cnt;
    }
}
