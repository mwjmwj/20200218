package com.cp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseAnimalExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    public BaseAnimalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameDescIsNull() {
            addCriterion("name_desc is null");
            return (Criteria) this;
        }

        public Criteria andNameDescIsNotNull() {
            addCriterion("name_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNameDescEqualTo(String value) {
            addCriterion("name_desc =", value, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andNameDescNotEqualTo(String value) {
            addCriterion("name_desc <>", value, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andNameDescGreaterThan(String value) {
            addCriterion("name_desc >", value, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andNameDescGreaterThanOrEqualTo(String value) {
            addCriterion("name_desc >=", value, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andNameDescLessThan(String value) {
            addCriterion("name_desc <", value, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andNameDescLessThanOrEqualTo(String value) {
            addCriterion("name_desc <=", value, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andNameDescLike(String value) {
            addCriterion("name_desc like", value, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andNameDescNotLike(String value) {
            addCriterion("name_desc not like", value, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andNameDescIn(List<String> values) {
            addCriterion("name_desc in", values, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andNameDescNotIn(List<String> values) {
            addCriterion("name_desc not in", values, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andNameDescBetween(String value1, String value2) {
            addCriterion("name_desc between", value1, value2, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andNameDescNotBetween(String value1, String value2) {
            addCriterion("name_desc not between", value1, value2, "nameDesc");
            return (Criteria) this;
        }

        public Criteria andJiayeIsNull() {
            addCriterion("jiaye is null");
            return (Criteria) this;
        }

        public Criteria andJiayeIsNotNull() {
            addCriterion("jiaye is not null");
            return (Criteria) this;
        }

        public Criteria andJiayeEqualTo(String value) {
            addCriterion("jiaye =", value, "jiaye");
            return (Criteria) this;
        }

        public Criteria andJiayeNotEqualTo(String value) {
            addCriterion("jiaye <>", value, "jiaye");
            return (Criteria) this;
        }

        public Criteria andJiayeGreaterThan(String value) {
            addCriterion("jiaye >", value, "jiaye");
            return (Criteria) this;
        }

        public Criteria andJiayeGreaterThanOrEqualTo(String value) {
            addCriterion("jiaye >=", value, "jiaye");
            return (Criteria) this;
        }

        public Criteria andJiayeLessThan(String value) {
            addCriterion("jiaye <", value, "jiaye");
            return (Criteria) this;
        }

        public Criteria andJiayeLessThanOrEqualTo(String value) {
            addCriterion("jiaye <=", value, "jiaye");
            return (Criteria) this;
        }

        public Criteria andJiayeLike(String value) {
            addCriterion("jiaye like", value, "jiaye");
            return (Criteria) this;
        }

        public Criteria andJiayeNotLike(String value) {
            addCriterion("jiaye not like", value, "jiaye");
            return (Criteria) this;
        }

        public Criteria andJiayeIn(List<String> values) {
            addCriterion("jiaye in", values, "jiaye");
            return (Criteria) this;
        }

        public Criteria andJiayeNotIn(List<String> values) {
            addCriterion("jiaye not in", values, "jiaye");
            return (Criteria) this;
        }

        public Criteria andJiayeBetween(String value1, String value2) {
            addCriterion("jiaye between", value1, value2, "jiaye");
            return (Criteria) this;
        }

        public Criteria andJiayeNotBetween(String value1, String value2) {
            addCriterion("jiaye not between", value1, value2, "jiaye");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(String value) {
            addCriterion("order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(String value) {
            addCriterion("order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(String value) {
            addCriterion("order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(String value) {
            addCriterion("order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(String value) {
            addCriterion("order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(String value) {
            addCriterion("order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLike(String value) {
            addCriterion("order like", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotLike(String value) {
            addCriterion("order not like", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<String> values) {
            addCriterion("order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<String> values) {
            addCriterion("order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(String value1, String value2) {
            addCriterion("order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(String value1, String value2) {
            addCriterion("order not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andCreateTmIsNull() {
            addCriterion("create_tm is null");
            return (Criteria) this;
        }

        public Criteria andCreateTmIsNotNull() {
            addCriterion("create_tm is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTmEqualTo(Date value) {
            addCriterion("create_tm =", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmNotEqualTo(Date value) {
            addCriterion("create_tm <>", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmGreaterThan(Date value) {
            addCriterion("create_tm >", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmGreaterThanOrEqualTo(Date value) {
            addCriterion("create_tm >=", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmLessThan(Date value) {
            addCriterion("create_tm <", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmLessThanOrEqualTo(Date value) {
            addCriterion("create_tm <=", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmIn(List<Date> values) {
            addCriterion("create_tm in", values, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmNotIn(List<Date> values) {
            addCriterion("create_tm not in", values, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmBetween(Date value1, Date value2) {
            addCriterion("create_tm between", value1, value2, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmNotBetween(Date value1, Date value2) {
            addCriterion("create_tm not between", value1, value2, "createTm");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_base_animal
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
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