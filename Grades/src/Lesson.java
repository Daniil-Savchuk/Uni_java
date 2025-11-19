public class Lesson {
    String classCode;
    String subjectName;
    String time;

    public Lesson(String classCode, String subjectName, String time) {
        this.classCode = classCode;
        this.subjectName = subjectName;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Час: " + time + "  Предмет: " + subjectName + " Код: " + classCode;
    }
}