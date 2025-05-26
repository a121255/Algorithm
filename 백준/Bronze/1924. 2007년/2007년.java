import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        for (int i = 0; i < month - 1; i++) {
            day += monthDays[i];
        }

        System.out.println(days[day % 7]);

    }
}
