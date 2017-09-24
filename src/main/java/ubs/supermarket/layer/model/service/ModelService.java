package ubs.supermarket.layer.model.service;

import ubs.supermarket.layer.model.domain.Price;
import ubs.supermarket.layer.model.domain.impl.Item;
import ubs.supermarket.layer.model.domain.impl.SpecialPrice;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface ModelService {

  Item getItem(String itemName);

  Item[] getItems();

  Price getStockPrice(int id);

  Price[] getStockPrices();

  SpecialPrice getSpecialPrice(int id, int quantity);

  SpecialPrice[] getSpecialPrices();
}
