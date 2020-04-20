package edu.cmu.cs.cs214.test1;

public class ExactSameClass {
    private int meepleCount;
    private final int playerId;
    private int score;
    private static final String word = "hello what is up";

    // hello hi
    private static final int INIT_MEEPLE_COUNT = 7;

    public ExactSameClass(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerId(){
        return playerId;
    }
    int getMeepleCount(){
        return meepleCount;
    }
    public int getScore(){
        return score;
    }

    void restoreMeeples(int numMeeples){
        meepleCount += numMeeples;
    }
    void removeMeeple(){
        meepleCount--;
    }
    void updateScore(int points){
        score += points;
    }

    @Override
    public String toString(){
        return "id:" + playerId + " score:" + score;
    }
}
