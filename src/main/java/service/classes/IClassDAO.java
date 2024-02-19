package service.classes;

import model.Classes;
import service.IServiceDAO;

import java.util.List;

public interface IClassDAO extends IServiceDAO<Classes> {
    List<Classes> findAllByStudentId(int studentId);
}
