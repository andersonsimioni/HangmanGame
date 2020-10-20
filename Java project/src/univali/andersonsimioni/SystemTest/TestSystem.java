package univali.andersonsimioni.SystemTest;

import univali.andersonsimioni.Hangman.Player;
import univali.andersonsimioni.Hangman.Game;
import univali.andersonsimioni.Hangman.SecretWord;
import univali.andersonsimioni.Hangman.WordList;

public class TestSystem {

    public static void run() {
        Player player = new Player("Willian de Souza", 0);
        Game game = new Game(player);
        game.startGame();
        game.tryLetter("a");
        game.tryLetter("b");
        game.tryLetter("b");
        game.tryLetter("b123");
        game.tryLetter("c");
        game.tryLetter("d");
        game.tryLetter("e");
        game.tryLetter("f");
        game.tryLetter("g");

        System.out.println("\n\n<------ NEW WORD ------>\n");
        game.getNewSecretWord();
        game.endGame();
        game.tryLetter("a");
    }
}
