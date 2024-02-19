package model;

import java.util.List;

public class Classes {
    protected int id;
    protected String name;
    protected String description;
    protected List<Student> studentList;

    public Classes() {
    }

    public Classes(int id, String name, String description, List<Student> studentList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.studentList = studentList;
    }

    public Classes(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Classes(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
