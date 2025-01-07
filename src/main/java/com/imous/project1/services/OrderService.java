package com.imous.project1.services;

import com.imous.project1.entities.OrderEntity;

import java.util.List;

public interface OrderService {
    List<OrderEntity> findAllOrder();
    OrderEntity createOrder(OrderEntity commande);
    OrderEntity findOrderById(Long id);
    void deleteOrder(Long id);
    OrderEntity updateOrder(Long id, OrderEntity orderEntity);
}
