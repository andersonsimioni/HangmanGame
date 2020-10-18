package univali.andersonsimioni.UnitTest;

/**
 * All test functions of Files.WordList
 */
public class WordList {

    /**
     * Test getSecretWord function of Files.WordList,
     * this test use 'WordList.txt' file in local path
     */
    public static void testWordList() {
        univali.andersonsimioni.Hangman.WordList wordList = new univali.andersonsimioni.Hangman.WordList("/home/bit/Documents/univali/programacao/HangmanGame/Java project/WordList.txt");
        System.out.println(wordList.getSecretWord());
    }
}
