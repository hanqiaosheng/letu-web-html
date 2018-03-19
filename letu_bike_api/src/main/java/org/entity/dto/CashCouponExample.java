package org.entity.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CashCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CashCouponExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Long value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Long value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Long value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Long value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Long value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Long> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Long> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Long value1, Long value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Long value1, Long value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNull() {
            addCriterion("coupon_money is null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNotNull() {
            addCriterion("coupon_money is not null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyEqualTo(BigDecimal value) {
            addCriterion("coupon_money =", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotEqualTo(BigDecimal value) {
            addCriterion("coupon_money <>", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThan(BigDecimal value) {
            addCriterion("coupon_money >", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_money >=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThan(BigDecimal value) {
            addCriterion("coupon_money <", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_money <=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIn(List<BigDecimal> values) {
            addCriterion("coupon_money in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotIn(List<BigDecimal> values) {
            addCriterion("coupon_money not in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_money between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_money not between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNull() {
            addCriterion("coupon_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNotNull() {
            addCriterion("coupon_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeEqualTo(Date value) {
            addCriterion("coupon_start_time =", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotEqualTo(Date value) {
            addCriterion("coupon_start_time <>", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThan(Date value) {
            addCriterion("coupon_start_time >", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_start_time >=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThan(Date value) {
            addCriterion("coupon_start_time <", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("coupon_start_time <=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIn(List<Date> values) {
            addCriterion("coupon_start_time in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotIn(List<Date> values) {
            addCriterion("coupon_start_time not in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeBetween(Date value1, Date value2) {
            addCriterion("coupon_start_time between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("coupon_start_time not between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeIsNull() {
            addCriterion("coupon_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeIsNotNull() {
            addCriterion("coupon_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeEqualTo(Date value) {
            addCriterion("coupon_create_time =", value, "couponCreateTime");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeNotEqualTo(Date value) {
            addCriterion("coupon_create_time <>", value, "couponCreateTime");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeGreaterThan(Date value) {
            addCriterion("coupon_create_time >", value, "couponCreateTime");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_create_time >=", value, "couponCreateTime");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeLessThan(Date value) {
            addCriterion("coupon_create_time <", value, "couponCreateTime");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("coupon_create_time <=", value, "couponCreateTime");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeIn(List<Date> values) {
            addCriterion("coupon_create_time in", values, "couponCreateTime");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeNotIn(List<Date> values) {
            addCriterion("coupon_create_time not in", values, "couponCreateTime");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeBetween(Date value1, Date value2) {
            addCriterion("coupon_create_time between", value1, value2, "couponCreateTime");
            return (Criteria) this;
        }

        public Criteria andCouponCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("coupon_create_time not between", value1, value2, "couponCreateTime");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityIsNull() {
            addCriterion("coupon_is_validity is null");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityIsNotNull() {
            addCriterion("coupon_is_validity is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityEqualTo(Integer value) {
            addCriterion("coupon_is_validity =", value, "couponIsValidity");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityNotEqualTo(Integer value) {
            addCriterion("coupon_is_validity <>", value, "couponIsValidity");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityGreaterThan(Integer value) {
            addCriterion("coupon_is_validity >", value, "couponIsValidity");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_is_validity >=", value, "couponIsValidity");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityLessThan(Integer value) {
            addCriterion("coupon_is_validity <", value, "couponIsValidity");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_is_validity <=", value, "couponIsValidity");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityIn(List<Integer> values) {
            addCriterion("coupon_is_validity in", values, "couponIsValidity");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityNotIn(List<Integer> values) {
            addCriterion("coupon_is_validity not in", values, "couponIsValidity");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityBetween(Integer value1, Integer value2) {
            addCriterion("coupon_is_validity between", value1, value2, "couponIsValidity");
            return (Criteria) this;
        }

        public Criteria andCouponIsValidityNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_is_validity not between", value1, value2, "couponIsValidity");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeIsNull() {
            addCriterion("coupon_validity_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeIsNotNull() {
            addCriterion("coupon_validity_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeEqualTo(Integer value) {
            addCriterion("coupon_validity_time =", value, "couponValidityTime");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeNotEqualTo(Integer value) {
            addCriterion("coupon_validity_time <>", value, "couponValidityTime");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeGreaterThan(Integer value) {
            addCriterion("coupon_validity_time >", value, "couponValidityTime");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_validity_time >=", value, "couponValidityTime");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeLessThan(Integer value) {
            addCriterion("coupon_validity_time <", value, "couponValidityTime");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_validity_time <=", value, "couponValidityTime");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeIn(List<Integer> values) {
            addCriterion("coupon_validity_time in", values, "couponValidityTime");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeNotIn(List<Integer> values) {
            addCriterion("coupon_validity_time not in", values, "couponValidityTime");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_validity_time between", value1, value2, "couponValidityTime");
            return (Criteria) this;
        }

        public Criteria andCouponValidityTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_validity_time not between", value1, value2, "couponValidityTime");
            return (Criteria) this;
        }

        public Criteria andCouponStateIsNull() {
            addCriterion("coupon_state is null");
            return (Criteria) this;
        }

        public Criteria andCouponStateIsNotNull() {
            addCriterion("coupon_state is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStateEqualTo(Integer value) {
            addCriterion("coupon_state =", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateNotEqualTo(Integer value) {
            addCriterion("coupon_state <>", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateGreaterThan(Integer value) {
            addCriterion("coupon_state >", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_state >=", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateLessThan(Integer value) {
            addCriterion("coupon_state <", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_state <=", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateIn(List<Integer> values) {
            addCriterion("coupon_state in", values, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateNotIn(List<Integer> values) {
            addCriterion("coupon_state not in", values, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateBetween(Integer value1, Integer value2) {
            addCriterion("coupon_state between", value1, value2, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_state not between", value1, value2, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNull() {
            addCriterion("coupon_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNotNull() {
            addCriterion("coupon_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeEqualTo(Date value) {
            addCriterion("coupon_end_time =", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotEqualTo(Date value) {
            addCriterion("coupon_end_time <>", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThan(Date value) {
            addCriterion("coupon_end_time >", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_end_time >=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThan(Date value) {
            addCriterion("coupon_end_time <", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("coupon_end_time <=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIn(List<Date> values) {
            addCriterion("coupon_end_time in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotIn(List<Date> values) {
            addCriterion("coupon_end_time not in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeBetween(Date value1, Date value2) {
            addCriterion("coupon_end_time between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("coupon_end_time not between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionIsNull() {
            addCriterion("coupon_is_condition is null");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionIsNotNull() {
            addCriterion("coupon_is_condition is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionEqualTo(Integer value) {
            addCriterion("coupon_is_condition =", value, "couponIsCondition");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionNotEqualTo(Integer value) {
            addCriterion("coupon_is_condition <>", value, "couponIsCondition");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionGreaterThan(Integer value) {
            addCriterion("coupon_is_condition >", value, "couponIsCondition");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_is_condition >=", value, "couponIsCondition");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionLessThan(Integer value) {
            addCriterion("coupon_is_condition <", value, "couponIsCondition");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_is_condition <=", value, "couponIsCondition");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionIn(List<Integer> values) {
            addCriterion("coupon_is_condition in", values, "couponIsCondition");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionNotIn(List<Integer> values) {
            addCriterion("coupon_is_condition not in", values, "couponIsCondition");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionBetween(Integer value1, Integer value2) {
            addCriterion("coupon_is_condition between", value1, value2, "couponIsCondition");
            return (Criteria) this;
        }

        public Criteria andCouponIsConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_is_condition not between", value1, value2, "couponIsCondition");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyIsNull() {
            addCriterion("coupon_start_money is null");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyIsNotNull() {
            addCriterion("coupon_start_money is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyEqualTo(BigDecimal value) {
            addCriterion("coupon_start_money =", value, "couponStartMoney");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyNotEqualTo(BigDecimal value) {
            addCriterion("coupon_start_money <>", value, "couponStartMoney");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyGreaterThan(BigDecimal value) {
            addCriterion("coupon_start_money >", value, "couponStartMoney");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_start_money >=", value, "couponStartMoney");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyLessThan(BigDecimal value) {
            addCriterion("coupon_start_money <", value, "couponStartMoney");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_start_money <=", value, "couponStartMoney");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyIn(List<BigDecimal> values) {
            addCriterion("coupon_start_money in", values, "couponStartMoney");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyNotIn(List<BigDecimal> values) {
            addCriterion("coupon_start_money not in", values, "couponStartMoney");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_start_money between", value1, value2, "couponStartMoney");
            return (Criteria) this;
        }

        public Criteria andCouponStartMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_start_money not between", value1, value2, "couponStartMoney");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}