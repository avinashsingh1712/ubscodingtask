package ubs.supermarket.layer.facade;

import java.util.Map;

import ubs.supermarket.layer.facade.dto.ItemDTO;
import ubs.supermarket.layer.facade.dto.PriceDTO;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface ProductFacade {

  Map<ItemDTO, PriceDTO> getProducts();
}
