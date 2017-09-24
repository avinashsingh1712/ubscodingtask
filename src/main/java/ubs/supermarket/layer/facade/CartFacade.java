package ubs.supermarket.layer.facade;

import ubs.supermarket.layer.facade.dto.CartDTO;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface CartFacade {

  CartDTO getCart();

  boolean removeOrderFromCart(String product);

  boolean addOrderToCart(String product, String quantity);

  boolean updateOrderInCart(String product, String quantity);
}
