package com.ecome.demoecome.Service;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ecome.demoecome.Entity.DemoOrder;
import com.ecome.demoecome.Entity.OrderStatus;
import com.ecome.demoecome.Reposistory.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public DemoOrder placeOrder(DemoOrder order) {
        
        order.setOrderStatus(OrderStatus.PENDING);
        return orderRepository.save(order);
    }

    public Page<DemoOrder> getAllOrders(int page, int size) {
     
        Pageable pageable = (Pageable) PageRequest.of(page, size);
        return orderRepository.findAll(pageable);
    }

    public DemoOrder getOrderById(Long orderId) {
        
        return orderRepository.findById(orderId).orElse(null);
    }

    public DemoOrder updateOrderStatus(Long orderId, OrderStatus newStatus) {
     
        DemoOrder order = orderRepository.findById(orderId).orElse(null);
        if (order != null) {
            order.setOrderStatus(newStatus);
            return orderRepository.save(order);
        }
        return null;
    }
}
