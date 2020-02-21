package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 彩票 LotteryExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-21 10:44:42
 */
public class LotteryExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryExample() {
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
        
			
        public Criteria andEndFlagIsNull() {
            addCriterion("end_flag is null");
            return (Criteria) this;
        }

        public Criteria andEndFlagIsNotNull() {
            addCriterion("end_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEndFlagEqualTo(String value) {
            addCriterion("end_flag =", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagNotEqualTo(String value) {
            addCriterion("end_flag <>", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagGreaterThan(String value) {
            addCriterion("end_flag >", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagGreaterThanOrEqualTo(String value) {
            addCriterion("end_flag >=", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagLessThan(String value) {
            addCriterion("end_flag <", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagLessThanOrEqualTo(String value) {
            addCriterion("end_flag <=", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagLike(String value) {
            addCriterion("end_flag like", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagNotLike(String value) {
            addCriterion("end_flag not like", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagIn(List<String> values) {
            addCriterion("end_flag in", values, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagNotIn(List<String> values) {
            addCriterion("end_flag not in", values, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagBetween(String value1, String value2) {
            addCriterion("end_flag between", value1, value2, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagNotBetween(String value1, String value2) {
            addCriterion("end_flag not between", value1, value2, "endFlag");
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
        
			
        public Criteria andSColorIsNull() {
            addCriterion("s_color is null");
            return (Criteria) this;
        }

        public Criteria andSColorIsNotNull() {
            addCriterion("s_color is not null");
            return (Criteria) this;
        }

        public Criteria andSColorEqualTo(String value) {
            addCriterion("s_color =", value, "sColor");
            return (Criteria) this;
        }

        public Criteria andSColorNotEqualTo(String value) {
            addCriterion("s_color <>", value, "sColor");
            return (Criteria) this;
        }

        public Criteria andSColorGreaterThan(String value) {
            addCriterion("s_color >", value, "sColor");
            return (Criteria) this;
        }

        public Criteria andSColorGreaterThanOrEqualTo(String value) {
            addCriterion("s_color >=", value, "sColor");
            return (Criteria) this;
        }

        public Criteria andSColorLessThan(String value) {
            addCriterion("s_color <", value, "sColor");
            return (Criteria) this;
        }

        public Criteria andSColorLessThanOrEqualTo(String value) {
            addCriterion("s_color <=", value, "sColor");
            return (Criteria) this;
        }

        public Criteria andSColorLike(String value) {
            addCriterion("s_color like", value, "sColor");
            return (Criteria) this;
        }

        public Criteria andSColorNotLike(String value) {
            addCriterion("s_color not like", value, "sColor");
            return (Criteria) this;
        }

        public Criteria andSColorIn(List<String> values) {
            addCriterion("s_color in", values, "sColor");
            return (Criteria) this;
        }

        public Criteria andSColorNotIn(List<String> values) {
            addCriterion("s_color not in", values, "sColor");
            return (Criteria) this;
        }

        public Criteria andSColorBetween(String value1, String value2) {
            addCriterion("s_color between", value1, value2, "sColor");
            return (Criteria) this;
        }

        public Criteria andSColorNotBetween(String value1, String value2) {
            addCriterion("s_color not between", value1, value2, "sColor");
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
        
			
        public Criteria andSHeadIsNull() {
            addCriterion("s_head is null");
            return (Criteria) this;
        }

        public Criteria andSHeadIsNotNull() {
            addCriterion("s_head is not null");
            return (Criteria) this;
        }

        public Criteria andSHeadEqualTo(String value) {
            addCriterion("s_head =", value, "sHead");
            return (Criteria) this;
        }

        public Criteria andSHeadNotEqualTo(String value) {
            addCriterion("s_head <>", value, "sHead");
            return (Criteria) this;
        }

        public Criteria andSHeadGreaterThan(String value) {
            addCriterion("s_head >", value, "sHead");
            return (Criteria) this;
        }

        public Criteria andSHeadGreaterThanOrEqualTo(String value) {
            addCriterion("s_head >=", value, "sHead");
            return (Criteria) this;
        }

        public Criteria andSHeadLessThan(String value) {
            addCriterion("s_head <", value, "sHead");
            return (Criteria) this;
        }

        public Criteria andSHeadLessThanOrEqualTo(String value) {
            addCriterion("s_head <=", value, "sHead");
            return (Criteria) this;
        }

        public Criteria andSHeadLike(String value) {
            addCriterion("s_head like", value, "sHead");
            return (Criteria) this;
        }

        public Criteria andSHeadNotLike(String value) {
            addCriterion("s_head not like", value, "sHead");
            return (Criteria) this;
        }

        public Criteria andSHeadIn(List<String> values) {
            addCriterion("s_head in", values, "sHead");
            return (Criteria) this;
        }

        public Criteria andSHeadNotIn(List<String> values) {
            addCriterion("s_head not in", values, "sHead");
            return (Criteria) this;
        }

        public Criteria andSHeadBetween(String value1, String value2) {
            addCriterion("s_head between", value1, value2, "sHead");
            return (Criteria) this;
        }

        public Criteria andSHeadNotBetween(String value1, String value2) {
            addCriterion("s_head not between", value1, value2, "sHead");
            return (Criteria) this;
        }
        
			
        public Criteria andSDanShuangIsNull() {
            addCriterion("s_dan_shuang is null");
            return (Criteria) this;
        }

        public Criteria andSDanShuangIsNotNull() {
            addCriterion("s_dan_shuang is not null");
            return (Criteria) this;
        }

        public Criteria andSDanShuangEqualTo(String value) {
            addCriterion("s_dan_shuang =", value, "sDanShuang");
            return (Criteria) this;
        }

        public Criteria andSDanShuangNotEqualTo(String value) {
            addCriterion("s_dan_shuang <>", value, "sDanShuang");
            return (Criteria) this;
        }

        public Criteria andSDanShuangGreaterThan(String value) {
            addCriterion("s_dan_shuang >", value, "sDanShuang");
            return (Criteria) this;
        }

        public Criteria andSDanShuangGreaterThanOrEqualTo(String value) {
            addCriterion("s_dan_shuang >=", value, "sDanShuang");
            return (Criteria) this;
        }

        public Criteria andSDanShuangLessThan(String value) {
            addCriterion("s_dan_shuang <", value, "sDanShuang");
            return (Criteria) this;
        }

        public Criteria andSDanShuangLessThanOrEqualTo(String value) {
            addCriterion("s_dan_shuang <=", value, "sDanShuang");
            return (Criteria) this;
        }

        public Criteria andSDanShuangLike(String value) {
            addCriterion("s_dan_shuang like", value, "sDanShuang");
            return (Criteria) this;
        }

        public Criteria andSDanShuangNotLike(String value) {
            addCriterion("s_dan_shuang not like", value, "sDanShuang");
            return (Criteria) this;
        }

        public Criteria andSDanShuangIn(List<String> values) {
            addCriterion("s_dan_shuang in", values, "sDanShuang");
            return (Criteria) this;
        }

        public Criteria andSDanShuangNotIn(List<String> values) {
            addCriterion("s_dan_shuang not in", values, "sDanShuang");
            return (Criteria) this;
        }

        public Criteria andSDanShuangBetween(String value1, String value2) {
            addCriterion("s_dan_shuang between", value1, value2, "sDanShuang");
            return (Criteria) this;
        }

        public Criteria andSDanShuangNotBetween(String value1, String value2) {
            addCriterion("s_dan_shuang not between", value1, value2, "sDanShuang");
            return (Criteria) this;
        }
        
			
        public Criteria andSTailIsNull() {
            addCriterion("s_tail is null");
            return (Criteria) this;
        }

        public Criteria andSTailIsNotNull() {
            addCriterion("s_tail is not null");
            return (Criteria) this;
        }

        public Criteria andSTailEqualTo(String value) {
            addCriterion("s_tail =", value, "sTail");
            return (Criteria) this;
        }

        public Criteria andSTailNotEqualTo(String value) {
            addCriterion("s_tail <>", value, "sTail");
            return (Criteria) this;
        }

        public Criteria andSTailGreaterThan(String value) {
            addCriterion("s_tail >", value, "sTail");
            return (Criteria) this;
        }

        public Criteria andSTailGreaterThanOrEqualTo(String value) {
            addCriterion("s_tail >=", value, "sTail");
            return (Criteria) this;
        }

        public Criteria andSTailLessThan(String value) {
            addCriterion("s_tail <", value, "sTail");
            return (Criteria) this;
        }

        public Criteria andSTailLessThanOrEqualTo(String value) {
            addCriterion("s_tail <=", value, "sTail");
            return (Criteria) this;
        }

        public Criteria andSTailLike(String value) {
            addCriterion("s_tail like", value, "sTail");
            return (Criteria) this;
        }

        public Criteria andSTailNotLike(String value) {
            addCriterion("s_tail not like", value, "sTail");
            return (Criteria) this;
        }

        public Criteria andSTailIn(List<String> values) {
            addCriterion("s_tail in", values, "sTail");
            return (Criteria) this;
        }

        public Criteria andSTailNotIn(List<String> values) {
            addCriterion("s_tail not in", values, "sTail");
            return (Criteria) this;
        }

        public Criteria andSTailBetween(String value1, String value2) {
            addCriterion("s_tail between", value1, value2, "sTail");
            return (Criteria) this;
        }

        public Criteria andSTailNotBetween(String value1, String value2) {
            addCriterion("s_tail not between", value1, value2, "sTail");
            return (Criteria) this;
        }
        
			
        public Criteria andSHeIsNull() {
            addCriterion("s_he is null");
            return (Criteria) this;
        }

        public Criteria andSHeIsNotNull() {
            addCriterion("s_he is not null");
            return (Criteria) this;
        }

        public Criteria andSHeEqualTo(String value) {
            addCriterion("s_he =", value, "sHe");
            return (Criteria) this;
        }

        public Criteria andSHeNotEqualTo(String value) {
            addCriterion("s_he <>", value, "sHe");
            return (Criteria) this;
        }

        public Criteria andSHeGreaterThan(String value) {
            addCriterion("s_he >", value, "sHe");
            return (Criteria) this;
        }

        public Criteria andSHeGreaterThanOrEqualTo(String value) {
            addCriterion("s_he >=", value, "sHe");
            return (Criteria) this;
        }

        public Criteria andSHeLessThan(String value) {
            addCriterion("s_he <", value, "sHe");
            return (Criteria) this;
        }

        public Criteria andSHeLessThanOrEqualTo(String value) {
            addCriterion("s_he <=", value, "sHe");
            return (Criteria) this;
        }

        public Criteria andSHeLike(String value) {
            addCriterion("s_he like", value, "sHe");
            return (Criteria) this;
        }

        public Criteria andSHeNotLike(String value) {
            addCriterion("s_he not like", value, "sHe");
            return (Criteria) this;
        }

        public Criteria andSHeIn(List<String> values) {
            addCriterion("s_he in", values, "sHe");
            return (Criteria) this;
        }

        public Criteria andSHeNotIn(List<String> values) {
            addCriterion("s_he not in", values, "sHe");
            return (Criteria) this;
        }

        public Criteria andSHeBetween(String value1, String value2) {
            addCriterion("s_he between", value1, value2, "sHe");
            return (Criteria) this;
        }

        public Criteria andSHeNotBetween(String value1, String value2) {
            addCriterion("s_he not between", value1, value2, "sHe");
            return (Criteria) this;
        }
        
			
        public Criteria andAllSumIsNull() {
            addCriterion("all_sum is null");
            return (Criteria) this;
        }

        public Criteria andAllSumIsNotNull() {
            addCriterion("all_sum is not null");
            return (Criteria) this;
        }

        public Criteria andAllSumEqualTo(String value) {
            addCriterion("all_sum =", value, "allSum");
            return (Criteria) this;
        }

        public Criteria andAllSumNotEqualTo(String value) {
            addCriterion("all_sum <>", value, "allSum");
            return (Criteria) this;
        }

        public Criteria andAllSumGreaterThan(String value) {
            addCriterion("all_sum >", value, "allSum");
            return (Criteria) this;
        }

        public Criteria andAllSumGreaterThanOrEqualTo(String value) {
            addCriterion("all_sum >=", value, "allSum");
            return (Criteria) this;
        }

        public Criteria andAllSumLessThan(String value) {
            addCriterion("all_sum <", value, "allSum");
            return (Criteria) this;
        }

        public Criteria andAllSumLessThanOrEqualTo(String value) {
            addCriterion("all_sum <=", value, "allSum");
            return (Criteria) this;
        }

        public Criteria andAllSumLike(String value) {
            addCriterion("all_sum like", value, "allSum");
            return (Criteria) this;
        }

        public Criteria andAllSumNotLike(String value) {
            addCriterion("all_sum not like", value, "allSum");
            return (Criteria) this;
        }

        public Criteria andAllSumIn(List<String> values) {
            addCriterion("all_sum in", values, "allSum");
            return (Criteria) this;
        }

        public Criteria andAllSumNotIn(List<String> values) {
            addCriterion("all_sum not in", values, "allSum");
            return (Criteria) this;
        }

        public Criteria andAllSumBetween(String value1, String value2) {
            addCriterion("all_sum between", value1, value2, "allSum");
            return (Criteria) this;
        }

        public Criteria andAllSumNotBetween(String value1, String value2) {
            addCriterion("all_sum not between", value1, value2, "allSum");
            return (Criteria) this;
        }
        
			
        public Criteria andBeginTmIsNull() {
            addCriterion("begin_tm is null");
            return (Criteria) this;
        }

        public Criteria andBeginTmIsNotNull() {
            addCriterion("begin_tm is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTmEqualTo(Date value) {
            addCriterion("begin_tm =", value, "beginTm");
            return (Criteria) this;
        }

        public Criteria andBeginTmNotEqualTo(Date value) {
            addCriterion("begin_tm <>", value, "beginTm");
            return (Criteria) this;
        }

        public Criteria andBeginTmGreaterThan(Date value) {
            addCriterion("begin_tm >", value, "beginTm");
            return (Criteria) this;
        }

        public Criteria andBeginTmGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_tm >=", value, "beginTm");
            return (Criteria) this;
        }

        public Criteria andBeginTmLessThan(Date value) {
            addCriterion("begin_tm <", value, "beginTm");
            return (Criteria) this;
        }

        public Criteria andBeginTmLessThanOrEqualTo(Date value) {
            addCriterion("begin_tm <=", value, "beginTm");
            return (Criteria) this;
        }

        public Criteria andBeginTmLike(Date value) {
            addCriterion("begin_tm like", value, "beginTm");
            return (Criteria) this;
        }

        public Criteria andBeginTmNotLike(Date value) {
            addCriterion("begin_tm not like", value, "beginTm");
            return (Criteria) this;
        }

        public Criteria andBeginTmIn(List<Date> values) {
            addCriterion("begin_tm in", values, "beginTm");
            return (Criteria) this;
        }

        public Criteria andBeginTmNotIn(List<Date> values) {
            addCriterion("begin_tm not in", values, "beginTm");
            return (Criteria) this;
        }

        public Criteria andBeginTmBetween(Date value1, Date value2) {
            addCriterion("begin_tm between", value1, value2, "beginTm");
            return (Criteria) this;
        }

        public Criteria andBeginTmNotBetween(Date value1, Date value2) {
            addCriterion("begin_tm not between", value1, value2, "beginTm");
            return (Criteria) this;
        }
        
			
        public Criteria andEndTmIsNull() {
            addCriterion("end_tm is null");
            return (Criteria) this;
        }

        public Criteria andEndTmIsNotNull() {
            addCriterion("end_tm is not null");
            return (Criteria) this;
        }

        public Criteria andEndTmEqualTo(Date value) {
            addCriterion("end_tm =", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmNotEqualTo(Date value) {
            addCriterion("end_tm <>", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmGreaterThan(Date value) {
            addCriterion("end_tm >", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmGreaterThanOrEqualTo(Date value) {
            addCriterion("end_tm >=", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmLessThan(Date value) {
            addCriterion("end_tm <", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmLessThanOrEqualTo(Date value) {
            addCriterion("end_tm <=", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmLike(Date value) {
            addCriterion("end_tm like", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmNotLike(Date value) {
            addCriterion("end_tm not like", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmIn(List<Date> values) {
            addCriterion("end_tm in", values, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmNotIn(List<Date> values) {
            addCriterion("end_tm not in", values, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmBetween(Date value1, Date value2) {
            addCriterion("end_tm between", value1, value2, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmNotBetween(Date value1, Date value2) {
            addCriterion("end_tm not between", value1, value2, "endTm");
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