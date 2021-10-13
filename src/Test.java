import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите действие:");
            System.out.println("1.Добавить задачу");
            System.out.println("2.Ввыести список задач");
            System.out.println("3.Удалить задачу");
            System.out.println("0.Выход");
            String number = scanner.nextLine();

            if (number.equals("1")) {
                System.out.println("Введите задачу планировани:");
                String text = scanner.nextLine();
                strings.add(text);
            } else if (number.equals("2")) {
                System.out.println("Список задач который вам нужно сделать ");
                for (int i = 0; i < strings.size(); i++) {
                    System.out.println(i + strings.toString());
                }
            } else if (number.equals("3")) {
                System.out.println("Какую задачу хотите удалить");
                int num = scanner.nextInt();
                strings.remove(num);
            } else if (number.equals("0")) {
                break;
            }
        }
    }
}
