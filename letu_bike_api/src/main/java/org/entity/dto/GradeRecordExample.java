package org.entity.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GradeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public GradeRecordExample() {
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

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Long value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Long value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Long value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Long value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Long value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Long> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Long> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Long value1, Long value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Long value1, Long value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkIsNull() {
            addCriterion("grade_remark is null");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkIsNotNull() {
            addCriterion("grade_remark is not null");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkEqualTo(String value) {
            addCriterion("grade_remark =", value, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkNotEqualTo(String value) {
            addCriterion("grade_remark <>", value, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkGreaterThan(String value) {
            addCriterion("grade_remark >", value, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("grade_remark >=", value, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkLessThan(String value) {
            addCriterion("grade_remark <", value, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkLessThanOrEqualTo(String value) {
            addCriterion("grade_remark <=", value, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkLike(String value) {
            addCriterion("grade_remark like", value, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkNotLike(String value) {
            addCriterion("grade_remark not like", value, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkIn(List<String> values) {
            addCriterion("grade_remark in", values, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkNotIn(List<String> values) {
            addCriterion("grade_remark not in", values, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkBetween(String value1, String value2) {
            addCriterion("grade_remark between", value1, value2, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeRemarkNotBetween(String value1, String value2) {
            addCriterion("grade_remark not between", value1, value2, "gradeRemark");
            return (Criteria) this;
        }

        public Criteria andGradeCountIsNull() {
            addCriterion("grade_count is null");
            return (Criteria) this;
        }

        public Criteria andGradeCountIsNotNull() {
            addCriterion("grade_count is not null");
            return (Criteria) this;
        }

        public Criteria andGradeCountEqualTo(Integer value) {
            addCriterion("grade_count =", value, "gradeCount");
            return (Criteria) this;
        }

        public Criteria andGradeCountNotEqualTo(Integer value) {
            addCriterion("grade_count <>", value, "gradeCount");
            return (Criteria) this;
        }

        public Criteria andGradeCountGreaterThan(Integer value) {
            addCriterion("grade_count >", value, "gradeCount");
            return (Criteria) this;
        }

        public Criteria andGradeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_count >=", value, "gradeCount");
            return (Criteria) this;
        }

        public Criteria andGradeCountLessThan(Integer value) {
            addCriterion("grade_count <", value, "gradeCount");
            return (Criteria) this;
        }

        public Criteria andGradeCountLessThanOrEqualTo(Integer value) {
            addCriterion("grade_count <=", value, "gradeCount");
            return (Criteria) this;
        }

        public Criteria andGradeCountIn(List<Integer> values) {
            addCriterion("grade_count in", values, "gradeCount");
            return (Criteria) this;
        }

        public Criteria andGradeCountNotIn(List<Integer> values) {
            addCriterion("grade_count not in", values, "gradeCount");
            return (Criteria) this;
        }

        public Criteria andGradeCountBetween(Integer value1, Integer value2) {
            addCriterion("grade_count between", value1, value2, "gradeCount");
            return (Criteria) this;
        }

        public Criteria andGradeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_count not between", value1, value2, "gradeCount");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdIsNull() {
            addCriterion("grade_user_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdIsNotNull() {
            addCriterion("grade_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdEqualTo(Long value) {
            addCriterion("grade_user_id =", value, "gradeUserId");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdNotEqualTo(Long value) {
            addCriterion("grade_user_id <>", value, "gradeUserId");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdGreaterThan(Long value) {
            addCriterion("grade_user_id >", value, "gradeUserId");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("grade_user_id >=", value, "gradeUserId");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdLessThan(Long value) {
            addCriterion("grade_user_id <", value, "gradeUserId");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdLessThanOrEqualTo(Long value) {
            addCriterion("grade_user_id <=", value, "gradeUserId");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdIn(List<Long> values) {
            addCriterion("grade_user_id in", values, "gradeUserId");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdNotIn(List<Long> values) {
            addCriterion("grade_user_id not in", values, "gradeUserId");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdBetween(Long value1, Long value2) {
            addCriterion("grade_user_id between", value1, value2, "gradeUserId");
            return (Criteria) this;
        }

        public Criteria andGradeUserIdNotBetween(Long value1, Long value2) {
            addCriterion("grade_user_id not between", value1, value2, "gradeUserId");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeIsNull() {
            addCriterion("grade_create_time is null");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeIsNotNull() {
            addCriterion("grade_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeEqualTo(Date value) {
            addCriterion("grade_create_time =", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeNotEqualTo(Date value) {
            addCriterion("grade_create_time <>", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeGreaterThan(Date value) {
            addCriterion("grade_create_time >", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("grade_create_time >=", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeLessThan(Date value) {
            addCriterion("grade_create_time <", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("grade_create_time <=", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeIn(List<Date> values) {
            addCriterion("grade_create_time in", values, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeNotIn(List<Date> values) {
            addCriterion("grade_create_time not in", values, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("grade_create_time between", value1, value2, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("grade_create_time not between", value1, value2, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeStateIsNull() {
            addCriterion("grade_state is null");
            return (Criteria) this;
        }

        public Criteria andGradeStateIsNotNull() {
            addCriterion("grade_state is not null");
            return (Criteria) this;
        }

        public Criteria andGradeStateEqualTo(Integer value) {
            addCriterion("grade_state =", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateNotEqualTo(Integer value) {
            addCriterion("grade_state <>", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateGreaterThan(Integer value) {
            addCriterion("grade_state >", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_state >=", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateLessThan(Integer value) {
            addCriterion("grade_state <", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateLessThanOrEqualTo(Integer value) {
            addCriterion("grade_state <=", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateIn(List<Integer> values) {
            addCriterion("grade_state in", values, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateNotIn(List<Integer> values) {
            addCriterion("grade_state not in", values, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateBetween(Integer value1, Integer value2) {
            addCriterion("grade_state between", value1, value2, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_state not between", value1, value2, "gradeState");
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