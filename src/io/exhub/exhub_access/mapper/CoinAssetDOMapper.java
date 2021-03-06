package io.exhub.exhub_access.mapper;

import io.exhub.exhub_access.pojo.DO.CoinAssetDO;
import io.exhub.exhub_access.pojo.DO.CoinAssetDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoinAssetDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coin_asset
     *
     * @mbg.generated Thu Aug 09 18:11:23 CST 2018
     */
    long countByExample(CoinAssetDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coin_asset
     *
     * @mbg.generated Thu Aug 09 18:11:23 CST 2018
     */
    int deleteByExample(CoinAssetDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coin_asset
     *
     * @mbg.generated Thu Aug 09 18:11:23 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coin_asset
     *
     * @mbg.generated Thu Aug 09 18:11:23 CST 2018
     */
    int insert(CoinAssetDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coin_asset
     *
     * @mbg.generated Thu Aug 09 18:11:23 CST 2018
     */
    int insertSelective(CoinAssetDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coin_asset
     *
     * @mbg.generated Thu Aug 09 18:11:23 CST 2018
     */
    List<CoinAssetDO> selectByExample(CoinAssetDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coin_asset
     *
     * @mbg.generated Thu Aug 09 18:11:23 CST 2018
     */
    CoinAssetDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coin_asset
     *
     * @mbg.generated Thu Aug 09 18:11:23 CST 2018
     */
    int updateByExampleSelective(@Param("record") CoinAssetDO record, @Param("example") CoinAssetDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coin_asset
     *
     * @mbg.generated Thu Aug 09 18:11:23 CST 2018
     */
    int updateByExample(@Param("record") CoinAssetDO record, @Param("example") CoinAssetDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coin_asset
     *
     * @mbg.generated Thu Aug 09 18:11:23 CST 2018
     */
    int updateByPrimaryKeySelective(CoinAssetDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coin_asset
     *
     * @mbg.generated Thu Aug 09 18:11:23 CST 2018
     */
    int updateByPrimaryKey(CoinAssetDO record);
}