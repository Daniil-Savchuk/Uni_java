import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // 1
    public static void main(String[] args) {
        System.out.println("1");
        ArrayList<String> color = new ArrayList<String>();
        color.add("red");
        color.add("blue");
        color.add("black");

        //2
        System.out.println("2");
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i));
        }
        //3
        System.out.println("3");
        color.add(0, "black");
        System.out.println();
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i));
        }
        //4
        System.out.println("4");
        System.out.println(color.get(1));
        //5
        System.out.println("5");
        color.set(0, "yellow");
        System.out.println();
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i));
        }
        //6
        System.out.println("6");
        System.out.println(color.remove(2));
        System.out.println();
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i));
        }
        //7
        System.out.println("7");
        System.out.println(color.contains("blue"));
        System.out.println(color.contains("red"));

        //8
        System.out.println("8");
        Collections.sort(color);
        for (String i : color) {
            System.out.println(i);
        }
        //9
        System.out.println("9");
        ArrayList colorsCopy = (ArrayList)color.clone();
        System.out.println(colorsCopy);
        //10
        System.out.println("10");
        Collections.reverse(color);
        System.out.println(color);
        //11
        System.out.println("11");
        ArrayList<String> otherColors = new ArrayList<String>();
        otherColors.add("Red");
        otherColors.add("Blue");
        boolean areEqual = color.equals(otherColors);
        System.out.println(areEqual);
        //12
        System.out.println("12");
        System.out.println("Список colorsCopy до очищення:");
        System.out.println(colorsCopy);
        System.out.println("Чи порожній список colorsCopy:");
        System.out.println(colorsCopy.isEmpty());
        colorsCopy.clear();
        System.out.println("colorsCopy після очищення:" + colorsCopy);
        System.out.println(colorsCopy);
        //13
        System.out.println("13");
        System.out.println(colorsCopy.isEmpty());
        //14
        System.out.println("14");
        ArrayList<String> listWithCapacity = new ArrayList<String>();
        listWithCapacity.ensureCapacity(10);
        System.out.println(listWithCapacity.size());
        //15
        System.out.println("15");
        ArrayList<String> trimList = new ArrayList<String>(10); // Створюємо з початковою місткістю 10
        trimList.add("Green");
        trimList.add("Black");
        trimList.add("Orange");
        ((ArrayList<String>) trimList).trimToSize();
        System.out.println(trimList.size());
    }
}