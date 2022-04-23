import controllers.ProductController;
import models.Product;
import views.SalesView;


public class App {

    public static void main(String[] args) {

        Product model = new Product();
        SalesView view = new SalesView(model);
         ProductController controller = new ProductController(model, view);


        controller.runApp();
    }
}
