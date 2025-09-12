import java.util.Random;

public class Ship {
    boolean sunket = false;
    int[] hav = new int[15];


    /**
     *  Generere en random position inden for
     *  arrayets længde. Den trækker 3 fra for
     *  at sikre at skibet kan være der.
     *  Skibets position bliver markeret med 1 taller.
     * */
    public void genererPosition () {
        Random random = new Random();
        int maxStartPosition = hav.length - 3; // Så er der altid plads til et skib i arrayet.
        if (maxStartPosition < 0) {
            return;
        }
        int startPosition = random.nextInt(maxStartPosition + 1);
        // Placer 1'er på havet
        for(int i = 0; i < 3; i++) {
            hav[startPosition+i] = 1;
        }

    }

    /**
     * <p>Tjekker hav arrayets indeks position med brugerens input
     * og hvis den er ramt vil den overskrive positionen til at være 0 (hav)</p> */
    public boolean checkSkud (int position) {
            if (hav[position] == 1) {
                // Sæt nu skibet til at være sunket i havet
                hav[position] = 0;
                return true;
            }
        return false;
    }


    public boolean erSunket() {
        for (int element : hav) {
            if (element != 0) {
                return false;
            }
        }
        this.sunket = true;
        return true;
    }
}