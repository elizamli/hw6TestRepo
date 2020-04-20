package edu.cmu.cs.cs214.test1;

public class SameClassToBeDeleted {
    private int meeple;
    private final int playerId;
    private int score;

    public SameClassToBeDeleted(int playerId) {
        this.playerId = playerId;
    }


    public int getPlayerId(){
        return playerId;
    }
    int getMeeple(){
        return meeple;
    }

    /**
     * This method gets scores
     * @return
     */
    public int getScore(){
        return score;
    }

    void restoreMeeples(int numMeeples){
        meeple += numMeeples;
    }
    void removeMeeple(){
        meeple--;
    }
    void updateScore(int points){
        score += points;
    }

    @Override
    public String toString(){
        return "id:" + playerId + " score:" + score;
    }
}
