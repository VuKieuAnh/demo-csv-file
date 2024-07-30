package storage;

import model.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteStudentFile {
    // Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    // CSV file header
    private static final String FILE_HEADER = "id,name,age";

//    tach phuong thuc ra:
//    ghi file: co tham so danh sach student

    public static void writeStudents(List<Student> students) {
        String fileName= "data/students.csv";
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Student student : students) {
                fileWriter.append(student.getId() + COMMA_DELIMITER);
                fileWriter.append(student.getName() + COMMA_DELIMITER);
                fileWriter.append(student.getAge() + NEW_LINE_SEPARATOR);
            }
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
