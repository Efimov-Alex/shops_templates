import java.util.ArrayList;
import java.util.List;

public class Eldorado implements Shop { // О - добавление нового магазиан не требует изменений в классе
    private List<Product> productList;

    public Eldorado(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void printListProducts() { // S - список товаров в классе магазина
        System.out.println("Спасибо за то что посетили Eldorado");
        StringBuilder stringBuilder = new StringBuilder("Список товаров: ");
        for (Product product : productList) {
            stringBuilder.append(product.getName() + " - " + product.getCount() + " ");
        }
        String result = stringBuilder.toString();
        System.out.println(result);
    }


}
