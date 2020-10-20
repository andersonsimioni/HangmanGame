package univali.andersonsimioni.UnitTest;

public class SecretWord {
    /**
     * Test playLetter function of SecretWord class
     */
    public static void playLetter(){
        univali.andersonsimioni.Hangman.SecretWord secretWord;
        univali.andersonsimioni.Hangman.SecretWord.PlayResult result;
        secretWord = new univali.andersonsimioni.Hangman.SecretWord("TestingWord123");

        result = secretWord.playLetter("a");
        System.out.println("Letter 'a' play result: " + result);

        result = secretWord.playLetter("t");
        System.out.println("Letter 't' play result: " + result);

        result = secretWord.playLetter("sdnf");
        System.out.println("Letter 'sdnf' play result: " + result);
    }

    /**
     * Test renderDoll function of SecretWord class
     */
    public static void renderDoll(){
        univali.andersonsimioni.Hangman.SecretWord secretWord;
        univali.andersonsimioni.Hangman.SecretWord.PlayResult result;
        secretWord = new univali.andersonsimioni.Hangman.SecretWord("TestingWord123");

        result = secretWord.playLetter("a");
        result = secretWord.playLetter("b");
        result = secretWord.playLetter("c");
        result = secretWord.playLetter("d");
        result = secretWord.playLetter("t");
        result = secretWord.playLetter("z");
        result = secretWord.playLetter("x");
        result = secretWord.playLetter("y");
        //result = secretWord.playLetter("sdnf");

        secretWord.renderDoll();
    }

    /**
     * Render test, test renderCorrectLetters of SecretWord class
     */
    public static void renderCorrectLetters(){
        univali.andersonsimioni.Hangman.SecretWord secretWord;
        univali.andersonsimioni.Hangman.SecretWord.PlayResult result;
        secretWord = new univali.andersonsimioni.Hangman.SecretWord("TestingWord123");

        result = secretWord.playLetter("a");
        result = secretWord.playLetter("b");
        result = secretWord.playLetter("c");
        result = secretWord.playLetter("d");
        result = secretWord.playLetter("t");
        result = secretWord.playLetter("sdnf");

        secretWord.renderCorrectLetters();
    }

    /**
     * Render test, test renderWrongLetters of SecretWord class
     */
    public static void renderWrongLetters(){
        univali.andersonsimioni.Hangman.SecretWord secretWord;
        univali.andersonsimioni.Hangman.SecretWord.PlayResult result;
        secretWord = new univali.andersonsimioni.Hangman.SecretWord("TestingWord123");

        result = secretWord.playLetter("a");
        result = secretWord.playLetter("b");
        result = secretWord.playLetter("c");
        result = secretWord.playLetter("d");
        result = secretWord.playLetter("t");
        result = secretWord.playLetter("sdnf");

        secretWord.renderWrongLetters();
    }
}
