import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product potato = new Product("Картошка", 200);
        Product water = new Product("Вода", 300);
        Product pizza = new Product("Пицца", 10);
        Product meat = new Product("Мясо", 5);
        Product TV = new Product("Телевизор", 23);
        Product laptop = new Product("Ноутбук", 14);
        Product telephone = new Product("Телефон", 30);

        Client ivan = new Client("Иван", new ArrayList<>());
        Client peter = new Client("Петя", new ArrayList<>());

        Shop eldorado = new Eldorado(new ArrayList<>()); // D - логика зависит только от абстракции процесса
        Shop magnet = new Magnet(new ArrayList<>()); // D - логика зависит только от абстракции процесса

        eldorado.addProduct(TV);
        eldorado.addProduct(laptop);
        eldorado.addProduct(telephone);
        magnet.addProduct(potato);
        magnet.addProduct(water);
        magnet.addProduct(pizza);
        magnet.addProduct(meat);

        ivan.addProductToList(eldorado, new Product("Телефон", 10));
        ivan.addProductToList(eldorado, new Product("Ноутбук", 2));

        peter.addProductToList(magnet, new Product("Картошка", 50));
        peter.addProductToList(magnet, new Product("Вода", 100));

        System.out.println(ivan.printProducts());
        System.out.println(peter.printProducts());

        peter.repeatOrder(magnet);
        ivan.returnOrder(eldorado);

        magnet.printListProducts();
    }
}

