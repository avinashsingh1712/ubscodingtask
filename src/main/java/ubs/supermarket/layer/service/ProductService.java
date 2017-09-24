package ubs.supermarket.layer.service;

import java.util.List;
import java.util.Map;
import ubs.supermarket.layer.model.domain.Price;
import ubs.supermarket.layer.model.domain.impl.Item;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface ProductService {

  Map<Item, Price> getProducts();

  Item getItem(int id);

  Item getItem(String productName);

  Price getPrice(Item item);

  Price getPrice(int id);

  Price getPrice(String productName);

  Price[] getStockPrices();

  Item[] getItems();

  List<Item> getItemList();

  List<Price> getListStockPrice();

}
