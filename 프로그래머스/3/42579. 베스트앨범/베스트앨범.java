import java.util.*;

public class Solution {
    static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotalPlays = new HashMap<>();

        Map<String, PriorityQueue<int[]>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {

            String genre = genres[i];
            int play = plays[i];

            genreTotalPlays.put(genre, genreTotalPlays.getOrDefault(genre, 0) + play);

            if (!genreSongs.containsKey(genre)) {
                genreSongs.put(genre, new PriorityQueue<>((a, b) -> b[1] - a[1]));
            }
            genreSongs.get(genre).add(new int[]{i, play});
        }

        List<String> sortedGenres = new ArrayList<>(genreTotalPlays.keySet());
        sortedGenres.sort((g1, g2) -> genreTotalPlays.get(g2) - genreTotalPlays.get(g1));


        List<Integer> answerList = new ArrayList<>();

        for (String genre : sortedGenres) {
            PriorityQueue<int[]> songs = genreSongs.get(genre);
            answerList.add(songs.poll()[0]);

            if (!songs.isEmpty()) {
                answerList.add(songs.poll()[0]);
            }
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}