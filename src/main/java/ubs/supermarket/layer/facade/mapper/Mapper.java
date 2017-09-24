package ubs.supermarket.layer.facade.mapper;


import java.util.List;

/**
 * Created on 24.09.2017.
 *
 * @author Avinash Singh
 */
public interface Mapper<FROM, TO> {

  TO map(FROM fromObject);

  List<TO> map(List<FROM> fromList);
}
