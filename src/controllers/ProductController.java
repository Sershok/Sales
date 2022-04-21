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


}
