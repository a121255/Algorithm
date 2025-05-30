import java.util.Stack;

class Solution {
    boolean solution(String s) {
       if(s.startsWith(")")) return false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
            if(c == '(') stack.push(c);
            else if(c == ')'){
                if(stack.isEmpty()) return false;
                else stack.pop();
            }
        }

        return stack.isEmpty();
    }
}