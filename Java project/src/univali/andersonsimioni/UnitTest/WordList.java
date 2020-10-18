package univali.andersonsimioni.UnitTest;

public class WordList {
    public static void testWordList() {
        univali.andersonsimioni.Hangman.WordList wordList = new univali.andersonsimioni.Hangman.WordList("/home/bit/Documents/univali/programacao/HangmanGame/Java project/ReadLines.txt");
        System.out.println(wordList.getSecretWord());
    }
}
