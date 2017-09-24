package ubs.supermarket.layer.model.converter;

import ubs.supermarket.layer.model.domain.impl.Item;
import ubs.supermarket.layer.model.domain.impl.StockPrice;
import ubs.supermarket.layer.model.domain.impl.SpecialPrice;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface Converter {

  Item[] convertItems();

  SpecialPrice[] convertSpecialPrices();

  StockPrice[] convertNormalPrices();

}
