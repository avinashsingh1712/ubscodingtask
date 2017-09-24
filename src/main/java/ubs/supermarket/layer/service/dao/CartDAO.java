package ubs.supermarket.layer.service.dao;

import java.util.List;
import ubs.supermarket.layer.model.domain.Price;
import ubs.supermarket.layer.model.domain.impl.Cart;
import ubs.supermarket.layer.model.domain.impl.Order;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface CartDAO {

  List<Order> getOrdersFromCart();

  boolean add(Order order);

  boolean removeOrder(Order order);

  Price getPrice();

  Cart getCart();

  boolean update(Order order);
}
