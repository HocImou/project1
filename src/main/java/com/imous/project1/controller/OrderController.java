package com.imous.project1.controller;


import com.imous.project1.entities.OrderEntity;
import com.imous.project1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderEntity>> getAllCommandes(){
         List<OrderEntity> orderEntities = orderService.findAllOrder();
         return ResponseEntity.ok(orderEntities);
    }

    @PostMapping
    public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderEntity orderEntity){
        OrderEntity orderEntity1 = orderService.createOrder(orderEntity);
        return ResponseEntity.ok(orderEntity1);
    }


}
