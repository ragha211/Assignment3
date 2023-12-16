public class TicTac {
    private char[][] board;
    private char currentPlayerMark;

    // Constructor
    public TicTac() {
        board = new char[3][3];
        currentPlayerMark = 'X';
        initializeBoard();
    }

    private void initializeBoard() {
    }


    public void putMark(int row, int col) throws IllegalStateException {
        if (isGameOver()) {
            throw new IllegalStateException("Game over. Cannot place a mark.");
        }

        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            throw new IllegalArgumentException("Invalid row or column index.");
        }

        if (board[row][col] == '_') {
            board[row][col] = currentPlayerMark;
            changePlayer();
        } else {
            throw new IllegalArgumentException("Cell already occupied.");
        }
    }

    private void changePlayer() {
    }

    private boolean isGameOver() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    private boolean checkDiagonals() {
        return false;
    }

    private boolean checkRows() {
        return false;
    }

    private boolean checkColumns() {
        return false;
    }


}

