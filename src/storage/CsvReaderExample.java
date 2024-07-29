package storage;

import model.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderExample {
    private static final String COMMA_DELIMITER = ","; // Split by comma

    public static void main(String[] args) {

        List<Country> countries = readFile("data/countries.csv");
        System.out.println(countries);
    }

    private static List<Country> readFile(String fileName) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(fileName));

            // How to read file in java line by line?
            List<String> countries = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                countries.add(line);
            }
            List<Country> countries1 = getCountries(countries);
            return countries1;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        return null;
    }

    private static List<Country> getCountries(List<String> strings){
        strings.remove(0);
        List<Country> countries = new ArrayList<>();
        for (String string : strings) {
            String[] splitData = string.split(COMMA_DELIMITER);
            int id = Integer.parseInt(splitData[0]);
            String code = splitData[1];
            String name = splitData[2];
            Country country = new Country(id, code, name);
            countries.add(country);
        }
        return countries;
    }


}
