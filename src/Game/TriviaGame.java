package Game;

public class TriviaGame extends Game {
    private int prize;
    private int nbWinningQuestions;

    public  TriviaGame(String description, int prize, int nbWinningQuestions){
        super(description);
        this.nbWinningQuestions=nbWinningQuestions;
        this.prize=prize;
    }
    public int getPrize() {
        return prize;
    }
    public void setPrize(int prize) {
        this.prize = prize;
    }
    public int getNbWinningQuestions() {
        return nbWinningQuestions;
    }
    public void setNbWinningQuestions(int nbWinningQuestions) {
        this.nbWinningQuestions = nbWinningQuestions;
    }
    @Override
    public String toString() {
        return "TriviaGame{" +
                "prize=" + prize +
                ", nbWinningQuestions=" + nbWinningQuestions +
                '}';
    }
}
