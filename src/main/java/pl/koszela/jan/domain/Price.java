package pl.koszela.jan.domain;

/**
 * Created on 13.08.2017.
 *
 * @author Jan Koszela
 */
public interface Price {

  int getId();

  void setId(final int id);

  String getCurrency();

  void setCurrency(final String currency);

  double getPrice();

  void setPrice(final double price);
}
