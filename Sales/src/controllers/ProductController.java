package controllers;


import models.Product;
import utils.Rounder;
import views.SalesView;


public class ProductController {

    Product model;
    SalesView view;


    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        model.getName();

        double income = 0;
        double tax = 0;
        double clearIncome = 0;

        income = model.payment(model.getQuantity(), model.getPrice());
        tax = model.tax(income);

        clearIncome= model.clearIncome(income, tax);
        income = Rounder.validatePriceInput(income, 1);
        tax = Rounder.validatePriceInput(tax, 1);
        clearIncome = Rounder.validatePriceInput(clearIncome, 1);

        String output = "Название товара :" +model.getName() + "\nОбщий доход (грн.):" +income +
                "\nСумма налога (грн.):" +tax +"\nЧистый доход (грн.):" +clearIncome;

        view.getOutput(output);
    }
}
