import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    @Test
    public void runnerGreets() {
        TicTacToe testGame = new TicTacToe();
        assertEquals("runner", testGame.runner());
    }

    @Test
    public void testCreateBoard() {
        TicTacToe testGame = new TicTacToe();
        assertEquals("1|2|3\n-+-+-\n4|5|6\n-+-+-\n7|8|9", testGame.createBoard(), "Board creation failed");
    }

    @Test
    public void testCreatePlayer() {
        TicTacToe testGame = new TicTacToe();
        assertEquals("Charles", testGame.createPlayer("Charles"));
    }

}