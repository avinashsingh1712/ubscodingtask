package ubs.supermarket.layer.facade.dto;

import ubs.supermarket.layer.model.domain.Price;
import ubs.supermarket.layer.model.domain.impl.Item;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface OrderDTO {

  Item getItem();

  Price getStockPrice();

  Price getTotalPrice();

  void setTotalPrice(Price totalPrice);

  int getQuantity();

  void setItem(Item productName);

  void setStockPrice(Price stockPrice);

  void setQuantity(int quantity);

  boolean isSpecialOffer();

  void setSpecialOffer(boolean specialOffer);

}
