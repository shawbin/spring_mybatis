package io.exhub.exhub_manager.pojo.DO;

import java.math.BigDecimal;
import java.util.Date;

public class CoinAssetDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coin_asset.id
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coin_asset.asset_name
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    private String assetName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coin_asset.coin_name
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    private String coinName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coin_asset.large_amount
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    private Long largeAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coin_asset.withdraw_rate
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    private BigDecimal withdrawRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coin_asset.withdraw_status
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    private Boolean withdrawStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coin_asset.recharge_status
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    private Boolean rechargeStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coin_asset.create_time
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coin_asset.update_time
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coin_asset.id
     *
     * @return the value of t_coin_asset.id
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coin_asset.id
     *
     * @param id the value for t_coin_asset.id
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coin_asset.asset_name
     *
     * @return the value of t_coin_asset.asset_name
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coin_asset.asset_name
     *
     * @param assetName the value for t_coin_asset.asset_name
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public void setAssetName(String assetName) {
        this.assetName = assetName == null ? null : assetName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coin_asset.coin_name
     *
     * @return the value of t_coin_asset.coin_name
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public String getCoinName() {
        return coinName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coin_asset.coin_name
     *
     * @param coinName the value for t_coin_asset.coin_name
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public void setCoinName(String coinName) {
        this.coinName = coinName == null ? null : coinName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coin_asset.large_amount
     *
     * @return the value of t_coin_asset.large_amount
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public Long getLargeAmount() {
        return largeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coin_asset.large_amount
     *
     * @param largeAmount the value for t_coin_asset.large_amount
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public void setLargeAmount(Long largeAmount) {
        this.largeAmount = largeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coin_asset.withdraw_rate
     *
     * @return the value of t_coin_asset.withdraw_rate
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public BigDecimal getWithdrawRate() {
        return withdrawRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coin_asset.withdraw_rate
     *
     * @param withdrawRate the value for t_coin_asset.withdraw_rate
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public void setWithdrawRate(BigDecimal withdrawRate) {
        this.withdrawRate = withdrawRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coin_asset.withdraw_status
     *
     * @return the value of t_coin_asset.withdraw_status
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public Boolean getWithdrawStatus() {
        return withdrawStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coin_asset.withdraw_status
     *
     * @param withdrawStatus the value for t_coin_asset.withdraw_status
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public void setWithdrawStatus(Boolean withdrawStatus) {
        this.withdrawStatus = withdrawStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coin_asset.recharge_status
     *
     * @return the value of t_coin_asset.recharge_status
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public Boolean getRechargeStatus() {
        return rechargeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coin_asset.recharge_status
     *
     * @param rechargeStatus the value for t_coin_asset.recharge_status
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public void setRechargeStatus(Boolean rechargeStatus) {
        this.rechargeStatus = rechargeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coin_asset.create_time
     *
     * @return the value of t_coin_asset.create_time
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coin_asset.create_time
     *
     * @param createTime the value for t_coin_asset.create_time
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coin_asset.update_time
     *
     * @return the value of t_coin_asset.update_time
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coin_asset.update_time
     *
     * @param updateTime the value for t_coin_asset.update_time
     *
     * @mbg.generated Wed Aug 08 20:50:20 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}