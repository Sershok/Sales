package model;

import base.IFiscal;
import base.Income;

public class Product implements Income, IFiscal {

    private String phone;
    private String nameProduct;
    private int price;
    private double weight;
    private final double BONUS = 0.15;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public String getPhone() {
        return phone;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBONUS() {
        return BONUS;
    }

    @Override
    public double bonus(double payment) {
        return payment*BONUS;

    }

    @Override
    public double calculate(int price, double weight) {
        return price*weight;
    }

    @Override
    public double calculate(double payment, double bonus) {
        return payment-bonus;
    }
}
