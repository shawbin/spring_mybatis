package io.exhub.exhub_manager.mapper;

import io.exhub.exhub_manager.pojo.DO.ManagerUserDO;
import io.exhub.exhub_manager.pojo.DO.ManagerUserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerUserDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager_user
     *
     * @mbg.generated Thu Jul 26 20:09:45 CST 2018
     */
    long countByExample(ManagerUserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager_user
     *
     * @mbg.generated Thu Jul 26 20:09:45 CST 2018
     */
    int deleteByExample(ManagerUserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager_user
     *
     * @mbg.generated Thu Jul 26 20:09:45 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager_user
     *
     * @mbg.generated Thu Jul 26 20:09:45 CST 2018
     */
    int insert(ManagerUserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager_user
     *
     * @mbg.generated Thu Jul 26 20:09:45 CST 2018
     */
    int insertSelective(ManagerUserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager_user
     *
     * @mbg.generated Thu Jul 26 20:09:45 CST 2018
     */
    List<ManagerUserDO> selectByExample(ManagerUserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager_user
     *
     * @mbg.generated Thu Jul 26 20:09:45 CST 2018
     */
    ManagerUserDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager_user
     *
     * @mbg.generated Thu Jul 26 20:09:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") ManagerUserDO record, @Param("example") ManagerUserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager_user
     *
     * @mbg.generated Thu Jul 26 20:09:45 CST 2018
     */
    int updateByExample(@Param("record") ManagerUserDO record, @Param("example") ManagerUserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager_user
     *
     * @mbg.generated Thu Jul 26 20:09:45 CST 2018
     */
    int updateByPrimaryKeySelective(ManagerUserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager_user
     *
     * @mbg.generated Thu Jul 26 20:09:45 CST 2018
     */
    int updateByPrimaryKey(ManagerUserDO record);
}