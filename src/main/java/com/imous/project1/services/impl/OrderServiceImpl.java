package com.imous.project1.services.impl;

import com.imous.project1.entities.OrderEntity;
import com.imous.project1.repositories.OrderRepository;
import com.imous.project1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<OrderEntity> findAllOrder(){
        return orderRepository.findAll();
    }

    public OrderEntity createOrder(OrderEntity order){
        return orderRepository.save(order);
    }

    public OrderEntity findOrderById(Long id){
        return  orderRepository.findById(id).get();
    }

}
