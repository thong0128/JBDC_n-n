package service;

import model.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentDAO implements IStudentDAO{
    @Override
    public void insertStudent(Student student) throws SQLException {

    }

    @Override
    public Student getStudent(int studentId) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public boolean deleteStudent(int studentId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateStudent(Student student) throws SQLException {
        return false;
    }
}
