package ubs.supermarket.layer.facade.mapper.impl;

import ubs.supermarket.layer.facade.dto.CartDTO;
import ubs.supermarket.layer.facade.dto.ItemDTO;
import ubs.supermarket.layer.facade.dto.OrderDTO;
import ubs.supermarket.layer.facade.dto.PriceDTO;
import ubs.supermarket.layer.facade.mapper.Mapper;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public class Maps<T> {

  public static <T> Mapper getMapper(T object) {
    if (((Class) object).getSimpleName().equals(ItemDTO.class.getSimpleName())) {
      return new ItemMapper();
    }

    if (((Class) object).getSimpleName().equals(PriceDTO.class.getSimpleName())) {
      return new StockPriceMapper();
    }

    if (((Class) object).getSimpleName().equals(OrderDTO.class.getSimpleName())) {
      return new OrderMapper();
    }

    if (((Class) object).getSimpleName().equals(CartDTO.class.getSimpleName())) {
      return new CartMapper();
    }

    return null;
  }

}

