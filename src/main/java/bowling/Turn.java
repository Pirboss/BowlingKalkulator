package bowling;

import bowling.exception.InvalidTurnException;

/**
 * Created by omen on 07/03/16.
 */
public class Turn implements ITurn
{
    private final int mFirstScore;
    private final int mSecondScore;

    public Turn(int firstScore, int secondScore) throws InvalidTurnException
    {
        if(firstScore + secondScore > 10 || firstScore + secondScore < 0)
            throw new InvalidTurnException();

        mFirstScore = firstScore;
        mSecondScore = secondScore;
    }

    public boolean isStrike()
    {
        return (mFirstScore == 10);
    }

    public boolean isSpare()
    {
        return ((!isStrike()) && (mFirstScore + mSecondScore == 10));
    }

    public int getScore()
    {
        return mFirstScore+mSecondScore;
    }
}
