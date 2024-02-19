package service.student;

import model.Student;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StudentDAO implements IStudentDAO{
    Connection connection = ;
    @Override
    public List<Student> getall() {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void saveTransaction(Student student, List<Integer> classes) {

    }
}
