package com.anshuman.ordermanagement.order.controller;

import com.anshuman.ordermanagement.order.model.Order;
import com.anshuman.ordermanagement.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order-mgmt/v1")
public class OrderController {

    @Autowired
    private OrderService orderService;

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("orders")
    public ResponseEntity<List<Order>> getAllOrdersForUser(@RequestParam("userId") Integer userId) {
        return new ResponseEntity<>(orderService.getAllOrdersForUser(userId), HttpStatus.OK);
    }
}
