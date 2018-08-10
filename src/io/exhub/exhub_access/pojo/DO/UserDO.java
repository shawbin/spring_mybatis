package io.exhub.exhub_access.pojo.DO;

import java.util.Date;

public class UserDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_Id
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.invitation_code
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    private String invitationCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.wallet
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    private JSONObject wallet;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.google_validate_code
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    private String googleValidateCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.google_validate_code_flag
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    private Boolean googleValidateCodeFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    private Boolean status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_time
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_time
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_Id
     *
     * @return the value of user.user_Id
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_Id
     *
     * @param userId the value for user.user_Id
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.invitation_code
     *
     * @return the value of user.invitation_code
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public String getInvitationCode() {
        return invitationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.invitation_code
     *
     * @param invitationCode the value for user.invitation_code
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.wallet
     *
     * @return the value of user.wallet
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public JSONObject getWallet() {
        return wallet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.wallet
     *
     * @param wallet the value for user.wallet
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public void setWallet(JSONObject wallet) {
        this.wallet = wallet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.google_validate_code
     *
     * @return the value of user.google_validate_code
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public String getGoogleValidateCode() {
        return googleValidateCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.google_validate_code
     *
     * @param googleValidateCode the value for user.google_validate_code
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public void setGoogleValidateCode(String googleValidateCode) {
        this.googleValidateCode = googleValidateCode == null ? null : googleValidateCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.google_validate_code_flag
     *
     * @return the value of user.google_validate_code_flag
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public Boolean getGoogleValidateCodeFlag() {
        return googleValidateCodeFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.google_validate_code_flag
     *
     * @param googleValidateCodeFlag the value for user.google_validate_code_flag
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public void setGoogleValidateCodeFlag(Boolean googleValidateCodeFlag) {
        this.googleValidateCodeFlag = googleValidateCodeFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_time
     *
     * @return the value of user.create_time
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_time
     *
     * @param createTime the value for user.create_time
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_time
     *
     * @return the value of user.update_time
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_time
     *
     * @param updateTime the value for user.update_time
     *
     * @mbg.generated Thu Jul 26 14:28:35 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}