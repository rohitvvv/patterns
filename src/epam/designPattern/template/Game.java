package epam.designPattern.template;


interface Player{
    String getName();
    boolean equals(Object o);
    int hashCode();
    void setPlayerName(String name);
}

class RealPlayer implements Player {
    String name;

    RealPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPlayerName(String name) {
        this.name=name;
    }
}

/**
 * Created by vaidyar on 3/7/17.
 * Class for a turn based game
 */
abstract public class Game {
    boolean turn;
    Player player1,player2;

    /**
     * This is a stub method which just sets up the players
     * Clients to implement Game specific setup e.g: Board of Chess/TicTacToe
     */
    public void SetupGame(){
        turn=Boolean.TRUE;
        player1=new RealPlayer("A");
        player2=new RealPlayer("B");
    }

    /**
     * Turn based game
     * @return
     */
    public  Player TakeTurn(){
       if(turn){
           turn=!turn;
           return player1;
       }
       else{
           turn=!turn;
           return player2;
       }
    }

    /**
     * Stub method.
     * To be implemented in detail by the specific game
     * @return
     */
    boolean IsGameOver(){
        return false;
    }

    /**
     * Stub Method
     * To be implmented by the specific game
     */
    void DisplayWinner(){
        System.out.println("Not Implemented");
    }
}

