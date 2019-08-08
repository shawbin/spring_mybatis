package com.doushabao.saas.mapper.order;

import com.doushabao.saas.pojo.order.OrderUploadLog;
import com.doushabao.saas.pojo.order.OrderUploadLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderUploadLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_upload_log
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    long countByExample(OrderUploadLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_upload_log
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int deleteByExample(OrderUploadLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_upload_log
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_upload_log
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int insert(OrderUploadLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_upload_log
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int insertSelective(OrderUploadLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_upload_log
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    List<OrderUploadLog> selectByExample(OrderUploadLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_upload_log
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    OrderUploadLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_upload_log
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int updateByExampleSelective(@Param("record") OrderUploadLog record, @Param("example") OrderUploadLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_upload_log
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int updateByExample(@Param("record") OrderUploadLog record, @Param("example") OrderUploadLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_upload_log
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int updateByPrimaryKeySelective(OrderUploadLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_upload_log
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int updateByPrimaryKey(OrderUploadLog record);
}