package models;


import base.Fiscal;
import base.Income;
import utils.Rounder;



public class Product extends Rounder implements Income, Fiscal {


    private String name;
    private int quantity;
    private float price;
    private static double taxRate = 0.05;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }


    public double payment(int quantity, double price){
      return  quantity * price;
    }

    public double tax(double income){
        return income * taxRate;
    }

    public double clearIncome(double income, double tax) {

        return income - tax;
    }
}
