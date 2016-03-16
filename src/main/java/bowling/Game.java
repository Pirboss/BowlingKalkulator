package bowling;

import bowling.exception.InvalidGameException;

/**
 * Created by omen on 07/03/16.
 */
public class Game
{
    private final ITurn[] mTurns;

    public Game(ITurn[] turns) throws InvalidGameException
    {
        if(turns.length != 10)
            throw new InvalidGameException();
        mTurns = turns;
    }

    public int getScore()
    {
        for(ITurn turn : mTurns)
        {

        }
        return 0;
    }

}
