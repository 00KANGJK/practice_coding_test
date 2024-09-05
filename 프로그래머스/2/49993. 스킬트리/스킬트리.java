// 몰라서 어떻게 해결하면 좋을지 구글링함.
// skill로 입력 받은 문자 제외한 나머지를 다 날리는 것임.
// replaceAll(String regex, String replacement)
// [^s] : 특정 문자(s)를 제외한 문자 치환
// String str = new_id.replace("[^a]", "b"); // a를 제외한 문자를 b로 치환

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (int i = 0; i < skill_trees.length; i++) {
            // skill문자를 제외한 문자 치환
			String rep_skill = skill_trees[i].replaceAll("[^" + skill + "]", "");
			for (int j = 0; j < skill.length() + 1; j++) {
				String unit_skill = skill.substring(0, j); 
				if (rep_skill.equals(unit_skill)) { 
					answer++;
					break;
				}
			}
        }
        
        return answer;
    }
}