package org.entity.dto;

import java.util.ArrayList;
import java.util.List;

public class UserTicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UserTicketExample() {
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

        public Criteria andUserTicketIdIsNull() {
            addCriterion("user_ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andUserTicketIdIsNotNull() {
            addCriterion("user_ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserTicketIdEqualTo(Long value) {
            addCriterion("user_ticket_id =", value, "userTicketId");
            return (Criteria) this;
        }

        public Criteria andUserTicketIdNotEqualTo(Long value) {
            addCriterion("user_ticket_id <>", value, "userTicketId");
            return (Criteria) this;
        }

        public Criteria andUserTicketIdGreaterThan(Long value) {
            addCriterion("user_ticket_id >", value, "userTicketId");
            return (Criteria) this;
        }

        public Criteria andUserTicketIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_ticket_id >=", value, "userTicketId");
            return (Criteria) this;
        }

        public Criteria andUserTicketIdLessThan(Long value) {
            addCriterion("user_ticket_id <", value, "userTicketId");
            return (Criteria) this;
        }

        public Criteria andUserTicketIdLessThanOrEqualTo(Long value) {
            addCriterion("user_ticket_id <=", value, "userTicketId");
            return (Criteria) this;
        }

        public Criteria andUserTicketIdIn(List<Long> values) {
            addCriterion("user_ticket_id in", values, "userTicketId");
            return (Criteria) this;
        }

        public Criteria andUserTicketIdNotIn(List<Long> values) {
            addCriterion("user_ticket_id not in", values, "userTicketId");
            return (Criteria) this;
        }

        public Criteria andUserTicketIdBetween(Long value1, Long value2) {
            addCriterion("user_ticket_id between", value1, value2, "userTicketId");
            return (Criteria) this;
        }

        public Criteria andUserTicketIdNotBetween(Long value1, Long value2) {
            addCriterion("user_ticket_id not between", value1, value2, "userTicketId");
            return (Criteria) this;
        }

        public Criteria andUtUserIdIsNull() {
            addCriterion("ut_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUtUserIdIsNotNull() {
            addCriterion("ut_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUtUserIdEqualTo(Long value) {
            addCriterion("ut_user_id =", value, "utUserId");
            return (Criteria) this;
        }

        public Criteria andUtUserIdNotEqualTo(Long value) {
            addCriterion("ut_user_id <>", value, "utUserId");
            return (Criteria) this;
        }

        public Criteria andUtUserIdGreaterThan(Long value) {
            addCriterion("ut_user_id >", value, "utUserId");
            return (Criteria) this;
        }

        public Criteria andUtUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ut_user_id >=", value, "utUserId");
            return (Criteria) this;
        }

        public Criteria andUtUserIdLessThan(Long value) {
            addCriterion("ut_user_id <", value, "utUserId");
            return (Criteria) this;
        }

        public Criteria andUtUserIdLessThanOrEqualTo(Long value) {
            addCriterion("ut_user_id <=", value, "utUserId");
            return (Criteria) this;
        }

        public Criteria andUtUserIdIn(List<Long> values) {
            addCriterion("ut_user_id in", values, "utUserId");
            return (Criteria) this;
        }

        public Criteria andUtUserIdNotIn(List<Long> values) {
            addCriterion("ut_user_id not in", values, "utUserId");
            return (Criteria) this;
        }

        public Criteria andUtUserIdBetween(Long value1, Long value2) {
            addCriterion("ut_user_id between", value1, value2, "utUserId");
            return (Criteria) this;
        }

        public Criteria andUtUserIdNotBetween(Long value1, Long value2) {
            addCriterion("ut_user_id not between", value1, value2, "utUserId");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdIsNull() {
            addCriterion("ut_ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdIsNotNull() {
            addCriterion("ut_ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdEqualTo(Long value) {
            addCriterion("ut_ticket_id =", value, "utTicketId");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdNotEqualTo(Long value) {
            addCriterion("ut_ticket_id <>", value, "utTicketId");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdGreaterThan(Long value) {
            addCriterion("ut_ticket_id >", value, "utTicketId");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ut_ticket_id >=", value, "utTicketId");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdLessThan(Long value) {
            addCriterion("ut_ticket_id <", value, "utTicketId");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdLessThanOrEqualTo(Long value) {
            addCriterion("ut_ticket_id <=", value, "utTicketId");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdIn(List<Long> values) {
            addCriterion("ut_ticket_id in", values, "utTicketId");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdNotIn(List<Long> values) {
            addCriterion("ut_ticket_id not in", values, "utTicketId");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdBetween(Long value1, Long value2) {
            addCriterion("ut_ticket_id between", value1, value2, "utTicketId");
            return (Criteria) this;
        }

        public Criteria andUtTicketIdNotBetween(Long value1, Long value2) {
            addCriterion("ut_ticket_id not between", value1, value2, "utTicketId");
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