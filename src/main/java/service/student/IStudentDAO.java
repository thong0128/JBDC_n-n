package service.student;

import model.Student;
import service.IServiceDAO;

import java.sql.SQLException;
import java.util.List;

public interface IStudentDAO extends IServiceDAO<Student> {
    void saveTransaction(Student student, List<Integer> classes);
}
