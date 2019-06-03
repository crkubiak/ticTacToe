public class TicTacToe {
    public TicTacToe() {
        runner();
    }

    public String runner() {
    return "runner";
    }

    public String createBoard() {
        String[] boardChoices = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String createBoard = String.format("%s|%s|%s\n-+-+-\n%s|%s|%s\n-+-+-\n%s|%s|%s", boardChoices[0], boardChoices[1], boardChoices[2], boardChoices[3], boardChoices[4], boardChoices[5], boardChoices[6], boardChoices[7], boardChoices[8]);
        return createBoard;
    }

    public String createPlayer(String name) {
        String pName = name;
        return pName;
    }



    public static void main(String[] args) {
        TicTacToe newGame = new TicTacToe();

    }
}
