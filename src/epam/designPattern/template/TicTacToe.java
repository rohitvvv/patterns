package epam.designPattern.template;

/**
 * Created by vaidyar on 3/7/17.
 */
public class TicTacToe extends Game {

    char [][]board;

    @Override
    public void SetupGame(){
        board= new char[3][3];
        //Setup the players
        super.SetupGame();
    }

    /**
     * Check the board state to detect if the game is over
     * x x x
     * x x x
     * x x x
     * @return
     */
    boolean IsGameOver(){
        //All rows
        for(int i=0;i<3;i++){
            if(board[i][0]==board[i][1]&&board[i][0]==board[i][2]){
                return true;
            }
        }
        //Check Columns
        for(int i=0;i<3;i++){
            if(board[0][i]==board[1][i]&&board[0][i]==board[2][i]){
                return true;
            }
        }
        //Check diagonals
        //00 01 02
        //10 11 12
        //20 21 22
        if(board[0][0]==board[1][1]&&board[1][1]==board[2][2])
            return true;

        if(board[2][0]==board[1][1]&&board[1][1]==board[0][2])
            return true;

        return false;
    }

    void DisplayWinner(){
         //Implement the code.
    }
}


