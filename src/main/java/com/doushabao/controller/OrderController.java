package com.doushabao.controller;

import com.doushabao.service.OrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    Logger logger = Logger.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @RequestMapping(path = "/order/orderCount", method = {RequestMethod.POST, RequestMethod.GET})
    public Integer getOrderCount(){
        logger.info("count");
        return orderService.getOrderCount();
    }
}
