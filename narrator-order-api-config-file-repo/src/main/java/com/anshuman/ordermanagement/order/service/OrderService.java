package com.anshuman.ordermanagement.order.service;

import com.anshuman.ordermanagement.order.model.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Value("${country}")
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Order> getAllOrdersForUser(Integer userId) {
        List<Order> orders = new ArrayList<>();
        String currency = "IN".equals(country) ? "INR" : "$";

        Order o1 = new Order();
        o1.setUserId(1);
        o1.setDate(new Date());
        o1.setValue(currency+"100");
        o1.setOrderId(1);

        Order o2 = new Order();
        o2.setUserId(2);
        o2.setDate(new Date());
        o2.setValue(currency+"200");
        o2.setOrderId(2);

        Order o3 = new Order();
        o3.setUserId(2);
        o3.setDate(new Date());
        o3.setValue(currency+"150");
        o3.setOrderId(3);

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);

        return orders.stream().filter(o->o.getUserId().equals(userId)).collect(Collectors.toList());
    }

}
