import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        int cnt = 0;
        
        
        for(int i = 0; i < n; i++){
            if(isPrime(Integer.parseInt(num[i]))) cnt++;
        }
       
        System.out.print(cnt);
    }

    public static boolean isPrime(int num) {
        if(num == 0 || num == 1) return false;
        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}