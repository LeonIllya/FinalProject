package utils;

import java.util.Scanner;


public class Validator {


    public static String validateName(Scanner scanner){
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Пусто! Введите наименование товара: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }


    public static int validateQuantityInput(Scanner scanner){
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите количество!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0){
            System.out.println("Неверное значение! Введите количество: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }


    public static float validatePriceInput(Scanner scanner){
        while (!scanner.hasNextFloat()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите цену!: ");
        }
        float price = scanner.nextFloat();
        while (price <= 0) {
            System.out.println("Неверное значение! Введите цену: ");
            price = scanner.nextFloat();
        }
        return price;
    }
}

