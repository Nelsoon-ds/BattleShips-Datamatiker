import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BattleShipGame {



    public static void main(String[] args) {
        ArrayList<Ship> spilBoard = new ArrayList<>();
        Ship galleon = new Ship(4, "Tortuga", "galleon");
        Ship frigate = new Ship(5, "Devil", "frigate");
        Ship warship = new Ship(10, "Blastoise", "warship");

        galleon.genererPosition();
        frigate.genererPosition();
        warship.genererPosition();

        spilBoard.add(galleon);
        spilBoard.add(frigate);
        spilBoard.add(warship);
        System.out.println(spilBoard);


     //   startSpil();
    }

    public static void createShips() {
        // Flyt skibs logikken herover
    }
    public static void startSpil() {
        int skud = 6;
        System.out.println("\nVelkommen, Kaptajn!");
        System.out.println("Du er nu øverstkommanderende for flåden, og fjenden er observeret.");
        System.out.println("Dit mål er at sænke deres eneste skib, før de sænker dit!");
        System.out.println("Du har " + skud + " skud til rådighed. Vælg din position klogt.");
        System.out.println("Held og lykke, Kaptajn! Havet venter på dine ordrer!");
        System.out.println("----------------------------------------------------");
        // Lav nogle objekter
        Ship galleon = new Ship(3, "Test", "galleon");
        GameHelper gameMaster = new GameHelper();
        // Placer skibet tilfældigt
        galleon.genererPosition();
        // Tjek at skibet er ude i vandet
       //  System.out.println(Arrays.toString(galleon.hav));// Uncomment for at tjekke positioner snydepels


        while (!galleon.erSunket() && skud > 0) {
            int userInput = gameMaster.getUserInput();
            if (galleon.checkSkud(userInput)) {
                System.out.println("\uD83D\uDD25RAMT!\uD83D\uDD25");
            } else {
                System.out.println("\uD83D\uDCA7PLASK!\uD83D\uDCA7");
            }
            skud--;
            System.out.println("Du har nu " + skud + " tilbage.");
        }

        // Tjek om spillet er slut
        if (galleon.sunket) {
            System.out.println("Du sænkede skibet! Tillykke med sejren Kaptajn.");
        } else {
            System.out.println("Du missede alle dine skud Kaptajn... Det er på tide vi får omstruktureret ledelsen.");
        }

        // Luk scanneren så den ikke kører uendeligt.
        gameMaster.closeScanner();
    }


}
