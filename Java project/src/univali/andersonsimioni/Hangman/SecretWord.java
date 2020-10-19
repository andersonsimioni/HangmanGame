package univali.andersonsimioni.Hangman;

import java.util.ArrayList;

public class SecretWord {

    /**
     * Player round result
     */
    public enum PlayResult{
        LoseGame,
        WinGame,
        WrongLetter,
        InvalidSize,
        CorrectLetter,
        LetterAlreadyPlayed
    }

    private final String Word;
    private final ArrayList<String> CorrectLetters;
    private final ArrayList<String> WrongLetters;

    /**
     * Render in DOS console correct played letters
     */
    public void renderCorrectLetters(){
        if(CorrectLetters == null || CorrectLetters.size() == 0)
            return;

        String data = "-> Correct played letters: [ ";
        for(String l:CorrectLetters)
            data += l + "; ";

        data += "]";
        System.out.println(data);
    }

    /**
     * Render all played wrong letters
     */
    public void renderWrongLetters(){
        if(WrongLetters == null || WrongLetters.size() == 0)
            return;

        String data = "-> Wrong played letters: [ ";
        for(String l:WrongLetters)
            data += l + "; ";

        data += "]";
        System.out.println(data);
    }

    /**
     * Render hangman doll in DOS console
     */
    public void renderDoll(){
        int wrongs = WrongLetters.size();
        boolean head = wrongs >= 1;
        boolean body = wrongs >= 2;
        boolean leftArm = wrongs >= 3;
        boolean rightArm = wrongs >= 4;
        boolean leftLeg = wrongs >= 5;
        boolean rightLeg = wrongs >= 6;

        System.out.print("+=====+");
        System.out.print("\n||    |");
        System.out.print("\n||    " + (head ? "o" : " "));

        System.out.print("\n||   ");
        System.out.print((leftArm ? "/" : " "));
        System.out.print(body ? "|" : " ");
        System.out.print(rightArm ? "\\" : " ");

        System.out.print("\n||   ");
        System.out.print(leftLeg ? "/" : " ");
        System.out.print(rightLeg ? " \\" : " ");

        System.out.print("\n------------\n");
    }

    /**
     * Return play result of letter
     * @param letter to play
     * @return play result
     */
    public PlayResult playLetter(String letter){
        //Validate letter size
        if(letter == null || letter.isEmpty() || letter.length() > 1)
            return PlayResult.InvalidSize;

        //Validate if letter already played
        if(CorrectLetters.contains(letter) || WrongLetters.contains(letter))
            return PlayResult.LetterAlreadyPlayed;

        //Result of round
        PlayResult result = PlayResult.WrongLetter;

        //Check if word contains letter
        if(Word.contains(letter)){
            CorrectLetters.add(letter);
            result = PlayResult.CorrectLetter;
        }
        else
            WrongLetters.add(letter);

        //Check if lose game
        if(WrongLetters.size() >= 6)
            result = PlayResult.LoseGame;

        //Check if win game
        if(CorrectLetters.size() == Word.length())
            result = PlayResult.WinGame;

        return result;
    }


    @Override
    public String toString() {
        return "SecretWord{" +
                "Word='" + Word + '\'' +
                '}';
    }

    public boolean haveLetter(String letter){
        if(this.CorrectLetters.contains(letter)){
            this.CorrectLetters.remove(letter);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Custom constructor
     * @param word to place secret word
     */
    public SecretWord(String word){
        if(word == null || word.isEmpty())
            throw new IllegalArgumentException("Invalid word");

        this.Word = word;
        this.WrongLetters = new ArrayList<String>();
        this.CorrectLetters = new ArrayList<String>();
    }
}
