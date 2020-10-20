package univali.andersonsimioni.Hangman;

import univali.andersonsimioni.Math.PrettyRandom;

import java.util.ArrayList;

public class WordList {
    private final ArrayList<String> WordList;
    private static final String FileName = "WordList.txt";

    /**
     * get new SecretWord with word from wordlist file
     * @return new SecretWord
     */
    public SecretWord getSecretWord(){
        Integer linesNumber = this.WordList.size();
        String secret = this.WordList.get(PrettyRandom.Get(0, linesNumber));

        return new SecretWord(secret);
    }

    /**
     * Custom constructor,
     * read words from internal saved file path
     */
    public WordList() {
        ArrayList<String> lines = univali.andersonsimioni.Files.FileIO.readLines(FileName);
        this.WordList = lines;
    }
}
