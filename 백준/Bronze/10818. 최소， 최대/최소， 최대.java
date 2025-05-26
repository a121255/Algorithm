import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = Integer.parseInt(br.readLine());
        String[] sArr =  br.readLine().split(" ");
        int min = Integer.parseInt(sArr[0]);
        int max = Integer.parseInt(sArr[0]);

        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(sArr[i]);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println(min + " " + max);
    }
}