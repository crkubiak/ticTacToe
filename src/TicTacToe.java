import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        int[] testSmall = {1,2,3};
        int[] testLarge = {1,2,3};
        System.out.println(testLarge.equals(testSmall));
        int turnCount = 0;
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();

        //        int[] player1 = {0,0,0,0,0,0,0,0,0};
//        int[] player2 = {0,0,0,0,0,0,0,0,0};

        int[][] victory = {
                {1,2,3,}, {4,5,6}, {7,8,9}, {1,4,7}, {2,5,8}, {3,6,9}, {1,5,9}, {3,5,7}};
        int[] boardChoices = {1,2,3,4,5,6,7,8,9};
        String[] displayBoard = {"1","2","3","4","5","6","7","8","9"};

//        System.out.print("\033[H\033[2J");

        Scanner startGame = new Scanner(System.in);
        System.out.print("Would you like to play a game? (y/n): ");
        boolean hasY = startGame.hasNext("y");

        while (hasY) {
            System.out.print("\033[H\033[2J");
            String createBoard = String.format("\n\n     %s|%s|%s\n     -+-+-\n     %s|%s|%s\n     -+-+-\n     %s|%s|%s\n\n", displayBoard[0], displayBoard[1], displayBoard[2], displayBoard[3], displayBoard[4], displayBoard[5], displayBoard[6], displayBoard[7], displayBoard[8]);
            System.out.println("Turn: " + turnCount);
            System.out.println(createBoard);
            System.out.println("P1: " + player1 + " Length: " + player1.size());
            System.out.println("P2: " + player2 + " Length: " + player2.size());
//            System.out.println("P1 " + Arrays.toString(player1));
//            System.out.println("P2 " + Arrays.toString(player2));
            System.out.println("Display Board: " + Arrays.toString(displayBoard));
            System.out.println("Board Choices: " + Arrays.toString(boardChoices));
            if (player1.size() >= 2) {
                System.out.print("*********************");
            }

            if (turnCount % 2 == 0) {
                Scanner playerOneTurn = new Scanner(System.in);
                System.out.print("Player One (X), Please select a move (1-9): ");
                int playerOneOutput = playerOneTurn.nextInt();
                for (int i = 0; i < boardChoices.length; i++) {
                    if (playerOneOutput == boardChoices[i]) {
                        displayBoard[i] = "X";
                        player1.add(boardChoices[i]);
//                        player1[i] = boardChoices[i];
                        boardChoices[i] = 0;
                    }
                }
                for (int i = 0; i < victory.length; i++) {
                    for (int j = 0; j <victory[i].length; j++) {
//                        if (victory[i][j].equals(player1.get[i])) {
//
//                        }
                    }
                }
            } else {
                Scanner playerTwoTurn = new Scanner(System.in);
                System.out.print("Player Two (O), Please select a move (1-9): ");
                int playerTwoOutput = playerTwoTurn.nextInt();
                for (int i = 0; i < boardChoices.length; i++) {
                    if (playerTwoOutput == boardChoices[i]) {
                        displayBoard[i] = "O";
                        player2.add(boardChoices[i]);
//                        player2[i] = boardChoices[i];
                        boardChoices[i] = 0;
                    }
                }
            }
            System.out.println(createBoard);
            turnCount += 1;
        }
    }
}