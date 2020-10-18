package univali.andersonsimioni.Hangman;

import univali.andersonsimioni.Files.FileIO;

import java.util.ArrayList;

public class WordList {
    private final ArrayList<String> wordlist;
    private final String Path = "WordList.txt";

    /**
     * Constructon for WordList class
     * @param fileName for wordlist text file
     */
    public WordList(String fileName) {
        ArrayList<String> lines = univali.andersonsimioni.Files.FileIO.ReadLines(fileName);
        this.wordlist = lines;
    }

    /**
     * calculate random number between range
     * @param min minimum number of range
     * @param max max number of range
     * @return random number between range
     */
    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    /**
     * get new SecretWord with word from wordlist file
     * @return new SecretWord
     */
    public SecretWord getSecretWord(){
        Integer linesNumber = this.wordlist.size();
        String secret = this.wordlist.get(this.getRandomNumber(0, linesNumber));

        return new SecretWord(secret);
    }
}
