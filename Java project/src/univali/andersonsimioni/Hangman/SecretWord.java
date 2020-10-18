package univali.andersonsimioni.Hangman;

import java.util.ArrayList;

public class SecretWord {

    /**
     * Player round result
     */
    enum PlayResult{
        LoseGame,
        WinGame,
        WrongLetter,
        CorrectLetter,
        InvalidSize,
        LetterAlreadyPlayed
    }

    private final String Word;
    private final ArrayList<String> CorrectLetters;
    private final ArrayList<String> WrongLetters;

    /**
     * Render hangman doll in DOS console
     */
    protected void RenderDoll(){
        int wrongs = WrongLetters.size();
        boolean head = wrongs >= 1;
        boolean body = wrongs >= 2;
        boolean leftArm = wrongs >= 3;
        boolean rightArm = wrongs >= 4;
        boolean leftLeg = wrongs >= 5;
        boolean rightLeg = wrongs >= 6;

        System.out.println("+=====+");
        System.out.println("||    |");
        System.out.println("||    " + (head ? "o" : " "));
        System.out.println("||   " + (leftArm ? "/" : " "));
        System.out.print(body ? "|" : " ");
        System.out.print(rightArm ? "\\" : " ");
        System.out.println("||   " + (leftLeg ? "/" : " "));
        System.out.print(rightArm ? " \\" : " ");
        System.out.println("------------");
    }

    /**
     * Return play result of letter
     * @param letter to play
     * @return play result
     */
    protected PlayResult PlayLetter(String letter){
        //Validate letter size
        if(letter == null || letter.isEmpty() || letter.length() > 1)
            return PlayResult.InvalidSize;

        //Validate if letter already played
        if(CorrectLetters.contains(letter) || WrongLetters.contains(letter))
            return PlayResult.LetterAlreadyPlayed;

        //Check if word contains letter
        if(Word.contains(letter)){
            CorrectLetters.add(letter);
            return PlayResult.CorrectLetter;
        }

        //Add wrong letter and result Wrong result
        WrongLetters.add(letter);
        return PlayResult.WrongLetter;
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
