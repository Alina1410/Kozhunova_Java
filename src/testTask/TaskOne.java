package testTask;

import java.util.Scanner;

public class TaskOne { public void inputNumber() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите число: ");
    int number = scanner.nextInt();

    if (number > 7) {
        System.out.println("Привет");
    }

    scanner.close();
}
}
