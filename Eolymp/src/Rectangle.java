import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int perimeter = 2 * (n + m);
            int area = n * m;

            System.out.println(perimeter + " " + area);
        }
        scanner.close();
    }
}
