package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bruno.devesa on 19/10/2015.
 */

public class FileImport {

    static Scanner file;
    static final String EXTENSION = ".txt";

    public static ArrayList<ArrayList<String>> importDataFromFile (String filename) throws FileNotFoundException {

        file = new Scanner(new File(filename + EXTENSION));

        ArrayList<ArrayList<String>> data = new ArrayList();

        while ((file.hasNext())) {

            ArrayList line_data = new ArrayList<>();// create new ArrayList to save line
            data.add(line_data);//add new line in matrix

            String currentLine = file.nextLine();    // save current line from file

            String[] parts = currentLine.split(",");

            for (int j = 0; j < parts.length; j++) {
                line_data.add(parts[j]);
            }
        }
        file.close();

        return data;


    }
}
