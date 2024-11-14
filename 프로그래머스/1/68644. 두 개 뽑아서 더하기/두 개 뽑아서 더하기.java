import java.util.HashSet;

class Solution {
    public static int[] solution(int[] numbers) {
        //HastSet을 사용함으로써 중복된 값을 지워진다.
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0 ; i< numbers.length -1; i++){
            for(int j = i+1; j< numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println(set);
        
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
//