package bowling;

import bowling.exception.InvalidGameException;

/**
 * Created by omen on 07/03/16.
 */
public class Game
{
    private final Turn[] mTurns;

    public Game(Turn[] turns) throws InvalidGameException
    {
        if(turns.length != 10)
            throw new InvalidGameException();
        mTurns = turns;
    }

    public int getScore()
    {
        for(Turn turn : mTurns)
        {

        }
    }

}
