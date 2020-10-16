package univali.andersonsimioni.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create stream with file to read or write data
 * of file in specified path
 */
public class FileIO {

    /**
     * Read all lines from text file
     * @param path location of file
     * @return string data in lines of file
     */
    public static ArrayList<String> ReadLines(String path){
        try {
            File file = new File(path);
            ArrayList<String> lines = new ArrayList<>();
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine())
                lines.add(myReader.nextLine());

            return lines;
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("File not found '" + path + "'\n");
            System.out.println("StackTrace: " + fileNotFoundException.getStackTrace());
            return null;
        }
    }

}
