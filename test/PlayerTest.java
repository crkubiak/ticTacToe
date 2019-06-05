import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
            public void createPlayer(){
        Player testPlayer = new Player("Testy");
        int[] expectedArray = {1, 0, 0, 0, 0};
        int[] actualArray = testPlayer.takeTurn(1);
        assertArrayEquals(expectedArray, actualArray);
    }


}