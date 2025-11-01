import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private HashMap<String, Student> students;

    public GradeBook() {
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        if (student == null || student.getID() == null) {
            System.out.println("Помилка: Неможливо додати null студента або студента без ID.");
            return;
        }
        students.put(student.getID(), student);
        System.out.println("Додано студента: " + student.getName());
    }

    public void removeStudent(String studentID) {
        Student removedStudent = students.remove(studentID);

        if (removedStudent != null) {
            System.out.println("Видалено студента: " + removedStudent.getName());
        } else {
            System.out.println("Помилка: Студента з ID " + studentID + " не знайдено.");
        }
    }

    public Student findStudent(String studentID) {
        return students.get(studentID);
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Журнал оцінок порожній.");
            return;
        }

        System.out.println("\nСписок всіх студентів:");
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
}