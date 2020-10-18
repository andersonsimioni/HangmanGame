package univali.andersonsimioni.Hangman;

import univali.andersonsimioni.Files.FileIO;

import java.util.ArrayList;

public class WordList {
    private final ArrayList<String> wordlist;

    public WordList(String path) {
        ArrayList<String> lines = univali.andersonsimioni.Files.FileIO.ReadLines(path);
        this.wordlist = lines;
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String getSecretWord(){
        Integer linesNumber = this.wordlist.size();
        String secret = this.wordlist.get(this.getRandomNumber(0, linesNumber));

        return secret;
    }
}
