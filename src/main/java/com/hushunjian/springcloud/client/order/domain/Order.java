package com.hushunjian.springcloud.client.order.domain;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hsj_order.id
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hsj_order.order_name
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    private String orderName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hsj_order.order_remark
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    private String orderRemark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hsj_order.receive_address
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    private String receiveAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hsj_order.user_id
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hsj_order.id
     *
     * @return the value of hsj_order.id
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hsj_order.id
     *
     * @param id the value for hsj_order.id
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hsj_order.order_name
     *
     * @return the value of hsj_order.order_name
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hsj_order.order_name
     *
     * @param orderName the value for hsj_order.order_name
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hsj_order.order_remark
     *
     * @return the value of hsj_order.order_remark
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    public String getOrderRemark() {
        return orderRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hsj_order.order_remark
     *
     * @param orderRemark the value for hsj_order.order_remark
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hsj_order.receive_address
     *
     * @return the value of hsj_order.receive_address
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    public String getReceiveAddress() {
        return receiveAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hsj_order.receive_address
     *
     * @param receiveAddress the value for hsj_order.receive_address
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hsj_order.user_id
     *
     * @return the value of hsj_order.user_id
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hsj_order.user_id
     *
     * @param userId the value for hsj_order.user_id
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}