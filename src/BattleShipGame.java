import java.util.Random;

public class BattleShipGame {
    int skibsStørrelse;


    // Konstruktør
    public BattleShipGame(int skibsStørrelse, int[] ocean) {
        this.skibsStørrelse = skibsStørrelse;
    }

    public void startSpil () {
        Ship battleShip = new Ship();
        GameHelper gameMaster = new GameHelper();
        Random ShipPosition = new Random(6 + 1);



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
