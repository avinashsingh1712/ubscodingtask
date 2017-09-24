package ubs.supermarket.layer.service;

import ubs.supermarket.layer.model.domain.Price;
import ubs.supermarket.layer.model.domain.impl.Cart;
import ubs.supermarket.layer.model.domain.impl.Order;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface CartService {

  Cart getCart();

  boolean addToCart(Order order);

  boolean removeOrderFromCart(Order order);

  Price getPriceCart();

  boolean updateOrderInCart(Order order);
}
