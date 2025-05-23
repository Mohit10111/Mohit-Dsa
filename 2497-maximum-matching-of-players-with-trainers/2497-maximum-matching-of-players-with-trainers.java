import java.util.Arrays;

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);  // Sort players by capability required
        Arrays.sort(trainers); // Sort trainers by capability available

        int i = 0, j = 0, count = 0;
        while (i < players.length && j < trainers.length) {
            if (trainers[j] >= players[i]) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
}
