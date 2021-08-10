package StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    @Override
    public String toString() {
        return this.name + " is " + this.age + " years old." + this.commentary(this.grade);
    }

    private String commentary(double grade){
        if (grade >= 5.00) {
            return    " Excellent student.";
        } else if (grade < 5.00 && grade >= 3.50) {
          return  " Average student.";
        } else {
           return " Very nice person.";
        }
    }
}
