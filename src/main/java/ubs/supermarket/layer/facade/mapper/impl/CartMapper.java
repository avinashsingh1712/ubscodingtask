package ubs.supermarket.layer.facade.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import ubs.supermarket.layer.model.domain.impl.Cart;
import ubs.supermarket.layer.facade.dto.CartDTO;
import ubs.supermarket.layer.facade.dto.impl.DefaultCartDTO;
import ubs.supermarket.layer.facade.mapper.Mapper;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public class CartMapper implements Mapper<Cart, CartDTO>  {

  @Override
  public CartDTO map(Cart from) {
    CartDTO dto = new DefaultCartDTO();
    dto.setOrders(from.getOrders());
    dto.setCurrency(from.getCurrency());

    return dto;
  }

  @Override
  public List<CartDTO> map(List<Cart> carts) {
    List<CartDTO> dtos = new ArrayList<CartDTO>();

    for (Cart cart : carts) {
      dtos.add(map(cart));
    }

    return dtos;
  }
}
