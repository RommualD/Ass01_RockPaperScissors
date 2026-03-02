import java.util.Scanner;

public class RPS_Game {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String playA;
        String playB;
        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {

            do {
                System.out.print("Enter move for Player A [RPS]: ");
                playA = in.nextLine().toUpperCase();

                if (!(playA.equals("R") || playA.equals("P") || playA.equals("S"))) {
                    System.out.println("Invalid move. Try again.");
                }

            } while (!(playA.equals("R") || playA.equals("P") || playA.equals("S")));

            do {
                System.out.print("Enter move for Player B [RPS]: ");
                playB = in.nextLine().toUpperCase();

                if (!(playB.equals("R") || playB.equals("P") || playB.equals("S"))) {
                    System.out.println("Invalid move. Try again.");
                }

            } while (!(playB.equals("R") || playB.equals("P") || playB.equals("S")));

            if (playA.equals(playB)) {
                System.out.println(playA + " vs " + playB + " it's a Tie!");
            }
            else if (playA.equals("R") && playB.equals("S")) {
                System.out.println("Rock breaks Scissors - Player A wins!");
            }
            else if (playA.equals("P") && playB.equals("R")) {
                System.out.println("Paper covers Rock - Player A wins!");
            }
            else if (playA.equals("S") && playB.equals("P")) {
                System.out.println("Scissors cuts Paper - Player A wins!");
            }
            else if (playB.equals("R") && playA.equals("S")) {
                System.out.println("Rock breaks Scissors - Player B wins!");
            }
            else if (playB.equals("P") && playA.equals("R")) {
                System.out.println("Paper covers Rock - Player B wins!");
            }
            else if (playB.equals("S") && playA.equals("P")) {
                System.out.println("Scissors cuts Paper - Player B wins!");
            }

            System.out.print("Play again? [Y/N]: ");
            playAgain = in.nextLine();
        }

        System.out.println("Thanks for playing!");
        in.close();
    }
}
