package service;

import model.Student;

import java.sql.SQLException;
import java.util.List;

public interface IStudentDAO {
    public void insertStudent(Student student) throws SQLException;
    public Student getStudent(int studentId);
    public List<Student> getAllStudents();
    public boolean deleteStudent(int studentId) throws SQLException;
    public boolean updateStudent(Student student) throws SQLException;
}
