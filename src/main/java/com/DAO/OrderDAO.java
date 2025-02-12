package com.DAO;

import java.util.List;
import com.entity.Product_Order;

public interface OrderDAO {
    List<Product_Order> getOrdersByUserEmail(String email);
    boolean saveOrders(List<Product_Order> orders);
}
