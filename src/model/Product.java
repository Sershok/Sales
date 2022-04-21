package model;

import base.IFiscal;
import base.Income;

public class Product implements Income, IFiscal {

    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public double bonus(double payment) {
        return 0;
    }

    @Override
    public double calculate(int price, double weight) {
        return 0;
    }

    @Override
    public double calculate(double payment, double bonus) {
        return 0;
    }
}
