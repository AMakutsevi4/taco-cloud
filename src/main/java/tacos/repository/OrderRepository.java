package tacos.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.Taco;
import tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
