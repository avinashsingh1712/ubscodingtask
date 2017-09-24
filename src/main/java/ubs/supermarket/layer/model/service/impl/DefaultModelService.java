package ubs.supermarket.layer.model.service.impl;

import org.springframework.stereotype.Service;
import ubs.supermarket.layer.model.domain.Price;
import ubs.supermarket.layer.model.domain.impl.StockPrice;
import ubs.supermarket.layer.model.service.ModelService;
import ubs.supermarket.layer.model.converter.Converter;
import ubs.supermarket.layer.model.domain.impl.Item;
import ubs.supermarket.layer.model.domain.impl.SpecialPrice;
import ubs.supermarket.layer.model.converter.impl.JsonConverter;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
@Service("modelService")
public class DefaultModelService implements ModelService {

  private Converter converter;

  public DefaultModelService() {
    this.converter = new JsonConverter();
  }

  @Override
  public Item getItem(String itemName) {
    Item[] items = getItems();
    for (int i = 0; i < items.length; i++) {
      if (items[i].getName().equals(itemName)) {
        return items[i];
      }
    }

    return null;
  }

  @Override
  public Item[] getItems() {
    return this.converter.convertItems();
  }

  @Override
  public Price getStockPrice(int id) {
    Price[] prices = getStockPrices();
    for (int i = 0; i < prices.length; i++) {
      if (prices[i].getId() == id) {
        return prices[i];
      }
    }

    return null;
  }

  @Override
  public StockPrice[] getStockPrices() {
    return this.converter.convertNormalPrices();
  }

  @Override
  public SpecialPrice getSpecialPrice(int id, int quantity) {
    SpecialPrice[] prices = getSpecialPrices();
    for (int i = 0; i < prices.length; i++) {
      if ( isSpecialPrice(prices[i], id, quantity)) {
        return prices[i];
      }
    }

    return null;
  }

  private boolean isSpecialPrice(SpecialPrice price, int id, int quantity) {
    return (price.getId() == id) && (price.getAmount() == quantity);
  }

  @Override
  public SpecialPrice[] getSpecialPrices() {
    return this.converter.convertSpecialPrices();
  }
}
