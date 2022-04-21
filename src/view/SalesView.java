package view;

import model.Product;
import utils.Validator;

import java.util.Scanner;

public class SalesView {
    Scanner sc;
    Product model;
    String title;
    String nameProduct;
    String phone;
    int price;
    double weight;

    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {

        sc = new Scanner(System.in);

        title = "Product name";
        System.out.println(title);
        nameProduct = Validator.validateName(sc);
        model.setNameProduct(nameProduct);

        title = "Phone client";
        System.out.println(title);
        phone = Validator.validatePhone(sc);
        model.setPhone(phone);

        title = "Enter price";
        System.out.println(title);
        price=Validator.validatePriceInput(sc);
        model.setPrice(price);

        title = "Enter weight";
        System.out.println(title);
        weight=Validator.validateQuantityInput(sc);
        model.setWeight(weight);

    }

}
