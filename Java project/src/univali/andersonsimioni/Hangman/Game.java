package univali.andersonsimioni.Hangman;

public class Game {
    private final WordList WordList;
    private final Player Player;
    private SecretWord LocalSecretWord;
    private SecretWord.PlayResult LocalPlayResult;

    /**
     * Create new game with player and new secret word
     * @param player
     */
    public Game(Player player) {
        this.WordList = new WordList();
        this.Player = player;
    }

    /**
     * Start game with new secret word
     */
    public void startGame(){
        this.LocalSecretWord = this.WordList.getSecretWord();
    }

    /**
     * Reset game's secret word
     */
    public void endGame(){
        this.LocalSecretWord = null;
    }

    /**
     * Reset play result and get new secret word
     */
    public void getNewSecretWord() {
        this.LocalPlayResult = null;
        this.LocalSecretWord = this.WordList.getSecretWord();
    }

    public SecretWord getLocalSecretWord() {
        return LocalSecretWord;
    }

    /**
     * If game ended, return true, if not return false
     * @return
     */
    private boolean gameEnded(){
        return this.LocalPlayResult == SecretWord.PlayResult.WinGame ||
                this.LocalPlayResult == SecretWord.PlayResult.LoseGame;
    }

    /**
     * Render game result on console
     */
    private void renderGameResult(){
        switch (this.LocalPlayResult){
            case WinGame -> System.out.println("You Win game");
            case LoseGame -> System.out.println("You Lose game");
            case WrongLetter -> System.out.println("You wrong letter");
            case CorrectLetter -> System.out.println("You strike letter");
            case InvalidSize -> System.out.println("Please play valid letter");
            case LetterAlreadyPlayed -> System.out.println("You already play this letter");
        }

        if(!gameEnded())
            return;

        System.out.println("Player score: " + this.Player.getScore());
        System.out.println("To keep playing, solicit a new secret word");
    }

    /**
     * Add 1 point to player's score
     */
    private void addPointToPlayer(){
        this.Player.addScore(1);
    }

    /**
     * Check if player win, if win add score to player
     */
    private void checkIfPlayerWin(){
        if(this.LocalPlayResult == SecretWord.PlayResult.WinGame)
            this.addPointToPlayer();
        else if(this.LocalPlayResult == SecretWord.PlayResult.LoseGame){
            this.endGame();
        }
    }



    /**
     * Try to play letter in secret word
     * @param letter
     */
    public void tryLetter(String letter){
        if(this.LocalSecretWord == null){
            System.out.println("Game ended, please start a new game to continue\nYou score: "+this.Player.getScore());
            return;
        }
        if(!gameEnded()) {
            this.LocalPlayResult = this.LocalSecretWord.playLetter(letter);
            this.LocalSecretWord.renderDoll();
            this.LocalSecretWord.renderSemiWord();
            this.LocalSecretWord.renderCorrectLetters();
            this.LocalSecretWord.renderWrongLetters();
            renderGameResult();

            System.out.println("\n\n"); //Jump lines to view in test
        } else {
            this.checkIfPlayerWin();
            this.renderGameResult();
        }
    }

}
