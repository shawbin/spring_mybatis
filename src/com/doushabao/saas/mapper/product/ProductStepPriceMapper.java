package com.doushabao.saas.mapper.product;

import com.doushabao.saas.pojo.product.ProductStepPrice;
import com.doushabao.saas.pojo.product.ProductStepPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductStepPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_step_price
     *
     * @mbg.generated Tue Jun 05 17:08:57 CST 2018
     */
    long countByExample(ProductStepPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_step_price
     *
     * @mbg.generated Tue Jun 05 17:08:57 CST 2018
     */
    int deleteByExample(ProductStepPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_step_price
     *
     * @mbg.generated Tue Jun 05 17:08:57 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_step_price
     *
     * @mbg.generated Tue Jun 05 17:08:57 CST 2018
     */
    int insert(ProductStepPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_step_price
     *
     * @mbg.generated Tue Jun 05 17:08:57 CST 2018
     */
    int insertSelective(ProductStepPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_step_price
     *
     * @mbg.generated Tue Jun 05 17:08:57 CST 2018
     */
    List<ProductStepPrice> selectByExample(ProductStepPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_step_price
     *
     * @mbg.generated Tue Jun 05 17:08:57 CST 2018
     */
    ProductStepPrice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_step_price
     *
     * @mbg.generated Tue Jun 05 17:08:57 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductStepPrice record, @Param("example") ProductStepPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_step_price
     *
     * @mbg.generated Tue Jun 05 17:08:57 CST 2018
     */
    int updateByExample(@Param("record") ProductStepPrice record, @Param("example") ProductStepPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_step_price
     *
     * @mbg.generated Tue Jun 05 17:08:57 CST 2018
     */
    int updateByPrimaryKeySelective(ProductStepPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_step_price
     *
     * @mbg.generated Tue Jun 05 17:08:57 CST 2018
     */
    int updateByPrimaryKey(ProductStepPrice record);
}