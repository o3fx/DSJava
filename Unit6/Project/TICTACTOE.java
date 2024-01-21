import java.util.Scanner;

class Board {
    char[][] board = {
            { '*', '*', '*' },
            { '*', '*', '*' },
            { '*', '*', '*' }
    };

    public int count = 0;

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    /*
     * this method updates a row with a cell with charecter key
     * for row and col.
     * It returns true if it was succesufl in updating the cell
     */
    public boolean updateBoard(int row, int col, char key) {
        // check limits
        if (row < 0 || row >= 3) {
            return false;
        }

        if (col < 0 || col >= 3) {
            return false;
        }

        if (board[row][col] == '*') {
            board[row][col] = key;
            count++;
            return true;
        } else {
            return false;
        }

    }
    public boolean checkWinner() {
        for (int row = 0; row < 3; row++) {
            if(board[row][0] == 'o' && board[row][1] == 'o' && board[row][2] == 'o'){
                System.out.println("Player 1 wins");
                return true;
            } else if (board[row][0] == 'x' && board[row][1] == 'x' && board[row][2] == 'x') {
                System.out.println("Player 2 wins: ");
                return true;
            }
        }
        for (int col = 0; col < 3; col++) {
            if(board[col][0] == 'o' && board[col][1] == 'o' && board[col][2] == 'o'){
                System.out.println("Player 1 wins");
                return true;
            } else if (board[col][0] == 'x' && board[col][1] == 'x' && board[col][2] == 'x') {
                System.out.println("Player 2 wins: ");
                return true;
            }
        }
        if (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o') {
            System.out.println("Player 1 wins");
            return true;
        }
        if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] =='x') {
            System.out.println("Player 2 wins");
            return true;
        }
        if (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o') {
            System.out.println("Player 1 wins");
            return true;
        }
        if (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x') {
            System.out.println("Player 2 wins");
            return true;
        }
        return false;
    }
}



public class TICTACTOE {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Board gameBoard = new Board();

        int currentPlayer = 1;
        int row, col;
        String reply;
        while (true) {
            // display.board
            clearScreen();
            gameBoard.printBoard();
            System.out.println("Player # " + currentPlayer + ": ");
            System.out.print("Enter the row for your next move (or 'q' to quit): ");
            reply = input.next();

            if (reply.equals("q") || reply.equals("Q")) {
                System.out.println("bye...");
                break;
            }
            row = Integer.valueOf(reply);

            System.out.print("Enter the column for your next move (or 'q' to quit): ");
            reply = input.next();

            if (reply.equals("q") || reply.equals("Q")) {
                System.out.println("bye...");
                break;
            }

            col = Integer.valueOf(reply);

            boolean result;
            if(currentPlayer == 1) {
                result = gameBoard.updateBoard(row, col, 'o');
            } else {
                result = gameBoard.updateBoard(row, col, 'x');
            }

            if (result == false) {
                System.out.println("eRrOr InVaLiD mOvE. Press <C> to continue ");
                input.next();
                continue;
            } else {
                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
            }
            
            if (gameBoard.checkWinner() == true) {
                currentPlayer = currentPlayer - 1;
                clearScreen();
                gameBoard.printBoard();
                System.out.println("A player has won");
                break;
            }

            if (gameBoard.count == 9) {
                System.out.println("Board is filled!");
                break;
            }
        }

    

    }
}