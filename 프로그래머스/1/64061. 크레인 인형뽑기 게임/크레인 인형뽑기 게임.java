import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0; // 터트려 사라진 인형개수
        Stack<Integer> dolls = new Stack<>(); // 바구니
        
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                int doll = board[i][move - 1]; //어떤 인형인지 저장
                board[i][move - 1] = 0; // 인형 뽑음 처리
                if (doll != 0) {
                    if (dolls.isEmpty() || doll != dolls.peek()) {
                        dolls.push(doll); // 바구니에 넣음
                    } else {
                        dolls.pop(); // 터짐
                        answer += 2;
                    }
                    break; // 인형을 뽑았으므로 다음 move로
                }
            }
        }
        
        return answer;
    }
}