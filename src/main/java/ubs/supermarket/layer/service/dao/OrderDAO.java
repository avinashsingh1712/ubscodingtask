package ubs.supermarket.layer.service.dao;

import ubs.supermarket.layer.model.domain.impl.Order;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface OrderDAO {

  Order findOrderByName(String productName);

  boolean addOrder(Order order);

  int findId(Order order);

  boolean removeOrder(int id);

  boolean updateOrder(int orderId, Order order);
}
