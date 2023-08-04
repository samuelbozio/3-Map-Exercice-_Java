
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 2000.00);
        Product p2 = new Product("PC", 3000.00);
        Product p3 = new Product("CELL", 1000.00);

        stock.put(p1, 10000.00); //Quantidade em estoque.
        stock.put(p2, 20000.00);
        stock.put(p3, 15000.00);

        Product ps = new Product("TV", 2000.00);

        System.out.println(stock.containsKey(ps));


    }
}