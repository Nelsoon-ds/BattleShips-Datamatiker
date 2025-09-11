public class Ship {
    String skib;
    int skud = 1;
    boolean sunket = false;

    public static void main(String[] args) {
        GameHelper gameMaster = new GameHelper();
        gameMaster.getUserInput();

    }
    public int setLokation() {
        int [] placeringer = {0, 1, 2, 3, 4, 5, 6};
        skib.setlokation(new int[]{4, 5, 6});
    }

    public boolean tjekRamt() {
        boolean ramt = true;
        boolean ramt2 = false;
    }

    public boolean erSunket() {
        return this.sunket;
    }
}