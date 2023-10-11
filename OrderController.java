package com.ecome.demoecome.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.ecome.demoecome.Entity.DemoOrder;
import com.ecome.demoecome.Entity.OrderStatus;
import com.ecome.demoecome.Service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/Place")
    public DemoOrder placeNewOrder(@RequestBody DemoOrder order) {
        return orderService.placeOrder(order);
    }

    @GetMapping("All")
    public Page<DemoOrder> getAllOrders(@RequestParam(defaultValue = "0") int page,
                                   @RequestParam(defaultValue = "10") int size) {
        return orderService.getAllOrders(page, size);
    }

    @GetMapping("/{orderId}")
    public DemoOrder getOrderById(@PathVariable Long orderId) {
        return orderService.getOrderById(orderId);
    }

    @PutMapping("/{orderId}")
    public DemoOrder updateOrderStatus(@PathVariable Long orderId, @RequestParam OrderStatus newStatus) {
        return orderService.updateOrderStatus(orderId, newStatus);
    }
}
