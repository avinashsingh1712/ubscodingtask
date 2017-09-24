package ubs.supermarket.layer.facade.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import ubs.supermarket.layer.model.domain.Price;
import ubs.supermarket.layer.facade.dto.PriceDTO;
import ubs.supermarket.layer.facade.dto.impl.StockPriceDTO;
import ubs.supermarket.layer.facade.mapper.Mapper;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public class StockPriceMapper implements Mapper<Price, PriceDTO> {

  @Override
  public PriceDTO map(Price from) {
    PriceDTO dto = new StockPriceDTO();
    dto.setId(from.getId());
    dto.setUnit(from.getUnit());
    dto.setCurrency(from.getCurrency());

    return dto;
  }

  @Override
  public List<PriceDTO> map(List<Price> prices) {
    List<PriceDTO> dtos = new ArrayList<PriceDTO>();

    for (Price item : prices) {
      dtos.add(map(item));
    }

    return dtos;
  }
}
