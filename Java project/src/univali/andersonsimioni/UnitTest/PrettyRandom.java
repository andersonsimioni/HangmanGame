package univali.andersonsimioni.UnitTest;

public class PrettyRandom {

    /**
     * Test if PrettyRandom get real random numbers
     */
    public static void getRandomNumber(){
        int number = univali.andersonsimioni.Math.PrettyRandom.Get(-100, 100);
        System.out.println("Random number between -100 and 100 is " + number);
    }
}
