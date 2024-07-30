package storage;

import model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileStudent {
    private static final String COMMA_DELIMITER = ","; // Split by comma

    public static List<Student> readFile(String fileName) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(fileName));

            // How to read file in java line by line?
            List<String> countries = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                countries.add(line);
            }
            List<Student> countries1 = getStudents(countries);
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

    private static List<Student> getStudents(List<String> strings){
        strings.remove(0);
        List<Student> students = new ArrayList<>();
        for (String string : strings) {
            String[] splitData = string.split(COMMA_DELIMITER);
            int id = Integer.parseInt(splitData[0]);
            String name = splitData[1];
            int age = Integer.parseInt(splitData[2]) ;
            Student student = new Student(id, name, age);
            students.add(student);
        }
        return students;
    }
}
