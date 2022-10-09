package AbstractClasses;

public class AbstractMain {
    public void main() {
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();

        GameCalculator gameCalculator = new ManGameCalculator();
        gameCalculator.hesapla();
    }
}
