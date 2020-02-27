package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  MerchantMillExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:38
 */
public class MerchantMillExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantMillExample() {
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
        
			
        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }
        
			
        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
        
			
        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }
        
			
        public Criteria andTelPhoneIsNull() {
            addCriterion("tel_phone is null");
            return (Criteria) this;
        }

        public Criteria andTelPhoneIsNotNull() {
            addCriterion("tel_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTelPhoneEqualTo(String value) {
            addCriterion("tel_phone =", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotEqualTo(String value) {
            addCriterion("tel_phone <>", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneGreaterThan(String value) {
            addCriterion("tel_phone >", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("tel_phone >=", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLessThan(String value) {
            addCriterion("tel_phone <", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLessThanOrEqualTo(String value) {
            addCriterion("tel_phone <=", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLike(String value) {
            addCriterion("tel_phone like", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotLike(String value) {
            addCriterion("tel_phone not like", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneIn(List<String> values) {
            addCriterion("tel_phone in", values, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotIn(List<String> values) {
            addCriterion("tel_phone not in", values, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneBetween(String value1, String value2) {
            addCriterion("tel_phone between", value1, value2, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotBetween(String value1, String value2) {
            addCriterion("tel_phone not between", value1, value2, "telPhone");
            return (Criteria) this;
        }
        
			
        public Criteria andBisQuaPicIsNull() {
            addCriterion("bis_qua_pic is null");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicIsNotNull() {
            addCriterion("bis_qua_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicEqualTo(String value) {
            addCriterion("bis_qua_pic =", value, "bisQuaPic");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicNotEqualTo(String value) {
            addCriterion("bis_qua_pic <>", value, "bisQuaPic");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicGreaterThan(String value) {
            addCriterion("bis_qua_pic >", value, "bisQuaPic");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicGreaterThanOrEqualTo(String value) {
            addCriterion("bis_qua_pic >=", value, "bisQuaPic");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicLessThan(String value) {
            addCriterion("bis_qua_pic <", value, "bisQuaPic");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicLessThanOrEqualTo(String value) {
            addCriterion("bis_qua_pic <=", value, "bisQuaPic");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicLike(String value) {
            addCriterion("bis_qua_pic like", value, "bisQuaPic");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicNotLike(String value) {
            addCriterion("bis_qua_pic not like", value, "bisQuaPic");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicIn(List<String> values) {
            addCriterion("bis_qua_pic in", values, "bisQuaPic");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicNotIn(List<String> values) {
            addCriterion("bis_qua_pic not in", values, "bisQuaPic");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicBetween(String value1, String value2) {
            addCriterion("bis_qua_pic between", value1, value2, "bisQuaPic");
            return (Criteria) this;
        }

        public Criteria andBisQuaPicNotBetween(String value1, String value2) {
            addCriterion("bis_qua_pic not between", value1, value2, "bisQuaPic");
            return (Criteria) this;
        }
        
			
        public Criteria andRemarkPicIsNull() {
            addCriterion("remark_pic is null");
            return (Criteria) this;
        }

        public Criteria andRemarkPicIsNotNull() {
            addCriterion("remark_pic is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkPicEqualTo(String value) {
            addCriterion("remark_pic =", value, "remarkPic");
            return (Criteria) this;
        }

        public Criteria andRemarkPicNotEqualTo(String value) {
            addCriterion("remark_pic <>", value, "remarkPic");
            return (Criteria) this;
        }

        public Criteria andRemarkPicGreaterThan(String value) {
            addCriterion("remark_pic >", value, "remarkPic");
            return (Criteria) this;
        }

        public Criteria andRemarkPicGreaterThanOrEqualTo(String value) {
            addCriterion("remark_pic >=", value, "remarkPic");
            return (Criteria) this;
        }

        public Criteria andRemarkPicLessThan(String value) {
            addCriterion("remark_pic <", value, "remarkPic");
            return (Criteria) this;
        }

        public Criteria andRemarkPicLessThanOrEqualTo(String value) {
            addCriterion("remark_pic <=", value, "remarkPic");
            return (Criteria) this;
        }

        public Criteria andRemarkPicLike(String value) {
            addCriterion("remark_pic like", value, "remarkPic");
            return (Criteria) this;
        }

        public Criteria andRemarkPicNotLike(String value) {
            addCriterion("remark_pic not like", value, "remarkPic");
            return (Criteria) this;
        }

        public Criteria andRemarkPicIn(List<String> values) {
            addCriterion("remark_pic in", values, "remarkPic");
            return (Criteria) this;
        }

        public Criteria andRemarkPicNotIn(List<String> values) {
            addCriterion("remark_pic not in", values, "remarkPic");
            return (Criteria) this;
        }

        public Criteria andRemarkPicBetween(String value1, String value2) {
            addCriterion("remark_pic between", value1, value2, "remarkPic");
            return (Criteria) this;
        }

        public Criteria andRemarkPicNotBetween(String value1, String value2) {
            addCriterion("remark_pic not between", value1, value2, "remarkPic");
            return (Criteria) this;
        }
        
			
        public Criteria andBackPicIsNull() {
            addCriterion("back_pic is null");
            return (Criteria) this;
        }

        public Criteria andBackPicIsNotNull() {
            addCriterion("back_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBackPicEqualTo(String value) {
            addCriterion("back_pic =", value, "backPic");
            return (Criteria) this;
        }

        public Criteria andBackPicNotEqualTo(String value) {
            addCriterion("back_pic <>", value, "backPic");
            return (Criteria) this;
        }

        public Criteria andBackPicGreaterThan(String value) {
            addCriterion("back_pic >", value, "backPic");
            return (Criteria) this;
        }

        public Criteria andBackPicGreaterThanOrEqualTo(String value) {
            addCriterion("back_pic >=", value, "backPic");
            return (Criteria) this;
        }

        public Criteria andBackPicLessThan(String value) {
            addCriterion("back_pic <", value, "backPic");
            return (Criteria) this;
        }

        public Criteria andBackPicLessThanOrEqualTo(String value) {
            addCriterion("back_pic <=", value, "backPic");
            return (Criteria) this;
        }

        public Criteria andBackPicLike(String value) {
            addCriterion("back_pic like", value, "backPic");
            return (Criteria) this;
        }

        public Criteria andBackPicNotLike(String value) {
            addCriterion("back_pic not like", value, "backPic");
            return (Criteria) this;
        }

        public Criteria andBackPicIn(List<String> values) {
            addCriterion("back_pic in", values, "backPic");
            return (Criteria) this;
        }

        public Criteria andBackPicNotIn(List<String> values) {
            addCriterion("back_pic not in", values, "backPic");
            return (Criteria) this;
        }

        public Criteria andBackPicBetween(String value1, String value2) {
            addCriterion("back_pic between", value1, value2, "backPic");
            return (Criteria) this;
        }

        public Criteria andBackPicNotBetween(String value1, String value2) {
            addCriterion("back_pic not between", value1, value2, "backPic");
            return (Criteria) this;
        }
        
			
        public Criteria andHeadPicIsNull() {
            addCriterion("head_pic is null");
            return (Criteria) this;
        }

        public Criteria andHeadPicIsNotNull() {
            addCriterion("head_pic is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPicEqualTo(String value) {
            addCriterion("head_pic =", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotEqualTo(String value) {
            addCriterion("head_pic <>", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThan(String value) {
            addCriterion("head_pic >", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("head_pic >=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLessThan(String value) {
            addCriterion("head_pic <", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLessThanOrEqualTo(String value) {
            addCriterion("head_pic <=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLike(String value) {
            addCriterion("head_pic like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotLike(String value) {
            addCriterion("head_pic not like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicIn(List<String> values) {
            addCriterion("head_pic in", values, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotIn(List<String> values) {
            addCriterion("head_pic not in", values, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicBetween(String value1, String value2) {
            addCriterion("head_pic between", value1, value2, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotBetween(String value1, String value2) {
            addCriterion("head_pic not between", value1, value2, "headPic");
            return (Criteria) this;
        }
        
			
        public Criteria andTTmIsNull() {
            addCriterion("t_tm is null");
            return (Criteria) this;
        }

        public Criteria andTTmIsNotNull() {
            addCriterion("t_tm is not null");
            return (Criteria) this;
        }

        public Criteria andTTmEqualTo(Date value) {
            addCriterion("t_tm =", value, "tTm");
            return (Criteria) this;
        }

        public Criteria andTTmNotEqualTo(Date value) {
            addCriterion("t_tm <>", value, "tTm");
            return (Criteria) this;
        }

        public Criteria andTTmGreaterThan(Date value) {
            addCriterion("t_tm >", value, "tTm");
            return (Criteria) this;
        }

        public Criteria andTTmGreaterThanOrEqualTo(Date value) {
            addCriterion("t_tm >=", value, "tTm");
            return (Criteria) this;
        }

        public Criteria andTTmLessThan(Date value) {
            addCriterion("t_tm <", value, "tTm");
            return (Criteria) this;
        }

        public Criteria andTTmLessThanOrEqualTo(Date value) {
            addCriterion("t_tm <=", value, "tTm");
            return (Criteria) this;
        }

        public Criteria andTTmLike(Date value) {
            addCriterion("t_tm like", value, "tTm");
            return (Criteria) this;
        }

        public Criteria andTTmNotLike(Date value) {
            addCriterion("t_tm not like", value, "tTm");
            return (Criteria) this;
        }

        public Criteria andTTmIn(List<Date> values) {
            addCriterion("t_tm in", values, "tTm");
            return (Criteria) this;
        }

        public Criteria andTTmNotIn(List<Date> values) {
            addCriterion("t_tm not in", values, "tTm");
            return (Criteria) this;
        }

        public Criteria andTTmBetween(Date value1, Date value2) {
            addCriterion("t_tm between", value1, value2, "tTm");
            return (Criteria) this;
        }

        public Criteria andTTmNotBetween(Date value1, Date value2) {
            addCriterion("t_tm not between", value1, value2, "tTm");
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