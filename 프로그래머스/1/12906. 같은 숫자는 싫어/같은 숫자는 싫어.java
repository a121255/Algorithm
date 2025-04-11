import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            if(i==0 || (i != 0 && arr[i] != arr[i-1])) {
               queue.add(arr[i]);
            }
        }
        return queue.stream().mapToInt(Integer::valueOf).toArray();
    }
}