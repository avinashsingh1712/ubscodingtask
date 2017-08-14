package pl.koszela.jan.service;

import java.util.Map;
import pl.koszela.jan.domain.Price;
import pl.koszela.jan.domain.impl.Product;

/**
 * Created on 12.08.2017.
 *
 * @author Jan Koszela
 */
public interface ProductService {

  Map<Product, Price> getProducts();

  Product getProductById(int id);

  Product getProductByName(String productName);

  Price getPrice(Product product);

}