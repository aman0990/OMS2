package com.OrderMgmtSys.Controller;

import com.OrderMgmtSys.Object.OrderObject;
import com.OrderMgmtSys.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/OrderController")
public class OrderController {

    @Autowired
    OrderService orderService;
    @PostMapping("/createOrder")
    public String createOrder(@RequestBody OrderObject orderObject){
        orderObject = orderService.createOrder(orderObject);
        return "Order Created With Id : "+orderObject.getProduct();
    }

   // @GetMapping("/")

}
