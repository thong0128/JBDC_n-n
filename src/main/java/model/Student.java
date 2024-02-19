package model;

import java.util.List;

public class Student {
    protected int id;
    protected String name;
    protected String country;
    protected List<Classes> classesList;

    public Student() {
    }

    public Student(String name, String country) {
        this.name = name;
        this.country = country;
    }
    public Student(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Student(int id, String name, String country, List<Classes> classesList) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.classesList = classesList;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
