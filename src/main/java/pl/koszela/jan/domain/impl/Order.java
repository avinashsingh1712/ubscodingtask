package pl.koszela.jan.domain.impl;

import java.util.Objects;
import pl.koszela.jan.domain.Price;

/**
 * Created on 12.08.2017.
 *
 * @author Jan Koszela
 */
public class Order {

  private Product product;
  private Price stockPrice;
  private int quantity;
  private Price totalPrice;
  private boolean specialOffer;


  public Order(Product product, int quantity) {
    this.product = product;
    this.quantity = quantity;
    this.stockPrice = null;
    this.totalPrice = null;
    this.specialOffer = false;
  }

  public Product getProduct() {
    return this.product;
  }

  public Price getStockPrice() {
    return stockPrice;
  }

  public Price getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Price totalPrice) {
    this.totalPrice = totalPrice;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setProduct(Product productName) {
    this.product = productName;
  }

  public void setStockPrice(Price stockPrice) {
    this.stockPrice = stockPrice;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public boolean isSpecialOffer() {
    return specialOffer;
  }

  public void setSpecialOffer(boolean specialOffer) {
    this.specialOffer = specialOffer;
  }

  @Override
  public String toString() {
    return "Order{" +
        "product=" + product +
        ", stockPrice=" + stockPrice +
        ", quantity=" + quantity +
        ", totalPrice=" + totalPrice +
        ", specialOffer=" + specialOffer +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(product, order.product);
  }

  @Override
  public int hashCode() {
    int prime = 13;

    int result = prime + product.getId() + product.getName().hashCode();
    return result;
  }
}