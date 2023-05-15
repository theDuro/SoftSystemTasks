package pl.siftsystem.project.task4;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String firstName;
    private String lastName;
    private List<Group> teachingGroups;

    public Teacher(String firstName, String lastName,List<Group> groups) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teachingGroups = groups;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Group> getTeachingGroups() {
        return teachingGroups;
    }

    public void addTeachingGroup(Group group) {
        teachingGroups.add(group);
    }

    public void removeTeachingGroup(Group group) {
        teachingGroups.remove(group);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}