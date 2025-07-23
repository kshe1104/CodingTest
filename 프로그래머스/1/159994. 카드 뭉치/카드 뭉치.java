class Solution {
public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i1 = 0, i2 = 0;
        for (String word : goal) {
            // If next card matches top of cards1 pile, take it
            if (i1 < cards1.length && word.equals(cards1[i1])) {
                i1++;
            }
            // If next card matches top of cards2 pile, take it
            else if (i2 < cards2.length && word.equals(cards2[i2])) {
                i2++;
            }
            // Otherwise, sequence can't be made
            else {
                return "No";
            }
        }
        return "Yes";
    }
}