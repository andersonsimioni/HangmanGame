package univali.andersonsimioni.Hangman;

public class Game {
    private final WordList WordList;
    private final Player Player;
    private SecretWord LocalSecretWord;
    private SecretWord.PlayResult LocalPlayResult;

    public Game(Player player) {
        this.WordList = new WordList();
        this.LocalSecretWord = this.WordList.getSecretWord();
        this.Player = player;
    }

    public void getNewSecretWord() {
        this.LocalPlayResult = null;
        this.LocalSecretWord = this.WordList.getSecretWord();
    }

    public SecretWord getLocalSecretWord() {
        return LocalSecretWord;
    }

    private boolean gameEnded(){
        return this.LocalPlayResult == SecretWord.PlayResult.WinGame ||
                this.LocalPlayResult == SecretWord.PlayResult.LoseGame;
    }

    private void showGameResult(){
        switch (this.LocalPlayResult){
            case WinGame -> System.out.println("You Win game");
            case LoseGame -> System.out.println("You Lose game");
        }

        System.out.println("Player score: " + this.Player.getScore());
        System.out.println("To keep playing, solicit a new secret word");
    }

    private void addPointToPlayer(){
        this.Player.addScore(1);
    }

    private void checkIfPlayerWin(){
        if(this.LocalPlayResult == SecretWord.PlayResult.WinGame)
            this.addPointToPlayer();
    }

    public void tryLetter(String letter){
        if(!gameEnded()) {
            this.LocalPlayResult = this.LocalSecretWord.playLetter(letter);
            this.LocalSecretWord.renderDoll();
            this.LocalSecretWord.renderCorrectLetters();
            this.LocalSecretWord.renderWrongLetters();
        } else {
            this.checkIfPlayerWin();
            this.showGameResult();
        }
    }

}
