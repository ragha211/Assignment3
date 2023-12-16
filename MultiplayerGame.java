import java.util.ArrayList;
import java.util.List;

    public class MultiplayerGame {
        public static void main(String[] args) {

        }
        private List<Integer>[] adjacencyList;
        private int n;
        private int winner;

        public MultiplayerGame(int n) {
            this.n = n;
            this.adjacencyList = new ArrayList[n];
            this.winner = -1;

            for (int i = 0; i < n; i++) {
                adjacencyList[i] = new ArrayList<>();
            }
        }

        public void meet(int i, int j) {
            adjacencyList[i - 1].add(j);
            adjacencyList[j - 1].add(i);
            checkWinner();
        }

        private void checkWinner() {
            for (int i = 0; i < n; i++) {
                if (adjacencyList[i].size() >= n - 1) {
                    winner = i + 1;
                    break;
                }
            }
        }

        public int getWinner() {
            return winner;
        }
    }

