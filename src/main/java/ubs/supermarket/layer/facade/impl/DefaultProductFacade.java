package ubs.supermarket.layer.facade.impl;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;

import ubs.supermarket.layer.facade.ProductFacade;
import ubs.supermarket.layer.facade.dto.ItemDTO;
import ubs.supermarket.layer.facade.dto.PriceDTO;
import ubs.supermarket.layer.facade.mapper.Mapper;
import ubs.supermarket.layer.facade.mapper.impl.Maps;
import ubs.supermarket.layer.model.domain.Price;
import ubs.supermarket.layer.model.domain.impl.Item;
import ubs.supermarket.layer.service.ProductService;
import ubs.supermarket.main.annotation.Facade;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
@Facade("productFacade")
public class DefaultProductFacade implements ProductFacade {

  private Map<ItemDTO, PriceDTO> products;

  @Autowired
  private ProductService productService;

  @Override
  public Map<ItemDTO, PriceDTO> getProducts() {

    if ((products == null) ||
        (products.hashCode() != productService.getProducts().hashCode())) {
      products = new TreeMap<>();

      Mapper items = Maps.getMapper(ItemDTO.class);
      Mapper prices = Maps.getMapper(PriceDTO.class);

      for (java.util.Map.Entry<Item, Price> entry : productService.getProducts().entrySet()) {
        products.put((ItemDTO) items.map(entry.getKey()),
            (PriceDTO) prices.map(entry.getValue()));
      }
    }

    return products;
  }
}
