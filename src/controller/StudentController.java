package controller;

import model.Student;
import storage.ReadFileStudent;
import storage.WriteStudentFile;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    public static List<Student> students = ReadFileStudent.readFile("data/students.csv");


    public static List<Student> getAllStudents() {
        List<Student> students = ReadFileStudent.readFile("data/students.csv");
        return students;
    }

    public static void createStudent(Student student) {
        students.add(student);
        WriteStudentFile.writeStudents(students);
    }
}
