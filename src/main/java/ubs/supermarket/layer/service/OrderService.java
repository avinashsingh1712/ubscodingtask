package ubs.supermarket.layer.service;

import ubs.supermarket.layer.model.domain.impl.Order;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface OrderService {

  Order getOrderByName(String productName);

  boolean updateOrder(String product, int quantity);

  boolean removeOrder(Order removedOrder);

  boolean createOrder(String product, int quantity);
}
