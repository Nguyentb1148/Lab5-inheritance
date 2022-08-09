package Game;

public class BoardGame extends Game {
    private int minPlayers;
    private int maxPlayers;

    public BoardGame(String description,int minPlayers,int maxPlayers) {
        super(description);
        this.maxPlayers=maxPlayers;
        this.minPlayers=minPlayers;
    }
    public int getMinPlayers() {
        return minPlayers;
    }
    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }
    public int getMaxPlayers() {
        return maxPlayers;
    }
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "minPlayers=" + minPlayers +
                ", maxPlayers=" + maxPlayers +
                '}';
    }
}