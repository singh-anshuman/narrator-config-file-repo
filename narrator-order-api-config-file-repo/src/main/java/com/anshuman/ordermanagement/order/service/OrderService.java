package com.anshuman.ordermanagement.order.service;

import com.anshuman.ordermanagement.order.model.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

        String currency = country=="IN" ? "INR" : "$";

        Order o1 = new Order();
        o1.setUserId(userId);
        o1.setDate(new Date());
        o1.setValue(currency+" "+ "100");
        o1.setOrderId(1);

        Order o2 = new Order();
        o2.setUserId(userId);
        o2.setDate(new Date());
        o2.setValue(currency+" "+ "200");
        o2.setOrderId(1);

        List<Order> orders = new ArrayList<>();
        orders.add(o1);
        orders.add(o2);

        return orders;
    }

}
