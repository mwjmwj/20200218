package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  NumColorExample
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:23:57
 */
public class NumColorExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NumColorExample() {
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
        
			
        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }
        
			
        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }
        
			
        public Criteria andColorDescIsNull() {
            addCriterion("color_desc is null");
            return (Criteria) this;
        }

        public Criteria andColorDescIsNotNull() {
            addCriterion("color_desc is not null");
            return (Criteria) this;
        }

        public Criteria andColorDescEqualTo(String value) {
            addCriterion("color_desc =", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescNotEqualTo(String value) {
            addCriterion("color_desc <>", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescGreaterThan(String value) {
            addCriterion("color_desc >", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescGreaterThanOrEqualTo(String value) {
            addCriterion("color_desc >=", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescLessThan(String value) {
            addCriterion("color_desc <", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescLessThanOrEqualTo(String value) {
            addCriterion("color_desc <=", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescLike(String value) {
            addCriterion("color_desc like", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescNotLike(String value) {
            addCriterion("color_desc not like", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescIn(List<String> values) {
            addCriterion("color_desc in", values, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescNotIn(List<String> values) {
            addCriterion("color_desc not in", values, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescBetween(String value1, String value2) {
            addCriterion("color_desc between", value1, value2, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescNotBetween(String value1, String value2) {
            addCriterion("color_desc not between", value1, value2, "colorDesc");
            return (Criteria) this;
        }
        
			
        public Criteria andWuxingIsNull() {
            addCriterion("wuxing is null");
            return (Criteria) this;
        }

        public Criteria andWuxingIsNotNull() {
            addCriterion("wuxing is not null");
            return (Criteria) this;
        }

        public Criteria andWuxingEqualTo(String value) {
            addCriterion("wuxing =", value, "wuxing");
            return (Criteria) this;
        }

        public Criteria andWuxingNotEqualTo(String value) {
            addCriterion("wuxing <>", value, "wuxing");
            return (Criteria) this;
        }

        public Criteria andWuxingGreaterThan(String value) {
            addCriterion("wuxing >", value, "wuxing");
            return (Criteria) this;
        }

        public Criteria andWuxingGreaterThanOrEqualTo(String value) {
            addCriterion("wuxing >=", value, "wuxing");
            return (Criteria) this;
        }

        public Criteria andWuxingLessThan(String value) {
            addCriterion("wuxing <", value, "wuxing");
            return (Criteria) this;
        }

        public Criteria andWuxingLessThanOrEqualTo(String value) {
            addCriterion("wuxing <=", value, "wuxing");
            return (Criteria) this;
        }

        public Criteria andWuxingLike(String value) {
            addCriterion("wuxing like", value, "wuxing");
            return (Criteria) this;
        }

        public Criteria andWuxingNotLike(String value) {
            addCriterion("wuxing not like", value, "wuxing");
            return (Criteria) this;
        }

        public Criteria andWuxingIn(List<String> values) {
            addCriterion("wuxing in", values, "wuxing");
            return (Criteria) this;
        }

        public Criteria andWuxingNotIn(List<String> values) {
            addCriterion("wuxing not in", values, "wuxing");
            return (Criteria) this;
        }

        public Criteria andWuxingBetween(String value1, String value2) {
            addCriterion("wuxing between", value1, value2, "wuxing");
            return (Criteria) this;
        }

        public Criteria andWuxingNotBetween(String value1, String value2) {
            addCriterion("wuxing not between", value1, value2, "wuxing");
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