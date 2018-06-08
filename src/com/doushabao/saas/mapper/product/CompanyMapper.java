package com.doushabao.saas.mapper.product;

import com.doushabao.saas.pojo.product.Company;
import com.doushabao.saas.pojo.product.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Wed Jun 06 14:52:25 CST 2018
     */
    long countByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Wed Jun 06 14:52:25 CST 2018
     */
    int deleteByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Wed Jun 06 14:52:25 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Wed Jun 06 14:52:25 CST 2018
     */
    int insert(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Wed Jun 06 14:52:25 CST 2018
     */
    int insertSelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Wed Jun 06 14:52:25 CST 2018
     */
    List<Company> selectByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Wed Jun 06 14:52:25 CST 2018
     */
    Company selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Wed Jun 06 14:52:25 CST 2018
     */
    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Wed Jun 06 14:52:25 CST 2018
     */
    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Wed Jun 06 14:52:25 CST 2018
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Wed Jun 06 14:52:25 CST 2018
     */
    int updateByPrimaryKey(Company record);
}