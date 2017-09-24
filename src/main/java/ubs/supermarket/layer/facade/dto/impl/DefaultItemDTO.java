package ubs.supermarket.layer.facade.dto.impl;

import java.io.Serializable;

import ubs.supermarket.layer.facade.dto.ItemDTO;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public class DefaultItemDTO implements ItemDTO, Serializable {

  private int id;
  private String item;

  @Override
  public int getId() {
    return this.id;
  }

  @Override
  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String getItem() {
    return this.item;
  }

  @Override
  public void setItem(String item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return "DefaultItemDTO{" +
        "id=" + id +
        ", item='" + item + '\'' +
        '}';
  }
}
