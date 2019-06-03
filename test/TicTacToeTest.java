import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    @Test
    public void runnerGreets() {
        TicTacToe testGame = new TicTacToe();
        assertEquals("runner", testGame.runner());
    }

}