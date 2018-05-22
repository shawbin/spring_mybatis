package com.doushabao.service;

import com.doushabao.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    //orders表里总数
    public Integer getOrderCount(){
        return orderDao.getOrderCount();
    }
}
