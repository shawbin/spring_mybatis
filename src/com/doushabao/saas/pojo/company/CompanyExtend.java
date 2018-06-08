package com.doushabao.saas.pojo.company;

import java.util.Date;

public class CompanyExtend {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company_extend.id
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company_extend.source
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company_extend.contact_name
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    private String contactName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company_extend.contact_phone
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    private String contactPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company_extend.email
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company_extend.pay_way
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    private Integer payWay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company_extend.account_no
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    private String accountNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company_extend.open_bank
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    private String openBank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company_extend.pay_name
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    private String payName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company_extend.create_at
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company_extend.update_at
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    private Date updateAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company_extend.id
     *
     * @return the value of t_company_extend.id
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company_extend.id
     *
     * @param id the value for t_company_extend.id
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company_extend.source
     *
     * @return the value of t_company_extend.source
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company_extend.source
     *
     * @param source the value for t_company_extend.source
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company_extend.contact_name
     *
     * @return the value of t_company_extend.contact_name
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company_extend.contact_name
     *
     * @param contactName the value for t_company_extend.contact_name
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company_extend.contact_phone
     *
     * @return the value of t_company_extend.contact_phone
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company_extend.contact_phone
     *
     * @param contactPhone the value for t_company_extend.contact_phone
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company_extend.email
     *
     * @return the value of t_company_extend.email
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company_extend.email
     *
     * @param email the value for t_company_extend.email
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company_extend.pay_way
     *
     * @return the value of t_company_extend.pay_way
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public Integer getPayWay() {
        return payWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company_extend.pay_way
     *
     * @param payWay the value for t_company_extend.pay_way
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company_extend.account_no
     *
     * @return the value of t_company_extend.account_no
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company_extend.account_no
     *
     * @param accountNo the value for t_company_extend.account_no
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company_extend.open_bank
     *
     * @return the value of t_company_extend.open_bank
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public String getOpenBank() {
        return openBank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company_extend.open_bank
     *
     * @param openBank the value for t_company_extend.open_bank
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public void setOpenBank(String openBank) {
        this.openBank = openBank == null ? null : openBank.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company_extend.pay_name
     *
     * @return the value of t_company_extend.pay_name
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public String getPayName() {
        return payName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company_extend.pay_name
     *
     * @param payName the value for t_company_extend.pay_name
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company_extend.create_at
     *
     * @return the value of t_company_extend.create_at
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company_extend.create_at
     *
     * @param createAt the value for t_company_extend.create_at
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company_extend.update_at
     *
     * @return the value of t_company_extend.update_at
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company_extend.update_at
     *
     * @param updateAt the value for t_company_extend.update_at
     *
     * @mbg.generated Thu Jun 07 11:14:08 CST 2018
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}