package ubs.supermarket.layer.facade.dto.impl;

import java.io.Serializable;

import ubs.supermarket.layer.facade.dto.PriceDTO;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public class SpecialPriceDTO implements PriceDTO, Serializable {

  private int id;
  private int amount;
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

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "SpecialPriceDTO{" +
        "id=" + id +
        ", amount=" + amount +
        ", price=" + price +
        ", currency='" + currency + '\'' +
        '}';
  }
}

