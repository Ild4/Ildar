import java.util.Scanner;
public class main {
    public static Scanner scanner;
    public main(String[] args) {
        scanner = new Scanner(System.in);
        int a, b;
        System.out.println("введите переменные по отдельности");
        a = scanner.nextInt();
        b = scanner.nextInt();
        char c;
        c = scanner.next().charAt(0);
        int result = -1;
        if (c == '+'){
            result = plus(a, b);
        }
        else if (c == '-') {
            result = minus(a, b);
        } else if (c == '*') {
            result = multiple(a, b);
        }
        System.out.println(result);
    }

    private static int multiple(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int plus(int a, int b) {
        return a + b;
    }

    public static void setScanner(Scanner scanner) {
        main.scanner = scanner;
    }
}