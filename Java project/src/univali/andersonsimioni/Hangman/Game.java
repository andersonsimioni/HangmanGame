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
        this.LocalSecretWord = this.WordList.getSecretWord();
        this.Player = player;
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
        }

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
    }

    /**
     * Try to play letter in secret word
     * @param letter
     */
    public void tryLetter(String letter){
        if(!gameEnded()) {
            this.LocalPlayResult = this.LocalSecretWord.playLetter(letter);
            this.LocalSecretWord.renderDoll();
            this.LocalSecretWord.renderSemiWord();
            this.LocalSecretWord.renderCorrectLetters();
            this.LocalSecretWord.renderWrongLetters();
        } else {
            this.checkIfPlayerWin();
            this.renderGameResult();
        }
    }

}
