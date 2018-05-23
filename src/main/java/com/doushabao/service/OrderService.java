package com.doushabao.service;

import com.doushabao.dao.OrderDao;
import com.doushabao.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    /**orders count*/
    public Integer getOrderCount(){
        return orderDao.getOrderCount();
    }

    /**insert into orders*/
    public OrderEntity insertOrders(OrderEntity order) {
        return orderDao.insertOrders(order);
    }
}
