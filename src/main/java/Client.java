import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Product> productList;

    public Client(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProductToList(Shop shop, Product product) {
        for (Product product1 : shop.getProductList()) { //magics - использование foreach вместо кол-во продуктов
            if (product1.getName() == product.getName() & product1.getCount() >= product.getCount()) {
                getProductList().add(product);
                product1.setCount(product1.getCount() - product.getCount());
                product.raisingRating();
            }
        }
    }

    public String printProducts() { //DRY - отдельный метод для вывода продуктов
        StringBuilder stringBuilder = new StringBuilder("Ваш заказ: ");
        for (Product product : productList) {
            stringBuilder.append(product.getName() + " - " + product.getCount() + " ");
        }
        String result = stringBuilder.toString();
        return result;
    }

    public void returnOrder(Shop shop) {
        for (Product product : getProductList()) { //magics - использование foreach вместо кол-во продуктов
            for (Product product1 : shop.getProductList()) { //magics - использование foreach вместо кол-во продуктов
                if (product1.getName() == product.getName()) {
                    product1.setCount(product1.getCount() + product.getCount());
                    product.raisingRating();
                }
            }
        }
        getProductList().clear();
        System.out.println(printProducts());
    }

    public void repeatOrder(Shop shop) { //DRY - отдельный метод для повтора заказа
        for (Product product : getProductList()) {
            for (Product product1 : shop.getProductList()) {
                if (product1.getName() == product.getName() & product1.getCount() >= product.getCount()) {
                    product1.setCount(product1.getCount() - product.getCount());
                    product.setCount(2 * product.getCount());
                    product.raisingRating();
                }
            }
        }
        System.out.println(printProducts());
    }
}
