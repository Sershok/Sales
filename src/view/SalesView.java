package view;

import model.Product;

public class SalesView {
    Product model;
    String title;
    String name;
    int price;
    double weight;

    public SalesView(Product model) {
        this.model = model;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
