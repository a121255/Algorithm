import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> stack = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push":
                    push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
            }
        }

        System.out.println(sb);
    }
    static void push(int num) {
        stack.add(num);
    }

    static void pop(){
        if(stack.isEmpty()){
            sb.append("-1").append("\n");
            return;
        }
        sb.append(stack.get(stack.size()-1)).append("\n");
        stack.remove(stack.size()-1);
    }

    static void size(){
        sb.append(stack.size()).append("\n");
    }

    static void empty(){
        if(stack.isEmpty()) sb.append("1").append("\n");
        else sb.append(0).append("\n");
    }

    static void top() {
        if(stack.isEmpty()) sb.append("-1").append("\n");
        else sb.append(stack.get(stack.size()-1)).append("\n");
    }
}
