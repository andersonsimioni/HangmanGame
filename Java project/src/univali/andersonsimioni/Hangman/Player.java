package univali.andersonsimioni.Hangman;

public class Player {
    private final String name;
    private Integer score;

    public Player(String name, Integer score) {
        this.name = name;
    }

    public void addScore(Integer score){
        this.score += score;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}
