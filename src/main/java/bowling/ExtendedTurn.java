package bowling;

import bowling.exception.InvalidTurnException;

/**
 * Created by omen on 07/03/16.
 */
public class ExtendedTurn implements ITurn
{
    private final int mFirstScore;
    private final int mSecondScore;
    private final int mThirdScore;

    public ExtendedTurn(int firstScore, int secondScore, int thirdScore)
    {
        mFirstScore = firstScore;
        mSecondScore = secondScore;
        mThirdScore = thirdScore;
    }

    public int getScore()
    {
        return 0;
    }
}
