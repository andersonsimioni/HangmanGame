package univali.andersonsimioni.Hangman;

public class Player {
    private final String Name;
    private Integer Score;

    public Player(String name, Integer score) {
        this.Name = name;
    }

    public void addScore(Integer score){
        this.Score += score;
    }

    public String getName() {
        return Name;
    }

    public Integer getScore() {
        return (Score != null ? Score : 0);
    }
}
