package com.coffeemenuapp.coffee_aromablu_app.service;

import com.coffeemenuapp.coffee_aromablu_app.model.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class OrderService {
    private List<Order> orders;

    public OrderService() {
        orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Order placed: " + order.getItemName() + " for $" + order.getPrice());
    }

    public List<Order> getOrders() {
        return orders;
    }
}
