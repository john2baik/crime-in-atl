package parser;

import java.io.File;
import java.io.IOException;

import com.opencsv.CSVReader;
import domain.Crime;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class DataParser {

    private File importedFile = null;
    private List<Crime> crimeList;
    private static final String CSV_FILE_PATH = "\"C:\\\\atlanta-crimes\\\\src\\\\main\\\\resources\\\\2018_crimes.txt\")";


    public DataParser() throws IOException{

        this.importedFile = cleanData();
    }

    private File cleanData() throws IOException{
        try(
            Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
            CSVReader csvReader = new CSVReader(reader);
        )
    }



}
