package ubs.supermarket.layer.ui.constans;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public class AttributeConstans {

  public static final Map.Entry<String, String> CART = new SimpleEntry<>(
      "cartItem", "");
  public static final Map.Entry<String, String> PRODUCTS = new SimpleEntry<>(
      "productItems", "");

  public static final String ALERT = "alerts";
  
  public static final Map.Entry<String, String> SERVLET_NAME = new SimpleEntry<>(
	      "servletPath", "Supermarket");

	  //Paths
	  public static final String PRODUCTS_PATH = "products";
	  public static final String CART_PATH = "cart";

	  //Actions on paths
	  public static final Map.Entry<String, String> ADD_ACTION = new SimpleEntry<>(
	      "addAction", "add");
	  public static final Map.Entry<String, String> UPDATE_ACTION = new SimpleEntry<>(
	      "updateAction", "update");
	  public static final Map.Entry<String, String> REMOVE_ACTION = new SimpleEntry<>(
	      "removeAction", "remove");
}
