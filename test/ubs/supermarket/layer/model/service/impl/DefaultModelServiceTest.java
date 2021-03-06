package ubs.supermarket.layer.model.service.impl;

import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import ubs.supermarket.layer.facade.dto.ItemDTO;
import ubs.supermarket.layer.facade.dto.PriceDTO;
import ubs.supermarket.layer.facade.impl.DefaultProductFacade;
import ubs.supermarket.layer.model.converter.Converter;
import ubs.supermarket.layer.model.domain.Price;
import ubs.supermarket.layer.model.domain.impl.Item;
import ubs.supermarket.layer.model.domain.impl.SpecialPrice;
import ubs.supermarket.layer.model.domain.impl.StockPrice;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
@RunWith(MockitoJUnitRunner.class)
public class DefaultModelServiceTest {

  public static final int PRODUCT_ID = 1;
  public static final String PRODUCT_NAME = "Prius";
  public static final int QUANTITY_PRODUCT = 2;

  public static final double STOCK_PRICE = 12.0;
  public static final String CURRENCY = "EUR";
  public static final double TOTAL_PRICE = 24.0;
  public static final int SPECIALPRICE_AMOUNT = 2;

  @InjectMocks
  private DefaultProductFacade sut;

  private Map<ItemDTO, PriceDTO> products;

  @Mock
  private Converter converter;

  Item item;
  Price stockPrice;
  SpecialPrice specialPrice;

  @Before
  public void setUp() throws Exception {
    item = new Item(PRODUCT_ID, PRODUCT_NAME);
    stockPrice = new StockPrice(PRODUCT_ID, STOCK_PRICE, CURRENCY);
    specialPrice = new SpecialPrice(PRODUCT_ID, SPECIALPRICE_AMOUNT, STOCK_PRICE, CURRENCY);

  }

  @Test
  public void shouldGetItemFromConverterIfFileExists() {
    //given

    //when

    //then

  }

  @Test
  public void shouldNotGetItemFromConverterIfFileNotExists() {
    //given

    //when

    //then

  }


  @Test
  public void shouldGetPriceFromConverterIfFileExists() {
    //given

    //when

    //then

  }

  @Test
  public void shouldNotGetPriceFromConverterIfFileNotExists() {
    //given

    //when

    //then

  }

}