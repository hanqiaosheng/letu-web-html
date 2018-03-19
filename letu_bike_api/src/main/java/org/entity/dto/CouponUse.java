package org.entity.dto;

import java.io.Serializable;
import java.util.Date;

public class CouponUse implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_use.coupon_use_id
     *
     * @mbggenerated
     */
    private Long couponUseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_use.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_use.coupon_scheme_id
     *
     * @mbggenerated
     */
    private Long couponSchemeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_use.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon_use
     *
     * @mbggenerated
     */
    private User user;
    private CouponScheme couponScheme;

    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_use.coupon_use_id
     *
     * @return the value of coupon_use.coupon_use_id
     *
     * @mbggenerated
     */
    public Long getCouponUseId() {
        return couponUseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_use.coupon_use_id
     *
     * @param couponUseId the value for coupon_use.coupon_use_id
     *
     * @mbggenerated
     */
    public void setCouponUseId(Long couponUseId) {
        this.couponUseId = couponUseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_use.user_id
     *
     * @return the value of coupon_use.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_use.user_id
     *
     * @param userId the value for coupon_use.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_use.coupon_scheme_id
     *
     * @return the value of coupon_use.coupon_scheme_id
     *
     * @mbggenerated
     */
    public Long getCouponSchemeId() {
        return couponSchemeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_use.coupon_scheme_id
     *
     * @param couponSchemeId the value for coupon_use.coupon_scheme_id
     *
     * @mbggenerated
     */
    public void setCouponSchemeId(Long couponSchemeId) {
        this.couponSchemeId = couponSchemeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_use.create_time
     *
     * @return the value of coupon_use.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_use.create_time
     *
     * @param createTime the value for coupon_use.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CouponScheme getCouponScheme() {
        return couponScheme;
    }

    public void setCouponScheme(CouponScheme couponScheme) {
        this.couponScheme = couponScheme;
    }
}