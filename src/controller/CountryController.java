package controller;

import model.Country;
import storage.CsvReaderExample;

import java.util.List;

public class CountryController {
    private CsvReaderExample ky = CsvReaderExample.getInstance();
    private List<Country> countries = ky.readFile("data/countries.csv");
}
