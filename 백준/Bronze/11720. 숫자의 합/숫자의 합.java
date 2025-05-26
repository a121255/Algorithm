import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int sum = 0;
        char[] array = br.readLine().toCharArray();

        for (int i = 0; i < cnt; i++) {
            sum += Integer.parseInt(String.valueOf(array[i]));
        }

        System.out.println(sum);
    }
}