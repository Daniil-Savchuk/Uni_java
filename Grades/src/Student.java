import java.util.ArrayList;
import java.util.List;

public class Student {
    private String ID;
    private String name;
    private List<Integer> grades;

    public Student(String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Ім'я: " + name + ", Оцінки: " + grades;
    }
}

