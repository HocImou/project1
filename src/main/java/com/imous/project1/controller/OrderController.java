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

    //Injection de dépendances
    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderEntity>> getAllOrders(){
         List<OrderEntity> orderEntities = orderService.findAllOrder();
         return ResponseEntity.ok(orderEntities);
    }

    @PostMapping
    public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderEntity orderEntity){
        OrderEntity orderEntity1 = orderService.createOrder(orderEntity);
        return ResponseEntity.ok(orderEntity1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderEntity> findById(@PathVariable Long id){
        OrderEntity order1 = orderService.findOrderById(id);
        return ResponseEntity.ok(order1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id){
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderEntity> updateOrder(@PathVariable Long id,@RequestBody OrderEntity orderentity ) {
        OrderEntity orderupdate = orderService.updateOrder(id, orderentity);
        return ResponseEntity.ok(orderupdate);
    }

}
