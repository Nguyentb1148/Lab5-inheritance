package Game;

public class TestGame {
    public static void main(String[] args) {
        PCBasedGame mySecondGame = new PCBasedGame("Mario 3: playing for fun",
                1, 10, 1);
        System.out.println(mySecondGame);
        TriviaGame myThirdGame = new TriviaGame("Who want to millionaire: answer ..", 1000000,
                20);
        System.out.println(myThirdGame);
    }
}
