package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 首页公告表 IndexNoticeExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-22 13:01:18
 */
public class IndexNoticeExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexNoticeExample() {
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
        
			
        public Criteria andCompanyNoticeIsNull() {
            addCriterion("company_notice is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeIsNotNull() {
            addCriterion("company_notice is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeEqualTo(String value) {
            addCriterion("company_notice =", value, "companyNotice");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeNotEqualTo(String value) {
            addCriterion("company_notice <>", value, "companyNotice");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeGreaterThan(String value) {
            addCriterion("company_notice >", value, "companyNotice");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("company_notice >=", value, "companyNotice");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeLessThan(String value) {
            addCriterion("company_notice <", value, "companyNotice");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeLessThanOrEqualTo(String value) {
            addCriterion("company_notice <=", value, "companyNotice");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeLike(String value) {
            addCriterion("company_notice like", value, "companyNotice");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeNotLike(String value) {
            addCriterion("company_notice not like", value, "companyNotice");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeIn(List<String> values) {
            addCriterion("company_notice in", values, "companyNotice");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeNotIn(List<String> values) {
            addCriterion("company_notice not in", values, "companyNotice");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeBetween(String value1, String value2) {
            addCriterion("company_notice between", value1, value2, "companyNotice");
            return (Criteria) this;
        }

        public Criteria andCompanyNoticeNotBetween(String value1, String value2) {
            addCriterion("company_notice not between", value1, value2, "companyNotice");
            return (Criteria) this;
        }
        
			
        public Criteria andContactInfoIsNull() {
            addCriterion("contact_info is null");
            return (Criteria) this;
        }

        public Criteria andContactInfoIsNotNull() {
            addCriterion("contact_info is not null");
            return (Criteria) this;
        }

        public Criteria andContactInfoEqualTo(String value) {
            addCriterion("contact_info =", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotEqualTo(String value) {
            addCriterion("contact_info <>", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoGreaterThan(String value) {
            addCriterion("contact_info >", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoGreaterThanOrEqualTo(String value) {
            addCriterion("contact_info >=", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLessThan(String value) {
            addCriterion("contact_info <", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLessThanOrEqualTo(String value) {
            addCriterion("contact_info <=", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLike(String value) {
            addCriterion("contact_info like", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotLike(String value) {
            addCriterion("contact_info not like", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoIn(List<String> values) {
            addCriterion("contact_info in", values, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotIn(List<String> values) {
            addCriterion("contact_info not in", values, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoBetween(String value1, String value2) {
            addCriterion("contact_info between", value1, value2, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotBetween(String value1, String value2) {
            addCriterion("contact_info not between", value1, value2, "contactInfo");
            return (Criteria) this;
        }
        
			
        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }
        
			
        public Criteria andWebDescIsNull() {
            addCriterion("web_desc is null");
            return (Criteria) this;
        }

        public Criteria andWebDescIsNotNull() {
            addCriterion("web_desc is not null");
            return (Criteria) this;
        }

        public Criteria andWebDescEqualTo(String value) {
            addCriterion("web_desc =", value, "webDesc");
            return (Criteria) this;
        }

        public Criteria andWebDescNotEqualTo(String value) {
            addCriterion("web_desc <>", value, "webDesc");
            return (Criteria) this;
        }

        public Criteria andWebDescGreaterThan(String value) {
            addCriterion("web_desc >", value, "webDesc");
            return (Criteria) this;
        }

        public Criteria andWebDescGreaterThanOrEqualTo(String value) {
            addCriterion("web_desc >=", value, "webDesc");
            return (Criteria) this;
        }

        public Criteria andWebDescLessThan(String value) {
            addCriterion("web_desc <", value, "webDesc");
            return (Criteria) this;
        }

        public Criteria andWebDescLessThanOrEqualTo(String value) {
            addCriterion("web_desc <=", value, "webDesc");
            return (Criteria) this;
        }

        public Criteria andWebDescLike(String value) {
            addCriterion("web_desc like", value, "webDesc");
            return (Criteria) this;
        }

        public Criteria andWebDescNotLike(String value) {
            addCriterion("web_desc not like", value, "webDesc");
            return (Criteria) this;
        }

        public Criteria andWebDescIn(List<String> values) {
            addCriterion("web_desc in", values, "webDesc");
            return (Criteria) this;
        }

        public Criteria andWebDescNotIn(List<String> values) {
            addCriterion("web_desc not in", values, "webDesc");
            return (Criteria) this;
        }

        public Criteria andWebDescBetween(String value1, String value2) {
            addCriterion("web_desc between", value1, value2, "webDesc");
            return (Criteria) this;
        }

        public Criteria andWebDescNotBetween(String value1, String value2) {
            addCriterion("web_desc not between", value1, value2, "webDesc");
            return (Criteria) this;
        }
        
			
        public Criteria andCpInfoIsNull() {
            addCriterion("cp_info is null");
            return (Criteria) this;
        }

        public Criteria andCpInfoIsNotNull() {
            addCriterion("cp_info is not null");
            return (Criteria) this;
        }

        public Criteria andCpInfoEqualTo(String value) {
            addCriterion("cp_info =", value, "cpInfo");
            return (Criteria) this;
        }

        public Criteria andCpInfoNotEqualTo(String value) {
            addCriterion("cp_info <>", value, "cpInfo");
            return (Criteria) this;
        }

        public Criteria andCpInfoGreaterThan(String value) {
            addCriterion("cp_info >", value, "cpInfo");
            return (Criteria) this;
        }

        public Criteria andCpInfoGreaterThanOrEqualTo(String value) {
            addCriterion("cp_info >=", value, "cpInfo");
            return (Criteria) this;
        }

        public Criteria andCpInfoLessThan(String value) {
            addCriterion("cp_info <", value, "cpInfo");
            return (Criteria) this;
        }

        public Criteria andCpInfoLessThanOrEqualTo(String value) {
            addCriterion("cp_info <=", value, "cpInfo");
            return (Criteria) this;
        }

        public Criteria andCpInfoLike(String value) {
            addCriterion("cp_info like", value, "cpInfo");
            return (Criteria) this;
        }

        public Criteria andCpInfoNotLike(String value) {
            addCriterion("cp_info not like", value, "cpInfo");
            return (Criteria) this;
        }

        public Criteria andCpInfoIn(List<String> values) {
            addCriterion("cp_info in", values, "cpInfo");
            return (Criteria) this;
        }

        public Criteria andCpInfoNotIn(List<String> values) {
            addCriterion("cp_info not in", values, "cpInfo");
            return (Criteria) this;
        }

        public Criteria andCpInfoBetween(String value1, String value2) {
            addCriterion("cp_info between", value1, value2, "cpInfo");
            return (Criteria) this;
        }

        public Criteria andCpInfoNotBetween(String value1, String value2) {
            addCriterion("cp_info not between", value1, value2, "cpInfo");
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