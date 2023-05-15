package pl.siftsystem.project.task4;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Teacher> teachers;
    private List<Group> groups;
    private List<Student> students;

    public School(String namen,Lsi) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.groups = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTe
}