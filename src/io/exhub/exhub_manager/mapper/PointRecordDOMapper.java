package io.exhub.exhub_manager.mapper;

import io.exhub.exhub_manager.pojo.DO.PointRecordDO;
import io.exhub.exhub_manager.pojo.DO.PointRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointRecordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_record
     *
     * @mbg.generated Fri Jul 27 11:08:29 CST 2018
     */
    long countByExample(PointRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_record
     *
     * @mbg.generated Fri Jul 27 11:08:29 CST 2018
     */
    int deleteByExample(PointRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_record
     *
     * @mbg.generated Fri Jul 27 11:08:29 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_record
     *
     * @mbg.generated Fri Jul 27 11:08:29 CST 2018
     */
    int insert(PointRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_record
     *
     * @mbg.generated Fri Jul 27 11:08:29 CST 2018
     */
    int insertSelective(PointRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_record
     *
     * @mbg.generated Fri Jul 27 11:08:29 CST 2018
     */
    List<PointRecordDO> selectByExample(PointRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_record
     *
     * @mbg.generated Fri Jul 27 11:08:29 CST 2018
     */
    PointRecordDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_record
     *
     * @mbg.generated Fri Jul 27 11:08:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") PointRecordDO record, @Param("example") PointRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_record
     *
     * @mbg.generated Fri Jul 27 11:08:29 CST 2018
     */
    int updateByExample(@Param("record") PointRecordDO record, @Param("example") PointRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_record
     *
     * @mbg.generated Fri Jul 27 11:08:29 CST 2018
     */
    int updateByPrimaryKeySelective(PointRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_record
     *
     * @mbg.generated Fri Jul 27 11:08:29 CST 2018
     */
    int updateByPrimaryKey(PointRecordDO record);
}