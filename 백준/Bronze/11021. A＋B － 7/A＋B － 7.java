import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append("Case #" + (i+1) + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
        }

        System.out.println(sb.toString());
    }
}