import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}