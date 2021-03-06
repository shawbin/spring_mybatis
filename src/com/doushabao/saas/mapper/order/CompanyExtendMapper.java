package com.doushabao.saas.mapper.order;

import com.doushabao.saas.pojo.order.CompanyExtend;
import com.doushabao.saas.pojo.order.CompanyExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyExtendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company_extend
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    long countByExample(CompanyExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company_extend
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int deleteByExample(CompanyExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company_extend
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company_extend
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int insert(CompanyExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company_extend
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int insertSelective(CompanyExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company_extend
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    List<CompanyExtend> selectByExample(CompanyExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company_extend
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    CompanyExtend selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company_extend
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int updateByExampleSelective(@Param("record") CompanyExtend record, @Param("example") CompanyExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company_extend
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int updateByExample(@Param("record") CompanyExtend record, @Param("example") CompanyExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company_extend
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int updateByPrimaryKeySelective(CompanyExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company_extend
     *
     * @mbg.generated Mon Jun 04 11:04:34 CST 2018
     */
    int updateByPrimaryKey(CompanyExtend record);
}