package controller;

import model.Country;
import storage.CsvReaderExample;

import java.util.List;

public class StudentController {
    static CsvReaderExample tuan = CsvReaderExample.getInstance();
    static CsvReaderExample ky = CsvReaderExample.getInstance();

    public static void main(String[] args) {
        System.out.println(tuan);
        System.out.println(ky);
    }
    List<Country> countries = tuan.readFile("/data/countries.csv");
}
