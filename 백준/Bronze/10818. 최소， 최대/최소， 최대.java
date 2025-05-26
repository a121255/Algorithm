import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = Integer.parseInt(br.readLine());
        String[] sArr =  br.readLine().split(" ");
        int[] iArr = new int[cnt];

        for(int i = 0; i < cnt; i++){
            iArr[i] = Integer.parseInt(sArr[i]);
        }

        System.out.println(Arrays.stream(iArr).min().getAsInt() + " " + Arrays.stream(iArr).max().getAsInt());
    }
}