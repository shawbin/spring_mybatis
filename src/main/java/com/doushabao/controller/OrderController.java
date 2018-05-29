package com.doushabao.controller;

import com.doushabao.ResultEnum;
import com.doushabao.entity.OrderEntity;
import com.doushabao.framework.exceptiondeal.GlobalException;
import com.doushabao.service.OrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    Logger logger = Logger.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    /**
     * orders count
     * @return
     */
    @RequestMapping(path = "/order/orderCount", method = {RequestMethod.POST, RequestMethod.GET})
    public Integer getOrderCount(){
        logger.info("count");
        return orderService.getOrderCount();
    }

    /**insert into orders*/
    @RequestMapping(path = "/order/insertOrders", method = {RequestMethod.POST, RequestMethod.GET})
    public void insertOrders(@RequestBody OrderEntity order) {
        orderService.insertOrders(order);
    }

    /** find only one order entity */
    @RequestMapping(path = "/order/getOrderEntity", method = {RequestMethod.POST, RequestMethod.GET})
    public OrderEntity getOrderEntity(String ticketNo) throws Exception {
        OrderEntity orderEntity = orderService.getOrderEntity(ticketNo);
        if (orderEntity == null) {
            throw new GlobalException(ResultEnum.ERROR_NULL.getCode(), ResultEnum.ERROR_NULL.getMessage());
        }
        return orderService.getOrderEntity(ticketNo);
    }
}
