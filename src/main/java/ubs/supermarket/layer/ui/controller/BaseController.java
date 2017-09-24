package ubs.supermarket.layer.ui.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import ubs.supermarket.layer.ui.constans.AttributeConstans;
import ubs.supermarket.layer.facade.CartFacade;
import ubs.supermarket.layer.facade.ProductFacade;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
@Controller
@EnableWebMvc
public class BaseController {

	private static final String VIEW_INDEX = "index";
	private final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

	private static Map<String, Object> modelAttributes;

	@Autowired
	private ProductFacade productFacade;

	@Autowired
	private CartFacade cartFacade;

	@RequestMapping("/")
	public String welcomePage(ModelMap model) {
		LOGGER.debug("Page: /");

		return productsPage(model);
	}

	@RequestMapping("/" + AttributeConstans.PRODUCTS_PATH)
	public String productsPage(ModelMap model) {

		resolveAction(null, null, null);

		model.addAllAttributes(modelAttributes);
		model.addAttribute("currentPath", AttributeConstans.PRODUCTS_PATH);

		LOGGER.debug("Page: /" + AttributeConstans.PRODUCTS_PATH);
		return VIEW_INDEX;
	}

	@RequestMapping(value = "/" + AttributeConstans.PRODUCTS_PATH + "/{name}", method = RequestMethod.GET)
	public String productsPageAddAction(@PathVariable String name, ModelMap model,
			@RequestParam(value = "product", required = false) String product,
			@RequestParam(value = "quantity", required = false) String quantity) {

		resolveAction(name, product, quantity);

		model.addAllAttributes(modelAttributes);
		model.addAttribute("currentPath", AttributeConstans.PRODUCTS_PATH);

		LOGGER.debug("Page: /" + AttributeConstans.PRODUCTS_PATH + "/" + name);
		LOGGER.debug("Product = " + product + "   Quantity = " + quantity);
		return VIEW_INDEX;
	}

	@RequestMapping("/" + AttributeConstans.CART_PATH)
	public String cartPage(ModelMap model) {
		LOGGER.debug("Page: /" + AttributeConstans.CART_PATH);
		return cartPageAction(null, model, null, null);
	}

	@RequestMapping(value = "/" + AttributeConstans.CART_PATH + "/{name}", method = RequestMethod.GET)
	public String cartPageAction(@PathVariable String name, ModelMap model,
			@RequestParam(value = "product", required = false) String product,
			@RequestParam(value = "quantity", required = false) String quantity) {

		resolveAction(name, product, quantity);

		model.addAllAttributes(modelAttributes);
		model.addAttribute("currentPath", AttributeConstans.CART_PATH);

		LOGGER.debug("Page: /" + AttributeConstans.CART_PATH + "/" + name);
		LOGGER.debug("Product = " + product + "   Quantity = " + quantity);
		return VIEW_INDEX;
	}

	private void resolveAction(@PathVariable String name,
			@RequestParam(value = "product", required = false) String product,
			@RequestParam(value = "quantity", required = false) String quantity) {

		setModelAttributes();

		if (product != null) {
			if (isRemoveAction(name)) {
				boolean isRemoved = cartFacade.removeOrderFromCart(product);
				// setAlert(isRemoved, PathConstans.REMOVE_ACTION.getValue());

				LOGGER.info("Order name: '" + product + "' was removed: " + isRemoved);
			} else if (isAddAction(name)) {

				boolean isOrderAdded = cartFacade.addOrderToCart(product, quantity);
				if (isOrderAdded) {
					LOGGER.info("Order name: '" + product + "' was added: " + isOrderAdded);
				} else {
					boolean isOrderUpdated = cartFacade.updateOrderInCart(product, quantity);
					LOGGER.info("Order name: '" + product + "' was updated: " + isOrderUpdated);
				}
			}
			modelAttributes.put(AttributeConstans.ALERT, null);
		}
	}

	private boolean isAddAction(@PathVariable String name) {
		return AttributeConstans.ADD_ACTION.getValue().equals(name);
	}

	private boolean isRemoveAction(@PathVariable String name) {
		return AttributeConstans.REMOVE_ACTION.getValue().equals(name);
	}

	private void setModelAttributes() {
		modelAttributes = new HashMap<>();

		modelAttributes.put(AttributeConstans.CART.getKey(), cartFacade.getCart());
		modelAttributes.put(AttributeConstans.PRODUCTS.getKey(), productFacade.getProducts());

		// Path Constants
		modelAttributes.put(AttributeConstans.SERVLET_NAME.getKey(), AttributeConstans.SERVLET_NAME.getValue());
		modelAttributes.put(AttributeConstans.PRODUCTS_PATH, AttributeConstans.PRODUCTS_PATH);
		modelAttributes.put(AttributeConstans.CART_PATH, AttributeConstans.CART_PATH);

		// Path action constants
		modelAttributes.put(AttributeConstans.ADD_ACTION.getKey(), AttributeConstans.ADD_ACTION.getValue());
		modelAttributes.put(AttributeConstans.REMOVE_ACTION.getKey(), AttributeConstans.REMOVE_ACTION.getValue());
	}

}