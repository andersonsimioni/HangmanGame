package univali.andersonsimioni.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * Create stream with file to read or write data
 * of file in specified path
 */
public class FileIO {
    /**
     * Internal function to develop in 2 computers
     * @return
     */
    private static String selectCorrectPath(String fileName){
        String device = DeviceInformation.getComputerName();

        if(device.equals("DESKTOP-0H304KQ"))
            return fileName;

        return "/home/bit/Documents/univali/programacao/HangmanGame/Java project/" + fileName;
    }

    /**
     * Read all lines from text file
     * @param fileName name of file to read in local path files
     * @return string data in lines of file
     */
    public static ArrayList<String> ReadLines(String fileName){
        String path = selectCorrectPath(fileName);

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
