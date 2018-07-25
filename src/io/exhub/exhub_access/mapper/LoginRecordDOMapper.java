package io.exhub.exhub_access.mapper;

import io.exhub.exhub_access.pojo.DO.LoginRecordDO;
import io.exhub.exhub_access.pojo.DO.LoginRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginRecordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_record
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    long countByExample(LoginRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_record
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    int deleteByExample(LoginRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_record
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_record
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    int insert(LoginRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_record
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    int insertSelective(LoginRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_record
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    List<LoginRecordDO> selectByExample(LoginRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_record
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    LoginRecordDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_record
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    int updateByExampleSelective(@Param("record") LoginRecordDO record, @Param("example") LoginRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_record
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    int updateByExample(@Param("record") LoginRecordDO record, @Param("example") LoginRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_record
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    int updateByPrimaryKeySelective(LoginRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_record
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    int updateByPrimaryKey(LoginRecordDO record);
}