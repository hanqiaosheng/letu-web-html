package org.dao;

import org.apache.ibatis.annotations.Param;
import org.entity.dto.CouponToUser;
import org.entity.dto.CouponToUserExample;

import java.util.List;

public interface CouponToUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_to_user
     *
     * @mbggenerated
     */
    int countByExample(CouponToUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_to_user
     *
     * @mbggenerated
     */
    int deleteByExample(CouponToUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_to_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long couponUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_to_user
     *
     * @mbggenerated
     */
    int insert(CouponToUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_to_user
     *
     * @mbggenerated
     */
    int insertSelective(CouponToUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_to_user
     *
     * @mbggenerated
     */
    List<CouponToUser> selectByExample(CouponToUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_to_user
     *
     * @mbggenerated
     */
    CouponToUser selectByPrimaryKey(Long couponUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_to_user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CouponToUser record, @Param("example") CouponToUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_to_user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CouponToUser record, @Param("example") CouponToUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_to_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CouponToUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_to_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CouponToUser record);
}