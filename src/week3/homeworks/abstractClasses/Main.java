public class Main {
    public static void main(String[] args) {

        GameCalculator[] gameCalculators = new GameCalculator[] {new KidGameCalculator(), new ManGameCalculator(), new WomanGameCalculator(), new OlderGameCalculator()};

        for (GameCalculator gameCalculator : gameCalculators) {
            gameCalculator.calculate();
            gameCalculator.gameOver();
        }

    }
}