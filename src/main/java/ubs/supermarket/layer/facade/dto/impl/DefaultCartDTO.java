package ubs.supermarket.layer.facade.dto.impl;

import java.util.List;

import ubs.supermarket.layer.model.domain.impl.Order;
import ubs.supermarket.layer.facade.dto.CartDTO;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public class DefaultCartDTO implements CartDTO {

  private List<Order> orders;
  private String currency;

  @Override
  public List<Order> getOrders() {
    return orders;
  }

  @Override
  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }

  @Override
  public String getCurrency() {
    return currency;
  }

  @Override
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public double getPrice() {
    double price = 0.0d;

    for (Order order : orders) {
      price += order.getTotalPrice().getUnit();
    }

    return price;
  }

  @Override
  public String toString() {
    return "DefaultCartDTO{" +
        "orders=" + orders +
        ", currency='" + currency + '\'' +
        '}';
  }
}
