import java.util.Scanner;

public class GameHelper {
    private final Scanner scanner = new Scanner(System.in);

    public int getUserInput() {
        int userAnswer;

        while(true) {
            System.out.println("Vælg koordinater til dit skud Kaptajn. Du kan skyde imellem følgende tal: 0-15");
            userAnswer = scanner.nextInt();
            if (userAnswer >= 0 && userAnswer <= 15) {
                break;
            } else {
                System.out.println("Dit svar: " + userAnswer + " er udenfor vores rækkevidde. Prøv igen.");
            }
        }
            System.out.println("Du valgte: " + userAnswer);
            return userAnswer;
        }

    public void closeScanner() {
        scanner.close();
    }
}


