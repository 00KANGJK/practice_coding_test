import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        Queue<Integer> maxQueue = new PriorityQueue<>((i1, i2) -> i2 - i1),
                       minQueue = new PriorityQueue<>();
        
        
        for(int i = 0; i < operations.length; i++) {
            String[] strs = operations[i].split(" ");
            if(strs[0].equals("I")) {
                minQueue.offer(Integer.valueOf(strs[1]));
                maxQueue.offer(Integer.valueOf(strs[1]));
            } else if(strs[0].equals("D") && strs[1].equals("1") && !maxQueue.isEmpty()) {
                minQueue.remove(maxQueue.poll());
            } else if(strs[0].equals("D") && strs[1].equals("-1") && !minQueue.isEmpty()) {
                maxQueue.remove(minQueue.poll());
            }
        }
        
        int min = minQueue.isEmpty() ? 0 : minQueue.poll(),
            max = maxQueue.isEmpty() ? 0 : maxQueue.poll();
        
        return new int[]{max, min} ;
    }
}