package com.doushabao.mappers;

import com.doushabao.entity.OrderEntity;
import com.doushabao.sqlproviders.OrderSqlProviders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface OrderMapper {

    /**orders count*/
    @Select("select count(*) from orders")
    Integer getOrderCount();

    /**insert into orders*/
    @SelectProvider(type = OrderSqlProviders.class, method = "insertOrders")
    OrderEntity insertOrders(OrderEntity order);
}
