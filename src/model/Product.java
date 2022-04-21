package model;

import base.IFiscal;
import base.Income;

public class Product implements Income, IFiscal {








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
