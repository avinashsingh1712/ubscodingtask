package ubs.supermarket.layer.facade.impl;

import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import ubs.supermarket.layer.facade.dto.ItemDTO;
import ubs.supermarket.layer.facade.dto.PriceDTO;
import ubs.supermarket.layer.facade.dto.impl.DefaultItemDTO;
import ubs.supermarket.layer.facade.dto.impl.StockPriceDTO;
import ubs.supermarket.layer.service.ProductService;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
@RunWith(MockitoJUnitRunner.class)
public class DefaultProductFacadeTest {

  public static final int PRODUCT_ID = 1;
  public static final String PRODUCT_NAME = "Prius";
  public static final int QUANTITY_PRODUCT = 2;

  public static final double STOCK_PRICE = 12.0;
  public static final String CURRENCY = "EUR";
  public static final double TOTAL_PRICE = 24.0;

  @InjectMocks
  private DefaultProductFacade sut;

  private Map<ItemDTO, PriceDTO> products;

  @Mock
  private ProductService productService;

  ItemDTO itemDTO;
  PriceDTO priceDTO;

  @Before
  public void setUp() throws Exception {
    itemDTO = new DefaultItemDTO();
    priceDTO = new StockPriceDTO();

  }

  @Test
  public void shouldProductsMapBeNotNullAndNotEmptyIfProductExists() {
    //given

    //when

    //then

  }
}