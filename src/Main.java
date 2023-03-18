import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> sales = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию: \n 1. Добавить \n 2. Показать \n 3. Удалить \n");
            String numberOperation = scanner.nextLine();
            switch (numberOperation) {
                case "1": {
                    System.out.println("Какую покупку хотите добавить?");
                    sales.add(scanner.nextLine());
                    break;
                }
                case "2": {
                    basket(sales);
                    break;
                }
                case "3": {
                    basket(sales);
                    System.out.println("Какую операцию хотите удалить? Введите номер или название.");
                    String delete = scanner.nextLine();
                    try {
                        int index = Integer.parseInt(delete) - 1;
                        sales.remove(index);
                    } catch (Exception e) {
                        sales.remove(delete);
                    }
                    break;
                }
                default: {
                    System.out.println("Не корректный ввод.");
                    break;
                }
            }
        }
    }

    private static void basket(List<String> sales) {
        System.out.println("Список покупок:");
        for (int i = 0; i < sales.size(); i++) {
            int count = i + 1;
            System.out.println(count + " " + sales.get(i));
        }
    }
}