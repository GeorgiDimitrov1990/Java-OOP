package StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsList;

    public StudentSystem() {
        this.studentsList = new HashMap<>();
    }

    public Map<String, Student> getStudentsList() {
        return this.studentsList;
    }

    public void createStudent(String name, int age, double grade){
        this.studentsList.putIfAbsent(name, new Student(name,age,grade));
    }

    public void showStudent(String name){
        System.out.println(studentsList.get(name).toString());
    }


}
