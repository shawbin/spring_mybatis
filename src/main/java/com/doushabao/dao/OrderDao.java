package com.doushabao.dao;

import com.doushabao.entity.OrderEntity;
import com.doushabao.mappers.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class OrderDao {

    @Autowired
    private OrderMapper orderMapper;

    /**orders count*/
    public Integer getOrderCount(){
        return orderMapper.getOrderCount();
    }

    /**insert into orders*/
    @Transactional
    public void insertOrders(OrderEntity order) {
        orderMapper.insertOrders(order);
    }

    /** find only one order entity */
    public OrderEntity getOrderEntity(String ticketNo){
        return orderMapper.getOrderEntity(ticketNo);
    }
}
