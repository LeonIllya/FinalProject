package views;



import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView  {


    String title;
    String name;
    int quantity;
    float price;
    Scanner scanner;

    public SalesView(Product product) {
    getInputs();
    product.setName(name);
    product.setQuantity(quantity);
    product.setPrice(price);
    }


    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        System.out.println(title);
        name =  Validator.validateName(scanner);

        title = "Введите количество: ";
        System.out.println(title);
        quantity = Validator.validateQuantityInput(scanner);

        title = "Введите цену: ";
        System.out.println(title);
        price = Validator.validatePriceInput(scanner);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
