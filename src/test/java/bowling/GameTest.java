package bowling;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lilian on 16/03/2016.
 */
public class GameTest {

    @Test
    public void testGetScore() throws Exception {
        ITurn t1 = new Turn(5,5);
        ITurn tlast = new ExtendedTurn(0,0,0);

        Game game = new Game(new ITurn[]{t1,t1,t1,t1,t1,t1,t1,t1,t1,tlast});

        assertEquals(game.getTotalScore(),170);
    }
}