package pl.koszela.jan.layer.service;

import java.util.Map;
import pl.koszela.jan.layer.model.domain.Price;
import pl.koszela.jan.layer.model.domain.impl.Item;

/**
 * Created on 12.08.2017.
 *
 * @author Jan Koszela
 */
public interface ProductService {

  Map<Item, Price> getProducts();

  Item getProduct(int id);

  Item getProduct(String productName);

  Price getPrice(Item item);

  Price getPrice(int id);

  Price getPrice(String productName);

}
