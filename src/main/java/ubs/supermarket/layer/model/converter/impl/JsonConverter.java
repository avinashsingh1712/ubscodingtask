package ubs.supermarket.layer.model.converter.impl;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

import ubs.supermarket.layer.model.converter.Converter;
import ubs.supermarket.layer.model.domain.impl.Item;
import ubs.supermarket.layer.model.domain.impl.SpecialPrice;
import ubs.supermarket.layer.model.domain.impl.StockPrice;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public class JsonConverter implements Converter {

  public static final Gson GSON = new Gson();
  private static final String PRODUCT_FILE = "sample/MOCK_DATA_Items.json";
  private static final String NORMAL_PRICES_FILE = "sample/MOCK_DATA_Prices.json";
  private static final String SPECIAL_PRICES_FILE = "sample/MOCK_DATA_Special_Prices.json";
  public static String resourcesSamplePath = null;

  public JsonConverter() {
    this.resourcesSamplePath = getClass().getClassLoader().getResource("/").getPath();
  }

  public JsonConverter(String resourcePath) {
    this.resourcesSamplePath = resourcePath;
  }

  public Item[] convertItems() {
    Item[] items = null;
    try (Reader reader = new FileReader(this.resourcesSamplePath + this.PRODUCT_FILE)) {

      // Convert JSON to Java Object
      items = GSON.fromJson(reader, Item[].class);

    } catch (IOException e) {
      e.printStackTrace();
    }

    return items;
  }

  public SpecialPrice[] convertSpecialPrices() {
    SpecialPrice[] specialPrices = null;
    try (Reader reader = new FileReader(this.resourcesSamplePath + this.SPECIAL_PRICES_FILE)) {

      // Convert JSON to Java Object
      specialPrices = GSON.fromJson(reader, SpecialPrice[].class);

    } catch (IOException e) {
      e.printStackTrace();
    }

    return specialPrices;
  }

  public StockPrice[] convertNormalPrices() {
    StockPrice[] stockPrices = null;
    try (Reader reader = new FileReader(this.resourcesSamplePath + this.NORMAL_PRICES_FILE)) {

      // Convert JSON to Java Object
      stockPrices = GSON.fromJson(reader, StockPrice[].class);

    } catch (IOException e) {
      e.printStackTrace();
    }

    return stockPrices;
  }

}
