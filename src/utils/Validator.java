package utils;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Validator {

    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println(Constants.EMPTY_PRODUCT_NAME);
            str = scanner.nextLine().trim();
        }
        return str;
    }

    public static String validatePhone(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println(Constants.EMPTY_CLIENT_PHONE);
            str = scanner.nextLine().trim();
        }
        return str;
    }

    public static double validateQuantityInput(Scanner scanner) {

        String str = null;
        while (!scanner.hasNextDouble()) {
            str = scanner.nextLine().trim();
            System.out.printf(Constants.NAN_QUANTITY, str);

        }
        double quantity = scanner.nextDouble();
        while (quantity <= 0) {
            System.out.println("Side incoretc");
            while (!scanner.hasNextDouble()) {
                try {
                    str = scanner.next().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf(Constants.NAN_QUANTITY, str);
                }
            }
            quantity = scanner.nextDouble();
        }
        return quantity;
    }

    public static int validatePriceInput(Scanner scanner) {
        String str = null;

        while (!scanner.hasNextInt()) {
            str = scanner.nextLine().trim();
            System.out.printf(Constants.NAN_PRICE, str);
        }
        int price = scanner.nextInt();
        while (price <= 0) {
            System.out.println(Constants.INCORRECT_PRICE);
            while (!scanner.hasNextInt()) {
                try {
                    str = scanner.nextLine().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf(Constants.NAN_PRICE, str);
                }
            }
            price = scanner.nextInt();
        }
        return price;
    }
}

