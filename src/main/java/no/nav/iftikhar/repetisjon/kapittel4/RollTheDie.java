package no.nav.iftikhar.repetisjon.kapittel4;
import java.util.Random;
/*
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 * Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
 *
 *After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
 *
 * Repeat this 4 additional times, for 5 rolls in total.
 *
 * However, if the user gets to 20 before 5 rolls, end the game - they've won.
 *
 * If they are greater than or less than 20 spaces exactly, they lose.
 *
 * Remember there are only 20 spaces on the board, so a message like "You advanced to space 22" is a bug.
 *
 */
public class RollTheDie {

    public static void main(String[] arg) {

        Random random = new Random();
        System.out.println(" This is a board game. You roll a die to get a random number, then you advance on the board equivalent to the number");
        System.out.println(" If you reach the goal at board location nr 20 in 5 rolls, you win");
        System.out.println(" If you do not reach the goal at board location nr 20 in 5 rolls, you loose, this is also the case if you et further than 20");
        System.out.println();

        int position = 0;
        int i;
        int left;

        for (i = 1; i < 5; i++) {
            System.out.println();
            System.out.println("Roll number: " +i);
            int die = random.nextInt(6) + 1;
            System.out.println("You rolled number: " + die);
            System.out.println();
            position = position + die;

            if (position < 20) {
                left = position - 20;
                System.out.println("Your caret is moved to position: " + position);
                System.out.println("You have " + left + " positions left to achieve goal");
                System.out.println();
            }
        }

        if (position == 20 && i == 5) {
            System.out.println(" You have won the game");
            System.out.println(" You achieved position 20 with 5 rolls");

        } else if (position < 20) {
            System.out.println(" You lost the game");
            System.out.println(" Your carets current position is " + position);
            System.out.println(" You are in lack of " + (20 - position) + " Positions to achieve goal of 20 and you have rolled the die " +i+ " times");

        } else {
            System.out.println(" You lost the game");
            System.out.println("You went " + (position - 20) + " Positions over goal within " + i + " rolls");
            System.out.println();
        }


            System.out.println(" *********************************** GAME OVER *****************************************");
    }
}