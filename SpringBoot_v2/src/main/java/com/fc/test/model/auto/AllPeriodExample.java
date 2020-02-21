package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  AllPeriodExample
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:23:00
 */
public class AllPeriodExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllPeriodExample() {
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
				
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(Long value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(Long value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        
			
        public Criteria andYangTmIsNull() {
            addCriterion("yang_tm is null");
            return (Criteria) this;
        }

        public Criteria andYangTmIsNotNull() {
            addCriterion("yang_tm is not null");
            return (Criteria) this;
        }

        public Criteria andYangTmEqualTo(String value) {
            addCriterion("yang_tm =", value, "yangTm");
            return (Criteria) this;
        }

        public Criteria andYangTmNotEqualTo(String value) {
            addCriterion("yang_tm <>", value, "yangTm");
            return (Criteria) this;
        }

        public Criteria andYangTmGreaterThan(String value) {
            addCriterion("yang_tm >", value, "yangTm");
            return (Criteria) this;
        }

        public Criteria andYangTmGreaterThanOrEqualTo(String value) {
            addCriterion("yang_tm >=", value, "yangTm");
            return (Criteria) this;
        }

        public Criteria andYangTmLessThan(String value) {
            addCriterion("yang_tm <", value, "yangTm");
            return (Criteria) this;
        }

        public Criteria andYangTmLessThanOrEqualTo(String value) {
            addCriterion("yang_tm <=", value, "yangTm");
            return (Criteria) this;
        }

        public Criteria andYangTmLike(String value) {
            addCriterion("yang_tm like", value, "yangTm");
            return (Criteria) this;
        }

        public Criteria andYangTmNotLike(String value) {
            addCriterion("yang_tm not like", value, "yangTm");
            return (Criteria) this;
        }

        public Criteria andYangTmIn(List<String> values) {
            addCriterion("yang_tm in", values, "yangTm");
            return (Criteria) this;
        }

        public Criteria andYangTmNotIn(List<String> values) {
            addCriterion("yang_tm not in", values, "yangTm");
            return (Criteria) this;
        }

        public Criteria andYangTmBetween(String value1, String value2) {
            addCriterion("yang_tm between", value1, value2, "yangTm");
            return (Criteria) this;
        }

        public Criteria andYangTmNotBetween(String value1, String value2) {
            addCriterion("yang_tm not between", value1, value2, "yangTm");
            return (Criteria) this;
        }
        
			
        public Criteria andYinTmIsNull() {
            addCriterion("yin_tm is null");
            return (Criteria) this;
        }

        public Criteria andYinTmIsNotNull() {
            addCriterion("yin_tm is not null");
            return (Criteria) this;
        }

        public Criteria andYinTmEqualTo(String value) {
            addCriterion("yin_tm =", value, "yinTm");
            return (Criteria) this;
        }

        public Criteria andYinTmNotEqualTo(String value) {
            addCriterion("yin_tm <>", value, "yinTm");
            return (Criteria) this;
        }

        public Criteria andYinTmGreaterThan(String value) {
            addCriterion("yin_tm >", value, "yinTm");
            return (Criteria) this;
        }

        public Criteria andYinTmGreaterThanOrEqualTo(String value) {
            addCriterion("yin_tm >=", value, "yinTm");
            return (Criteria) this;
        }

        public Criteria andYinTmLessThan(String value) {
            addCriterion("yin_tm <", value, "yinTm");
            return (Criteria) this;
        }

        public Criteria andYinTmLessThanOrEqualTo(String value) {
            addCriterion("yin_tm <=", value, "yinTm");
            return (Criteria) this;
        }

        public Criteria andYinTmLike(String value) {
            addCriterion("yin_tm like", value, "yinTm");
            return (Criteria) this;
        }

        public Criteria andYinTmNotLike(String value) {
            addCriterion("yin_tm not like", value, "yinTm");
            return (Criteria) this;
        }

        public Criteria andYinTmIn(List<String> values) {
            addCriterion("yin_tm in", values, "yinTm");
            return (Criteria) this;
        }

        public Criteria andYinTmNotIn(List<String> values) {
            addCriterion("yin_tm not in", values, "yinTm");
            return (Criteria) this;
        }

        public Criteria andYinTmBetween(String value1, String value2) {
            addCriterion("yin_tm between", value1, value2, "yinTm");
            return (Criteria) this;
        }

        public Criteria andYinTmNotBetween(String value1, String value2) {
            addCriterion("yin_tm not between", value1, value2, "yinTm");
            return (Criteria) this;
        }
        
			
        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(String value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(String value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(String value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(String value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(String value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLike(String value) {
            addCriterion("period like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotLike(String value) {
            addCriterion("period not like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<String> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<String> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(String value1, String value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(String value1, String value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }
        
			
        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
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