package org.itstep.order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<OrderRest> getOrders() {
        var orders = (List<OrderRest>) orderService.findAll();
        return orders;
    }
}