import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       List<Integer> list = new ArrayList<>();
        int size = 1;
        int temp1 = (int) Math.ceil((double) (100 - progresses[0]) / speeds[0]);

        for (int i = 1; i < progresses.length; i++) {
            int temp2 = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            if(temp1 >= temp2){
                size++;
            }else{
                list.add(size);
                size = 1;
                temp1 = temp2;
            }
        }
        list.add(size);

        return list.stream().mapToInt(i -> i).toArray();
    }
}