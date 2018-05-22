package com.doushabao.dao;

import com.doushabao.mappers.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDao {

    @Autowired
    private OrderMapper orderMapper;

    //获取orders表里的总条数
    public Integer getOrderCount(){
        return orderMapper.getOrderCount();
    }
}
