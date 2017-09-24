package ubs.supermarket.layer.facade.dto;

import java.util.List;
import ubs.supermarket.layer.model.domain.impl.Order;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface CartDTO {

  List<Order> getOrders();

  void setOrders(List<Order> orders);

  String getCurrency();

  void setCurrency(String currency);

  double getPrice();

}
