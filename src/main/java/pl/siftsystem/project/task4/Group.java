package pl.siftsystem.project.task4;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students;
    private Teacher teacher;

    public Group(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Group: ").append(name).append("\n");
        builder.append("Teacher: ").append(teacher.toString()).append("\n");
        builder.append("Students:\n");
        for (Student student : students) {
            builder.append("- ").append(student.toString()).append("\n");
        }
        return builder.toString();
    }
}