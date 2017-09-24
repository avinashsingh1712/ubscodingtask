package ubs.supermarket.layer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ubs.supermarket.layer.model.domain.Price;
import ubs.supermarket.layer.model.domain.impl.Cart;
import ubs.supermarket.layer.model.domain.impl.Order;
import ubs.supermarket.layer.service.CartService;
import ubs.supermarket.layer.service.dao.CartDAO;
import ubs.supermarket.main.annotation.SessionScope;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
@Service("cartService")
@SessionScope
public class DefaultCartService implements CartService {

  @Autowired
  private CartDAO cartDAO;

  @Override
  public Cart getCart() {
    return this.cartDAO.getCart();
  }

  @Override
  public boolean addToCart(Order order) {
    return cartDAO.add(order);
  }

  @Override
  public boolean removeOrderFromCart(Order order) {
    if (order == null) {
      return false;
    }
    return cartDAO.removeOrder(order);
  }

  @Override
  public Price getPriceCart() {
    return cartDAO.getPrice();
  }

  @Override
  public boolean updateOrderInCart(Order order) {
    return cartDAO.update(order);
  }


}
