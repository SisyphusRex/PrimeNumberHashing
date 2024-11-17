package primenumberhashing.src;

//System Imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

//First Party Imports
import primenumberhashing.src.UserInterface;

public class CSVReader {

    public HashMap<String, String> getHashMapFromCSV(String filePath) {
        HashMap<String, String> data = new HashMap<>();
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(",");
                data.put(splitLine[0], splitLine[1]);
            }
        } catch (FileNotFoundException e) {
            UserInterface.displayFileNotFoundError();
        } catch (IndexOutOfBoundsException e) {
            UserInterface.displayIndexError();
        }

        return data;
    }

}