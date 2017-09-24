package ubs.supermarket.layer.facade.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import ubs.supermarket.layer.model.domain.impl.Item;
import ubs.supermarket.layer.facade.dto.ItemDTO;
import ubs.supermarket.layer.facade.dto.impl.DefaultItemDTO;
import ubs.supermarket.layer.facade.mapper.Mapper;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public class ItemMapper implements Mapper<Item, ItemDTO> {

  @Override
  public ItemDTO map(Item from) {
    ItemDTO dto = new DefaultItemDTO();
    dto.setId(from.getId());
    dto.setItem(from.getName());

    return dto;
  }

  @Override
  public List<ItemDTO> map(List<Item> items) {
    List<ItemDTO> dtos = new ArrayList<ItemDTO>();

    for (Item item : items) {
      dtos.add(map(item));
    }

    return dtos;
  }
}
