package com.doushabao.entity;

import java.util.Date;

public class OrderEntity {
    public static final Integer PRODUCT = 0;//类型：产品
    public static final Integer CARD = 1;//类型：保障卡

    private Long id;

    /**
     * 用户标识
     */
    private String openid;

    /**
     * 用户名
     */
    private String name;
    /***
     * 电话
     */

    private String phoneno;
    /**
     * 订单编号
     */
    private String ticketno;

    /**
     * 产品id
     */
    private Long productid;
    /**
     * 保障卡id
     */
    private Long securityCardId;

    /**
     * 预支付ID（微信用）
     */
    private String prepayid;

    /**
     * 产品编号
     */
    private String productno;

    /**
     * 状态（已支付，未支付,申请取消，退款中，退款完成）
     */
    private String status;

    /**
     * 下单时间
     */
    private Date ordertime;

    /**
     * 支付时间
     */
    private Date paytime;

    /**
     * 订单原始金额单位分
     */
    private Integer originalamount;

    /**
     * 折扣后实际金额 单位（分）
     */
    private Integer discountamount;

    /**
     * 产品名称
     */
    private String productname;

    /**
     * 邀请码
     */
    private String invitecode;

    /**
     * 优惠码
     * 澳洲是折扣码
     */
    private String discountcode;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    private String source;

    private Long userid;

    private String ip;
    /**
     * 商品id
     */
    private String productidlist;

    private String allprice;
    //目的地城市
    private String destinationCity;
    /**
     * 订单类型(默认0产品，1保障卡)
     */
    private Integer orderType = PRODUCT;
    /**
     * 删除状态（0未删除，1已删除）
     */
    private Integer deleteStatus = 0;
    private String num;
    private Long billId;
    //结算状态
    private String billStatus;
    //澳洲新增
    private String quoteNumber;
    private String currency;
    private String amount;
    private String qrCode;
    private String qrPeriod;

    private Integer isExit;

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getQrPeriod() {
        return qrPeriod;
    }

    public void setQrPeriod(String qrPeriod) {
        this.qrPeriod = qrPeriod;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getQuoteNumber() {
        return quoteNumber;
    }

    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getAllprice() {
        return allprice;
    }

    public void setAllprice(String allprice) {
        this.allprice = allprice;
    }

    public String getProductidlist() {
        return productidlist;
    }

    public void setProductidlist(String productidlist) {
        this.productidlist = productidlist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getTicketno() {
        return ticketno;
    }

    public void setTicketno(String ticketno) {
        this.ticketno = ticketno;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public String getPrepayid() {
        return prepayid;
    }

    public void setPrepayid(String prepayid) {
        this.prepayid = prepayid;
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Integer getOriginalamount() {
        return originalamount;
    }

    public void setOriginalamount(Integer originalamount) {
        this.originalamount = originalamount;
    }

    public Integer getDiscountamount() {
        return discountamount;
    }

    public void setDiscountamount(Integer discountamount) {
        this.discountamount = discountamount;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getInvitecode() {
        return invitecode;
    }

    public void setInvitecode(String invitecode) {
        this.invitecode = invitecode;
    }

    public String getDiscountcode() {
        return discountcode;
    }

    public void setDiscountcode(String discountcode) {
        this.discountcode = discountcode;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getSecurityCardId() {
        return securityCardId;
    }

    public void setSecurityCardId(Long securityCardId) {
        this.securityCardId = securityCardId;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Integer getIsExit() {
        return isExit;
    }

    public void setIsExit(Integer isExit) {
        this.isExit = isExit;
    }
}