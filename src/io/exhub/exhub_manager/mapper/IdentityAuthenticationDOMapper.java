package io.exhub.exhub_manager.mapper;

import io.exhub.exhub_manager.pojo.DO.IdentityAuthenticationDO;
import io.exhub.exhub_manager.pojo.DO.IdentityAuthenticationDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdentityAuthenticationDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_identity_authentication
     *
     * @mbg.generated Thu Jul 26 17:01:54 CST 2018
     */
    long countByExample(IdentityAuthenticationDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_identity_authentication
     *
     * @mbg.generated Thu Jul 26 17:01:54 CST 2018
     */
    int deleteByExample(IdentityAuthenticationDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_identity_authentication
     *
     * @mbg.generated Thu Jul 26 17:01:54 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_identity_authentication
     *
     * @mbg.generated Thu Jul 26 17:01:54 CST 2018
     */
    int insert(IdentityAuthenticationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_identity_authentication
     *
     * @mbg.generated Thu Jul 26 17:01:54 CST 2018
     */
    int insertSelective(IdentityAuthenticationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_identity_authentication
     *
     * @mbg.generated Thu Jul 26 17:01:54 CST 2018
     */
    List<IdentityAuthenticationDO> selectByExample(IdentityAuthenticationDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_identity_authentication
     *
     * @mbg.generated Thu Jul 26 17:01:54 CST 2018
     */
    IdentityAuthenticationDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_identity_authentication
     *
     * @mbg.generated Thu Jul 26 17:01:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") IdentityAuthenticationDO record, @Param("example") IdentityAuthenticationDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_identity_authentication
     *
     * @mbg.generated Thu Jul 26 17:01:54 CST 2018
     */
    int updateByExample(@Param("record") IdentityAuthenticationDO record, @Param("example") IdentityAuthenticationDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_identity_authentication
     *
     * @mbg.generated Thu Jul 26 17:01:54 CST 2018
     */
    int updateByPrimaryKeySelective(IdentityAuthenticationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_identity_authentication
     *
     * @mbg.generated Thu Jul 26 17:01:54 CST 2018
     */
    int updateByPrimaryKey(IdentityAuthenticationDO record);
}