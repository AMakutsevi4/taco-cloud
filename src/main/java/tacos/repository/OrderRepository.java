package tacos.repository;

import tacos.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
