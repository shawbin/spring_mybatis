package com.doushabao.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper {

    @Select("select count(*) from orders")
    Integer getOrderCount();
}
