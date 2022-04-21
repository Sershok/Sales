package utils;

import java.util.Scanner;

// Валидатор ввода значений
public class Validator {

    // Валидация ввода наименования
    public static String validateName(Scanner scanner){
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Пусто! Введите наименование товара: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    public static String validatePhone(Scanner scanner){
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Пусто! Введите номер клиента: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    // Валидация ввода количества
    public static double validateQuantityInput(Scanner scanner){
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите количество!: ");
        }
        double quantity = scanner.nextDouble();
        while (quantity <= 0){
            System.out.println("Неверное значение! Введите количество: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество!: ");
            }
            quantity = scanner.nextDouble();
        }
        return quantity;
    }

    // Валидация ввода цены
    public static int validatePriceInput(Scanner scanner){
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите цену!: ");
        }
        int price = scanner.nextInt();
        while (price <= 0) {
            System.out.println("Неверное значение! Введите цену: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество!: ");
            }
            price = scanner.nextInt();
        }
        return price;
    }
}

