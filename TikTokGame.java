import java.util.Scanner;

public class TikTokGame {

    public static void main(String[] args) {
        System.out.println("Please enter numbers 0, 1, or 2 only.");

        char[][] board = new char[3][3];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while(!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + " enter row and column");

            int row = 0;
            try {
                row = sc.nextInt();
                if (row < 0 || row > 2) {
                    throw new Exception("Invalid input! Enter a number between 0 and 2.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // clear the scanner buffer
                continue; // restart the loop
            }

            int col = 0;
            try {
                col = sc.nextInt();
                if (col < 0 || col > 2) {
                    throw new Exception("Invalid input! Enter a number between 0 and 2.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // clear the scanner buffer
                continue; // restart the loop
            }

            if(board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if(gameOver) {
                    System.out.println("Player " + player + " has won!");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        printBoard(board);
    }

    private static boolean haveWon(char[][] board, char player) {
        for(int row = 0; row < board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        for(int col = 0; col < board.length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------Board-------");

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  |  ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }
}
