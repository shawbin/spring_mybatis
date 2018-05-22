package com.doushabao.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper {

    //orders表里总数
    @Select("select count(*) from orders")
    Integer getOrderCount();
}
