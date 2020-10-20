package univali.andersonsimioni.UnitTest;

import java.util.ArrayList;

/**
 * All test functions of Files.FileIO
 */
public class FileIO {

    /**
     * Test ReadLines function of Files.FileIO,
     * this test use 'ReadLines.txt' file in local path
     */
    public static void TestReadLines(){
        ArrayList<String> lines = univali.andersonsimioni.Files.FileIO.readLines("ReadLines.txt");

        for (String line:lines)
            System.out.println(line);
    }

}
