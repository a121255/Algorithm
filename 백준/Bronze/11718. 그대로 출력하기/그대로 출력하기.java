import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.isEmpty()) break;
            sb.append(line).append("\n");
        }

        System.out.println(sb.toString());
    }
}