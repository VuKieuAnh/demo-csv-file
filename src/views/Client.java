package views;

import controller.StudentController;
import model.Student;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Student> students = StudentController.getAllStudents();
        System.out.println(students);

        Student student = new Student(3, "Tuan", 22);
        StudentController.createStudent(student);
    }
}
