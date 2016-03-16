package bowling;

import bowling.exception.InvalidGameException;

/**
 * Created by omen on 07/03/16.
 */
public class Game
{
    public static final int TURN_NUMBER = 10;
    private final ITurn[] mTurns;

    public Game(ITurn[] turns) throws InvalidGameException
    {
        if(turns.length != TURN_NUMBER || !(turns[TURN_NUMBER - 1] instanceof ExtendedTurn))
            throw new InvalidGameException();
        mTurns = turns;
    }

    public int getTotalScore()
    {
        int score = 0;
        for(int i = 0;i < TURN_NUMBER;i++)
        {
            if(mTurns[i] instanceof Turn)
            {
                Turn turn = (Turn) mTurns[i];

                if(turn.isStrike())
                {
                    if(i < TURN_NUMBER - 1)
                        score += turn.getScore() + mTurns[i+1].getScore() + mTurns[i+2].getScore();
                }
                else if(turn.isSpare())
                {
                    score += turn.getScore() + mTurns[i+1].getScore();
                }
                else
                {
                    score += turn.getScore();
                }
            }
        }
        return score;
    }

}
