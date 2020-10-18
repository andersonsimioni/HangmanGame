package univali.andersonsimioni.Math;

public class PrettyRandom {
    /**
     * Get random number
     * @param min random number
     * @param max random number
     * @return random number between min and max
     */
    public static int Get(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
}
