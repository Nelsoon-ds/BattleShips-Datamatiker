import java.util.Random;

public class BattleShipGame {

    public void startSpil () {
        Ship battleShip = new Ship();
        GameHelper gameMaster = new GameHelper();

        while (!battleShip.tjekRamt()) {
            // Spørg om input
            String userAnswer = gameMaster.getUserInput();
            int num = Integer.parseInt(userAnswer);

            if(userAnswer == ocean[num]) {
                // Skibet er ramt!

            }

        }



    }

    public boolean checkSkud() {
        // Check om du er blevet ramt
    }
}
