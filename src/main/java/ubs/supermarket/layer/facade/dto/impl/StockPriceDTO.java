package ubs.supermarket.layer.facade.dto.impl;

import java.io.Serializable;

import ubs.supermarket.layer.facade.dto.PriceDTO;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public class StockPriceDTO implements PriceDTO, Serializable {

  private int id;
  private double price;
  private String currency;

  @Override
  public int getId() {
    return this.id;
  }

  @Override
  public void setId(int id) {
    this.id = id;
  }

  @Override
  public double getUnit() {
    return this.price;
  }

  @Override
  public void setUnit(double price) {
    this.price = price;
  }

  @Override
  public String getCurrency() {
    return this.currency;
  }

  @Override
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public String toString() {
    return "StockPriceDTO{" +
        "id=" + id +
        ", price=" + price +
        ", currency='" + currency + '\'' +
        '}';
  }
}
