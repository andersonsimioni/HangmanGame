package univali.andersonsimioni.Hangman;

public class Player {
    private final String Name;
    private Integer Score;

    public Player(String name) {
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("name is null or emtpy");

        this.Score = 0;
        this.Name = name;
    }

    /**
     * Add points to player's score
     * @param scorePoints
     */
    public void addScore(Integer scorePoints){
        this.Score += scorePoints;
    }

    public String getName() {
        return Name;
    }

    public Integer getScore() {
        return (Score != null ? Score : 0);
    }
}
