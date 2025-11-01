public class Main {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        Student student1 = new Student("S1001", "Іван Петренко");
        student1.addGrade(95);
        student1.addGrade(88);
        student1.addGrade(92);

        Student student2 = new Student("S1002", "Марія Іваненко");
        student2.addGrade(78);
        student2.addGrade(85);

        Student student3 = new Student("S1003", "Петро Сидоренко");
        student3.addGrade(60);
        student3.addGrade(75);

        gradeBook.addStudent(student1);
        gradeBook.addStudent(student2);
        gradeBook.addStudent(student3);

        gradeBook.displayAllStudents();

        System.out.println("\nПошук студента S1002");
        Student foundStudent = gradeBook.findStudent("S1002");
        if (foundStudent != null) {
            System.out.println("Знайдено: " + foundStudent.getName() + " Оцінки: " + foundStudent.getGrades());
        } else {
            System.out.println("Студента не знайдено.");
        }

        System.out.println("\nПошук неіснуючого студента");
        Student notFoundStudent = gradeBook.findStudent("S9999");
        if (notFoundStudent != null) {
            System.out.println("Знайдено: " + notFoundStudent.getName());
        } else {
            System.out.println("Студента не знайдено.");
        }

        System.out.println("\nВидалення студента S1003");
        gradeBook.removeStudent("S1003");

        gradeBook.displayAllStudents();

        System.out.println("\nСпроба видалити S1003 знову");
        gradeBook.removeStudent("S1003");
    }
}