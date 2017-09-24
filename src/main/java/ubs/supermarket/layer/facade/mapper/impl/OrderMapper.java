package ubs.supermarket.layer.facade.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import ubs.supermarket.layer.model.domain.impl.Order;
import ubs.supermarket.layer.facade.dto.OrderDTO;
import ubs.supermarket.layer.facade.dto.impl.DefaultOrderDTO;
import ubs.supermarket.layer.facade.mapper.Mapper;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public class OrderMapper implements Mapper<Order, OrderDTO> {

  @Override
  public OrderDTO map(Order from) {
    OrderDTO dto = new DefaultOrderDTO();
    dto.setItem(from.getItem());
    dto.setQuantity(from.getQuantity());
    dto.setSpecialOffer(from.isSpecialOffer());
    dto.setStockPrice(from.getStockPrice());
    dto.setTotalPrice(from.getTotalPrice());

    return dto;
  }

  @Override
  public List<OrderDTO> map(List<Order> orders) {
    List<OrderDTO> dtos = new ArrayList<OrderDTO>();

    for (Order order : orders) {
      dtos.add(map(order));
    }

    return dtos;
  }
}
