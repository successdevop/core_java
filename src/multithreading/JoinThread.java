package multithreading;

public class JoinThread{
    public static void main(String[] args) throws InterruptedException {
        PlayerThread[] players = new PlayerThread[4];

        for (int i = 0; i < players.length; i++){
            players[i] = new PlayerThread(i+1);
            players[i].start();
        }

        for (PlayerThread player : players){
            player.join();
        }

        int winningScore = 0;
        int winner = 0;
        for (int i = 0; i < players.length; i++){
            if (players[i].getScore() > winningScore){
                winningScore = players[i].getScore();
                winner = i+1;
            }
        }

        System.out.println("Player "+winner+" wins with a score of "+winningScore);
    }
}