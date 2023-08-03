import java.util.List;

public interface Shop { //I - нет больших, раздутых итнерфейсов
    void addProduct(Product product);

    void printListProducts();

    List<Product> getProductList();
}