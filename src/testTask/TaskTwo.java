package testTask;

import java.util.Scanner;

public class TaskTwo {public void inputName() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите имя: ");
    String name = scanner.nextLine();
    if (name.equals("Вячеслав")) {
        System.out.println("Привет, Вячеслав");
    } else {
        System.out.println("Нет такого имени");
    }
}
}
