package ubs.supermarket.layer.facade.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import ubs.supermarket.layer.facade.dto.CartDTO;
import ubs.supermarket.layer.facade.dto.impl.DefaultCartDTO;
import ubs.supermarket.layer.facade.mapper.Mapper;
import ubs.supermarket.layer.facade.mapper.impl.Maps;
import ubs.supermarket.layer.model.domain.impl.Cart;
import ubs.supermarket.layer.model.domain.impl.Item;
import ubs.supermarket.layer.model.domain.impl.Order;
import ubs.supermarket.layer.model.domain.impl.StockPrice;
import ubs.supermarket.layer.service.dao.impl.DefaultCartDAO;
import ubs.supermarket.layer.service.impl.DefaultCartService;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
@RunWith(MockitoJUnitRunner.class)
public class DefaultCartFacadeTest {


  public static final String PRODUCT_NAME = "Prius";
  public static final int QUANTITY_PRODUCT = 2;
  public static final int ID = 1;
  public static final double UNIT_PRICE = 12.0;
  public static final String CURRENCY = "EUR";
  public static final double TOTAL_PRICE = 24.0;

  Order dummyOrder;

  @InjectMocks
  DefaultCartFacade sut;

  @Mock
  DefaultCartService cartService;

  @Mock
  DefaultCartDTO cartDTO;

  @Mock
  Cart cart;

  @Mock
  DefaultCartDAO cartDAO;


  Mapper cartMapper;

  @Before
  public void setUp() throws Exception {
//    cart = new Cart();

    cartMapper = Maps.getMapper(CartDTO.class);

    createDummyOrder();
//    cartDAO = new DefaultCartDAO();
//    cart = (CartDTO) cartMapper.map(cartService.getCart());
  }

  private void createDummyOrder() {
    dummyOrder = new Order();
    dummyOrder.setItem(new Item(ID, PRODUCT_NAME));
    dummyOrder.setQuantity(QUANTITY_PRODUCT);
    dummyOrder.setStockPrice(new StockPrice(ID, UNIT_PRICE, CURRENCY));
    dummyOrder.setSpecialOffer(false);
    dummyOrder.setTotalPrice(new StockPrice(ID, TOTAL_PRICE, CURRENCY));
  }

  @Test
  public void shouldGetEmptyCartIfZeroOrders() {
    //given

    when(cartService.getCart()).thenReturn(cart);

    //when
    CartDTO actualCart = sut.getCart();

    //then
    assertThat(actualCart.getOrders().size()).isEqualTo(cartService.getCart().getOrders().size());

  }

  @Test
  public void shouldGetOrderFromCartIfOneOrder() {


  }

  @Test
  public void removeOrderFromCart() {
    //given

    //when

    //then

  }

  @Test
  public void addOrderToCart() {
    //given

    //when

    //then

  }

  @Test
  public void updateOrderInCart() {
    //given

    //when

    //then

  }

}