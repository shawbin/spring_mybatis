package com.doushabao.sqlproviders;

import com.doushabao.entity.OrderEntity;
import org.apache.ibatis.jdbc.SQL;

/**
 * orders表的注解sql
 */
public class OrderSqlProviders {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Orders
     */
    public String insertOrders(OrderEntity order) {
        SQL sql = new SQL();
        sql.INSERT_INTO("orders");
        if (order.getTicketno() != null) {
            sql.VALUES("ticketno", "#{ticketno, jdbcType=VARCHAR}");
        }
        if (order.getDeleteStatus() != null) {
            sql.VALUES("deleteStatus", "#{deleteStatus, jdbcType=INTEGER}");
        }
        if (order.getOrdertime() != null) {
            sql.VALUES("ordertime", "#{ordertime, jdbcType=DATE}");
        }
        if (order.getUserid() != null) {
            sql.VALUES("userid", "#{userid, jdbcType=INTEGER}");
        }
        return sql.toString();
    }
}
