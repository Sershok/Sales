
/*
 *@author: Ponomarenko Sergey
 *@version 1.0.0
 */

import model.Product;
import controllers.ProductController;
import view.SalesView;


public class app {


    public static void main(String[] args) {

        Product model = new Product();
        SalesView view = new SalesView(model);
        ProductController controller = new ProductController(model, view);

        controller.runApp();

    }
}
