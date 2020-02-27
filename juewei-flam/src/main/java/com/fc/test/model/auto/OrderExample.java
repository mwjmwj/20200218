package com.fc.test.model.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  OrderExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:03
 */
public class OrderExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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
        
			
        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(BigDecimal value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(BigDecimal value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }
        
			
        public Criteria andWechatIdIsNull() {
            addCriterion("wechat_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatIdIsNotNull() {
            addCriterion("wechat_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatIdEqualTo(String value) {
            addCriterion("wechat_id =", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotEqualTo(String value) {
            addCriterion("wechat_id <>", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThan(String value) {
            addCriterion("wechat_id >", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_id >=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThan(String value) {
            addCriterion("wechat_id <", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_id <=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLike(String value) {
            addCriterion("wechat_id like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotLike(String value) {
            addCriterion("wechat_id not like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdIn(List<String> values) {
            addCriterion("wechat_id in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotIn(List<String> values) {
            addCriterion("wechat_id not in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdBetween(String value1, String value2) {
            addCriterion("wechat_id between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotBetween(String value1, String value2) {
            addCriterion("wechat_id not between", value1, value2, "wechatId");
            return (Criteria) this;
        }
        
			
        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }
        
			
        public Criteria andWechatOrderNoIsNull() {
            addCriterion("wechat_order_no is null");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoIsNotNull() {
            addCriterion("wechat_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoEqualTo(String value) {
            addCriterion("wechat_order_no =", value, "wechatOrderNo");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoNotEqualTo(String value) {
            addCriterion("wechat_order_no <>", value, "wechatOrderNo");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoGreaterThan(String value) {
            addCriterion("wechat_order_no >", value, "wechatOrderNo");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_order_no >=", value, "wechatOrderNo");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoLessThan(String value) {
            addCriterion("wechat_order_no <", value, "wechatOrderNo");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoLessThanOrEqualTo(String value) {
            addCriterion("wechat_order_no <=", value, "wechatOrderNo");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoLike(String value) {
            addCriterion("wechat_order_no like", value, "wechatOrderNo");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoNotLike(String value) {
            addCriterion("wechat_order_no not like", value, "wechatOrderNo");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoIn(List<String> values) {
            addCriterion("wechat_order_no in", values, "wechatOrderNo");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoNotIn(List<String> values) {
            addCriterion("wechat_order_no not in", values, "wechatOrderNo");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoBetween(String value1, String value2) {
            addCriterion("wechat_order_no between", value1, value2, "wechatOrderNo");
            return (Criteria) this;
        }

        public Criteria andWechatOrderNoNotBetween(String value1, String value2) {
            addCriterion("wechat_order_no not between", value1, value2, "wechatOrderNo");
            return (Criteria) this;
        }
        
			
        public Criteria andOStatusIsNull() {
            addCriterion("o_status is null");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNotNull() {
            addCriterion("o_status is not null");
            return (Criteria) this;
        }

        public Criteria andOStatusEqualTo(Integer value) {
            addCriterion("o_status =", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotEqualTo(Integer value) {
            addCriterion("o_status <>", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThan(Integer value) {
            addCriterion("o_status >", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_status >=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThan(Integer value) {
            addCriterion("o_status <", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThanOrEqualTo(Integer value) {
            addCriterion("o_status <=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLike(Integer value) {
            addCriterion("o_status like", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotLike(Integer value) {
            addCriterion("o_status not like", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusIn(List<Integer> values) {
            addCriterion("o_status in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotIn(List<Integer> values) {
            addCriterion("o_status not in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusBetween(Integer value1, Integer value2) {
            addCriterion("o_status between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("o_status not between", value1, value2, "oStatus");
            return (Criteria) this;
        }
        
			
        public Criteria andWechatNameIsNull() {
            addCriterion("wechat_name is null");
            return (Criteria) this;
        }

        public Criteria andWechatNameIsNotNull() {
            addCriterion("wechat_name is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNameEqualTo(String value) {
            addCriterion("wechat_name =", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotEqualTo(String value) {
            addCriterion("wechat_name <>", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThan(String value) {
            addCriterion("wechat_name >", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_name >=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThan(String value) {
            addCriterion("wechat_name <", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThanOrEqualTo(String value) {
            addCriterion("wechat_name <=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLike(String value) {
            addCriterion("wechat_name like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotLike(String value) {
            addCriterion("wechat_name not like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameIn(List<String> values) {
            addCriterion("wechat_name in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotIn(List<String> values) {
            addCriterion("wechat_name not in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameBetween(String value1, String value2) {
            addCriterion("wechat_name between", value1, value2, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotBetween(String value1, String value2) {
            addCriterion("wechat_name not between", value1, value2, "wechatName");
            return (Criteria) this;
        }
        
			
        public Criteria andPlaceOrderTmIsNull() {
            addCriterion("place_order_tm is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmIsNotNull() {
            addCriterion("place_order_tm is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmEqualTo(Date value) {
            addCriterion("place_order_tm =", value, "placeOrderTm");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmNotEqualTo(Date value) {
            addCriterion("place_order_tm <>", value, "placeOrderTm");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmGreaterThan(Date value) {
            addCriterion("place_order_tm >", value, "placeOrderTm");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmGreaterThanOrEqualTo(Date value) {
            addCriterion("place_order_tm >=", value, "placeOrderTm");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmLessThan(Date value) {
            addCriterion("place_order_tm <", value, "placeOrderTm");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmLessThanOrEqualTo(Date value) {
            addCriterion("place_order_tm <=", value, "placeOrderTm");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmLike(Date value) {
            addCriterion("place_order_tm like", value, "placeOrderTm");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmNotLike(Date value) {
            addCriterion("place_order_tm not like", value, "placeOrderTm");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmIn(List<Date> values) {
            addCriterion("place_order_tm in", values, "placeOrderTm");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmNotIn(List<Date> values) {
            addCriterion("place_order_tm not in", values, "placeOrderTm");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmBetween(Date value1, Date value2) {
            addCriterion("place_order_tm between", value1, value2, "placeOrderTm");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderTmNotBetween(Date value1, Date value2) {
            addCriterion("place_order_tm not between", value1, value2, "placeOrderTm");
            return (Criteria) this;
        }
        
			
        public Criteria andExpectSTmIsNull() {
            addCriterion("expect_s_tm is null");
            return (Criteria) this;
        }

        public Criteria andExpectSTmIsNotNull() {
            addCriterion("expect_s_tm is not null");
            return (Criteria) this;
        }

        public Criteria andExpectSTmEqualTo(Date value) {
            addCriterion("expect_s_tm =", value, "expectSTm");
            return (Criteria) this;
        }

        public Criteria andExpectSTmNotEqualTo(Date value) {
            addCriterion("expect_s_tm <>", value, "expectSTm");
            return (Criteria) this;
        }

        public Criteria andExpectSTmGreaterThan(Date value) {
            addCriterion("expect_s_tm >", value, "expectSTm");
            return (Criteria) this;
        }

        public Criteria andExpectSTmGreaterThanOrEqualTo(Date value) {
            addCriterion("expect_s_tm >=", value, "expectSTm");
            return (Criteria) this;
        }

        public Criteria andExpectSTmLessThan(Date value) {
            addCriterion("expect_s_tm <", value, "expectSTm");
            return (Criteria) this;
        }

        public Criteria andExpectSTmLessThanOrEqualTo(Date value) {
            addCriterion("expect_s_tm <=", value, "expectSTm");
            return (Criteria) this;
        }

        public Criteria andExpectSTmLike(Date value) {
            addCriterion("expect_s_tm like", value, "expectSTm");
            return (Criteria) this;
        }

        public Criteria andExpectSTmNotLike(Date value) {
            addCriterion("expect_s_tm not like", value, "expectSTm");
            return (Criteria) this;
        }

        public Criteria andExpectSTmIn(List<Date> values) {
            addCriterion("expect_s_tm in", values, "expectSTm");
            return (Criteria) this;
        }

        public Criteria andExpectSTmNotIn(List<Date> values) {
            addCriterion("expect_s_tm not in", values, "expectSTm");
            return (Criteria) this;
        }

        public Criteria andExpectSTmBetween(Date value1, Date value2) {
            addCriterion("expect_s_tm between", value1, value2, "expectSTm");
            return (Criteria) this;
        }

        public Criteria andExpectSTmNotBetween(Date value1, Date value2) {
            addCriterion("expect_s_tm not between", value1, value2, "expectSTm");
            return (Criteria) this;
        }
        
			
        public Criteria andSTmIsNull() {
            addCriterion("s_tm is null");
            return (Criteria) this;
        }

        public Criteria andSTmIsNotNull() {
            addCriterion("s_tm is not null");
            return (Criteria) this;
        }

        public Criteria andSTmEqualTo(Date value) {
            addCriterion("s_tm =", value, "sTm");
            return (Criteria) this;
        }

        public Criteria andSTmNotEqualTo(Date value) {
            addCriterion("s_tm <>", value, "sTm");
            return (Criteria) this;
        }

        public Criteria andSTmGreaterThan(Date value) {
            addCriterion("s_tm >", value, "sTm");
            return (Criteria) this;
        }

        public Criteria andSTmGreaterThanOrEqualTo(Date value) {
            addCriterion("s_tm >=", value, "sTm");
            return (Criteria) this;
        }

        public Criteria andSTmLessThan(Date value) {
            addCriterion("s_tm <", value, "sTm");
            return (Criteria) this;
        }

        public Criteria andSTmLessThanOrEqualTo(Date value) {
            addCriterion("s_tm <=", value, "sTm");
            return (Criteria) this;
        }

        public Criteria andSTmLike(Date value) {
            addCriterion("s_tm like", value, "sTm");
            return (Criteria) this;
        }

        public Criteria andSTmNotLike(Date value) {
            addCriterion("s_tm not like", value, "sTm");
            return (Criteria) this;
        }

        public Criteria andSTmIn(List<Date> values) {
            addCriterion("s_tm in", values, "sTm");
            return (Criteria) this;
        }

        public Criteria andSTmNotIn(List<Date> values) {
            addCriterion("s_tm not in", values, "sTm");
            return (Criteria) this;
        }

        public Criteria andSTmBetween(Date value1, Date value2) {
            addCriterion("s_tm between", value1, value2, "sTm");
            return (Criteria) this;
        }

        public Criteria andSTmNotBetween(Date value1, Date value2) {
            addCriterion("s_tm not between", value1, value2, "sTm");
            return (Criteria) this;
        }
        
			
        public Criteria andOverTmIsNull() {
            addCriterion("over_tm is null");
            return (Criteria) this;
        }

        public Criteria andOverTmIsNotNull() {
            addCriterion("over_tm is not null");
            return (Criteria) this;
        }

        public Criteria andOverTmEqualTo(Date value) {
            addCriterion("over_tm =", value, "overTm");
            return (Criteria) this;
        }

        public Criteria andOverTmNotEqualTo(Date value) {
            addCriterion("over_tm <>", value, "overTm");
            return (Criteria) this;
        }

        public Criteria andOverTmGreaterThan(Date value) {
            addCriterion("over_tm >", value, "overTm");
            return (Criteria) this;
        }

        public Criteria andOverTmGreaterThanOrEqualTo(Date value) {
            addCriterion("over_tm >=", value, "overTm");
            return (Criteria) this;
        }

        public Criteria andOverTmLessThan(Date value) {
            addCriterion("over_tm <", value, "overTm");
            return (Criteria) this;
        }

        public Criteria andOverTmLessThanOrEqualTo(Date value) {
            addCriterion("over_tm <=", value, "overTm");
            return (Criteria) this;
        }

        public Criteria andOverTmLike(Date value) {
            addCriterion("over_tm like", value, "overTm");
            return (Criteria) this;
        }

        public Criteria andOverTmNotLike(Date value) {
            addCriterion("over_tm not like", value, "overTm");
            return (Criteria) this;
        }

        public Criteria andOverTmIn(List<Date> values) {
            addCriterion("over_tm in", values, "overTm");
            return (Criteria) this;
        }

        public Criteria andOverTmNotIn(List<Date> values) {
            addCriterion("over_tm not in", values, "overTm");
            return (Criteria) this;
        }

        public Criteria andOverTmBetween(Date value1, Date value2) {
            addCriterion("over_tm between", value1, value2, "overTm");
            return (Criteria) this;
        }

        public Criteria andOverTmNotBetween(Date value1, Date value2) {
            addCriterion("over_tm not between", value1, value2, "overTm");
            return (Criteria) this;
        }
        
			
        public Criteria andTmFlagIsNull() {
            addCriterion("tm_flag is null");
            return (Criteria) this;
        }

        public Criteria andTmFlagIsNotNull() {
            addCriterion("tm_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTmFlagEqualTo(Integer value) {
            addCriterion("tm_flag =", value, "tmFlag");
            return (Criteria) this;
        }

        public Criteria andTmFlagNotEqualTo(Integer value) {
            addCriterion("tm_flag <>", value, "tmFlag");
            return (Criteria) this;
        }

        public Criteria andTmFlagGreaterThan(Integer value) {
            addCriterion("tm_flag >", value, "tmFlag");
            return (Criteria) this;
        }

        public Criteria andTmFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("tm_flag >=", value, "tmFlag");
            return (Criteria) this;
        }

        public Criteria andTmFlagLessThan(Integer value) {
            addCriterion("tm_flag <", value, "tmFlag");
            return (Criteria) this;
        }

        public Criteria andTmFlagLessThanOrEqualTo(Integer value) {
            addCriterion("tm_flag <=", value, "tmFlag");
            return (Criteria) this;
        }

        public Criteria andTmFlagLike(Integer value) {
            addCriterion("tm_flag like", value, "tmFlag");
            return (Criteria) this;
        }

        public Criteria andTmFlagNotLike(Integer value) {
            addCriterion("tm_flag not like", value, "tmFlag");
            return (Criteria) this;
        }

        public Criteria andTmFlagIn(List<Integer> values) {
            addCriterion("tm_flag in", values, "tmFlag");
            return (Criteria) this;
        }

        public Criteria andTmFlagNotIn(List<Integer> values) {
            addCriterion("tm_flag not in", values, "tmFlag");
            return (Criteria) this;
        }

        public Criteria andTmFlagBetween(Integer value1, Integer value2) {
            addCriterion("tm_flag between", value1, value2, "tmFlag");
            return (Criteria) this;
        }

        public Criteria andTmFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("tm_flag not between", value1, value2, "tmFlag");
            return (Criteria) this;
        }
        
			
        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }
        
			
        public Criteria andCTmIsNull() {
            addCriterion("c_tm is null");
            return (Criteria) this;
        }

        public Criteria andCTmIsNotNull() {
            addCriterion("c_tm is not null");
            return (Criteria) this;
        }

        public Criteria andCTmEqualTo(Date value) {
            addCriterion("c_tm =", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmNotEqualTo(Date value) {
            addCriterion("c_tm <>", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmGreaterThan(Date value) {
            addCriterion("c_tm >", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmGreaterThanOrEqualTo(Date value) {
            addCriterion("c_tm >=", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmLessThan(Date value) {
            addCriterion("c_tm <", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmLessThanOrEqualTo(Date value) {
            addCriterion("c_tm <=", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmLike(Date value) {
            addCriterion("c_tm like", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmNotLike(Date value) {
            addCriterion("c_tm not like", value, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmIn(List<Date> values) {
            addCriterion("c_tm in", values, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmNotIn(List<Date> values) {
            addCriterion("c_tm not in", values, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmBetween(Date value1, Date value2) {
            addCriterion("c_tm between", value1, value2, "cTm");
            return (Criteria) this;
        }

        public Criteria andCTmNotBetween(Date value1, Date value2) {
            addCriterion("c_tm not between", value1, value2, "cTm");
            return (Criteria) this;
        }
        
			
        public Criteria andUTmIsNull() {
            addCriterion("u_tm is null");
            return (Criteria) this;
        }

        public Criteria andUTmIsNotNull() {
            addCriterion("u_tm is not null");
            return (Criteria) this;
        }

        public Criteria andUTmEqualTo(Date value) {
            addCriterion("u_tm =", value, "uTm");
            return (Criteria) this;
        }

        public Criteria andUTmNotEqualTo(Date value) {
            addCriterion("u_tm <>", value, "uTm");
            return (Criteria) this;
        }

        public Criteria andUTmGreaterThan(Date value) {
            addCriterion("u_tm >", value, "uTm");
            return (Criteria) this;
        }

        public Criteria andUTmGreaterThanOrEqualTo(Date value) {
            addCriterion("u_tm >=", value, "uTm");
            return (Criteria) this;
        }

        public Criteria andUTmLessThan(Date value) {
            addCriterion("u_tm <", value, "uTm");
            return (Criteria) this;
        }

        public Criteria andUTmLessThanOrEqualTo(Date value) {
            addCriterion("u_tm <=", value, "uTm");
            return (Criteria) this;
        }

        public Criteria andUTmLike(Date value) {
            addCriterion("u_tm like", value, "uTm");
            return (Criteria) this;
        }

        public Criteria andUTmNotLike(Date value) {
            addCriterion("u_tm not like", value, "uTm");
            return (Criteria) this;
        }

        public Criteria andUTmIn(List<Date> values) {
            addCriterion("u_tm in", values, "uTm");
            return (Criteria) this;
        }

        public Criteria andUTmNotIn(List<Date> values) {
            addCriterion("u_tm not in", values, "uTm");
            return (Criteria) this;
        }

        public Criteria andUTmBetween(Date value1, Date value2) {
            addCriterion("u_tm between", value1, value2, "uTm");
            return (Criteria) this;
        }

        public Criteria andUTmNotBetween(Date value1, Date value2) {
            addCriterion("u_tm not between", value1, value2, "uTm");
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