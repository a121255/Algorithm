import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();
       String line = sc.nextLine();
        
       for(int i=0; i<line.length(); i++) {
           char ch = line.charAt(i);
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