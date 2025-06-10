import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());


        for (int i = 0; i < cnt; i++) {
            String input = br.readLine();
            String cmd = input.substring(0, 2);
            switch (cmd) {
                case "pu":
                    queue.add(Integer.parseInt(input.substring(5)));
                    break;
                case "po":
                    if(queue.isEmpty()){
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(queue.pollFirst()).append("\n");
                    break;
                case "si":
                    sb.append(queue.size()).append("\n");
                    break;
                case "em":
                    if(queue.isEmpty()) sb.append("1").append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "fr":
                    if(queue.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(queue.peekFirst()).append("\n");
                    break;
                case "ba":
                    if(queue.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(queue.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
