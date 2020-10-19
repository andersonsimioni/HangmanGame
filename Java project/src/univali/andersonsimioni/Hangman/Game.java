package univali.andersonsimioni.Hangman;

public class Game {
    private final WordList wordList;
    private final Player player;
    private SecretWord secretWord;
    private SecretWord.PlayResult playResult;

    public Game(Player player) {
        this.wordList = new WordList();
        this.secretWord = this.wordList.getSecretWord();
        this.player = player;
    }

    public void getNewSecretWord() {
        this.playResult = null;
        this.secretWord = this.wordList.getSecretWord();
    }

    public SecretWord getSecretWord() {
        return secretWord;
    }

    private boolean gameEnded(){
        return this.playResult == SecretWord.PlayResult.WinGame ||
                this.playResult == SecretWord.PlayResult.LoseGame;
    }

    private void showGameResult(){
        if(this.playResult == SecretWord.PlayResult.WinGame){
            System.out.println("You Win game");
        }
        if(this.playResult == SecretWord.PlayResult.LoseGame){
            System.out.println("You Lose game");
        }
        System.out.println("To keep playing, solicit a new secret word");
    }

    public void tryLetter(String letter){
        if(!gameEnded()) {
            this.playResult = this.secretWord.playLetter(letter);
            this.secretWord.renderDoll();
            this.secretWord.renderCorrectLetters();
            this.secretWord.renderWrongLetters();
        } else {
            this.showGameResult();
        }
    }

}
