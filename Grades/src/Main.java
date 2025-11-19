public class Main {
    public static void main(String[] args) {
        Schedule mySchedule = new Schedule();
        mySchedule.addLesson("IT-1", "Java Програмування", "18:30");
        mySchedule.addLesson("ENG-2", "Англійська мова", "10:00");
        mySchedule.addLesson("MATH-1", "Вища математика", "12:00");

        mySchedule.printAll();

        System.out.println("Шукаємо урок англійської");
        mySchedule.findLesson("ENG-2");
        System.out.println("\nВидаляємо математику");
        mySchedule.removeLesson("MATH-1");

        mySchedule.printAll();
    }
}