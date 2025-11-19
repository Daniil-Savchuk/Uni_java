import java.util.HashMap;

public class Schedule {
    HashMap<String, Lesson> scheduleMap = new HashMap<>();

    public void addLesson(String code, String name, String time) {
        Lesson newLesson = new Lesson(code, name, time);
        scheduleMap.put(code, newLesson);
        System.out.println("Додано урок: " + name);
    }

    public void removeLesson(String code) {
        if (scheduleMap.containsKey(code)) {
            scheduleMap.remove(code);
            System.out.println("Видалено урок з кодом: " + code);
        } else {
            System.out.println("Помилка: Такого коду не існує!");
        }
    }

    public void findLesson(String code) {
        Lesson found = scheduleMap.get(code);
        if (found != null) {
            System.out.println("Знайдено: " + found);
        } else {
            System.out.println("Урок з кодом " + code + " не знайдено.");
        }
    }

    public void printAll() {
        System.out.println("\n======= ВЕСЬ РОЗКЛАД =======");
        if (scheduleMap.isEmpty()) {
            System.out.println("Розклад порожній.");
        } else {
            for (Lesson lesson : scheduleMap.values()) {
                System.out.println(lesson);
            }
        }
        System.out.println("============================\n");
    }
}