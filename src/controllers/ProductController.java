package controllers;

import model.Product;
import view.SalesView;

import utils.Rounder;

public class ProductController {

    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp(){

        view.getInputs();

        String nameProduct = model.getNameProduct();
        String phone = model.getPhone();

        double income = model.calculate(model.getPrice(), model.getWeight());
        String incomeRounder = Rounder.roundValue(income);

        double bonus = model.bonus(income);
        String bonusRounder = Rounder.roundValue(bonus);

        double totalIncome = model.calculate(income,bonus);
        String totalIncomeRounder = Rounder.roundValue(totalIncome);

        String output = "Product name: " + nameProduct +
        "\nPhone: " + phone + "\nSum: " + incomeRounder
                + "\nBonus: " + bonusRounder + "\nTo pay:"
                + totalIncomeRounder + "\nPhone bonus:" + bonusRounder;

    }

}
