package com.crazyelemon.entity;

import java.util.ArrayList;
import java.util.List;

public class ReceiveAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiveAddressExample() {
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIsNull() {
            addCriterion("address_province is null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIsNotNull() {
            addCriterion("address_province is not null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceEqualTo(String value) {
            addCriterion("address_province =", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotEqualTo(String value) {
            addCriterion("address_province <>", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceGreaterThan(String value) {
            addCriterion("address_province >", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("address_province >=", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLessThan(String value) {
            addCriterion("address_province <", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("address_province <=", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLike(String value) {
            addCriterion("address_province like", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotLike(String value) {
            addCriterion("address_province not like", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIn(List<String> values) {
            addCriterion("address_province in", values, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotIn(List<String> values) {
            addCriterion("address_province not in", values, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceBetween(String value1, String value2) {
            addCriterion("address_province between", value1, value2, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("address_province not between", value1, value2, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNull() {
            addCriterion("address_city is null");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNotNull() {
            addCriterion("address_city is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCityEqualTo(String value) {
            addCriterion("address_city =", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotEqualTo(String value) {
            addCriterion("address_city <>", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThan(String value) {
            addCriterion("address_city >", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("address_city >=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThan(String value) {
            addCriterion("address_city <", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThanOrEqualTo(String value) {
            addCriterion("address_city <=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLike(String value) {
            addCriterion("address_city like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotLike(String value) {
            addCriterion("address_city not like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityIn(List<String> values) {
            addCriterion("address_city in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotIn(List<String> values) {
            addCriterion("address_city not in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityBetween(String value1, String value2) {
            addCriterion("address_city between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotBetween(String value1, String value2) {
            addCriterion("address_city not between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIsNull() {
            addCriterion("address_area is null");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIsNotNull() {
            addCriterion("address_area is not null");
            return (Criteria) this;
        }

        public Criteria andAddressAreaEqualTo(String value) {
            addCriterion("address_area =", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaNotEqualTo(String value) {
            addCriterion("address_area <>", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaGreaterThan(String value) {
            addCriterion("address_area >", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaGreaterThanOrEqualTo(String value) {
            addCriterion("address_area >=", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaLessThan(String value) {
            addCriterion("address_area <", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaLessThanOrEqualTo(String value) {
            addCriterion("address_area <=", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaLike(String value) {
            addCriterion("address_area like", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaNotLike(String value) {
            addCriterion("address_area not like", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIn(List<String> values) {
            addCriterion("address_area in", values, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaNotIn(List<String> values) {
            addCriterion("address_area not in", values, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaBetween(String value1, String value2) {
            addCriterion("address_area between", value1, value2, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaNotBetween(String value1, String value2) {
            addCriterion("address_area not between", value1, value2, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIsNull() {
            addCriterion("address_street is null");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIsNotNull() {
            addCriterion("address_street is not null");
            return (Criteria) this;
        }

        public Criteria andAddressStreetEqualTo(String value) {
            addCriterion("address_street =", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotEqualTo(String value) {
            addCriterion("address_street <>", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetGreaterThan(String value) {
            addCriterion("address_street >", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetGreaterThanOrEqualTo(String value) {
            addCriterion("address_street >=", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetLessThan(String value) {
            addCriterion("address_street <", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetLessThanOrEqualTo(String value) {
            addCriterion("address_street <=", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetLike(String value) {
            addCriterion("address_street like", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotLike(String value) {
            addCriterion("address_street not like", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIn(List<String> values) {
            addCriterion("address_street in", values, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotIn(List<String> values) {
            addCriterion("address_street not in", values, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetBetween(String value1, String value2) {
            addCriterion("address_street between", value1, value2, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotBetween(String value1, String value2) {
            addCriterion("address_street not between", value1, value2, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNull() {
            addCriterion("address_detail is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNotNull() {
            addCriterion("address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailEqualTo(String value) {
            addCriterion("address_detail =", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotEqualTo(String value) {
            addCriterion("address_detail <>", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThan(String value) {
            addCriterion("address_detail >", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("address_detail >=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThan(String value) {
            addCriterion("address_detail <", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("address_detail <=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLike(String value) {
            addCriterion("address_detail like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotLike(String value) {
            addCriterion("address_detail not like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIn(List<String> values) {
            addCriterion("address_detail in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotIn(List<String> values) {
            addCriterion("address_detail not in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailBetween(String value1, String value2) {
            addCriterion("address_detail between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotBetween(String value1, String value2) {
            addCriterion("address_detail not between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeIsNull() {
            addCriterion("address_post_code is null");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeIsNotNull() {
            addCriterion("address_post_code is not null");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeEqualTo(Integer value) {
            addCriterion("address_post_code =", value, "addressPostCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeNotEqualTo(Integer value) {
            addCriterion("address_post_code <>", value, "addressPostCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeGreaterThan(Integer value) {
            addCriterion("address_post_code >", value, "addressPostCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_post_code >=", value, "addressPostCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeLessThan(Integer value) {
            addCriterion("address_post_code <", value, "addressPostCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeLessThanOrEqualTo(Integer value) {
            addCriterion("address_post_code <=", value, "addressPostCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeIn(List<Integer> values) {
            addCriterion("address_post_code in", values, "addressPostCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeNotIn(List<Integer> values) {
            addCriterion("address_post_code not in", values, "addressPostCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeBetween(Integer value1, Integer value2) {
            addCriterion("address_post_code between", value1, value2, "addressPostCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("address_post_code not between", value1, value2, "addressPostCode");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameIsNull() {
            addCriterion("address_recipient_name is null");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameIsNotNull() {
            addCriterion("address_recipient_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameEqualTo(String value) {
            addCriterion("address_recipient_name =", value, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameNotEqualTo(String value) {
            addCriterion("address_recipient_name <>", value, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameGreaterThan(String value) {
            addCriterion("address_recipient_name >", value, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameGreaterThanOrEqualTo(String value) {
            addCriterion("address_recipient_name >=", value, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameLessThan(String value) {
            addCriterion("address_recipient_name <", value, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameLessThanOrEqualTo(String value) {
            addCriterion("address_recipient_name <=", value, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameLike(String value) {
            addCriterion("address_recipient_name like", value, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameNotLike(String value) {
            addCriterion("address_recipient_name not like", value, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameIn(List<String> values) {
            addCriterion("address_recipient_name in", values, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameNotIn(List<String> values) {
            addCriterion("address_recipient_name not in", values, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameBetween(String value1, String value2) {
            addCriterion("address_recipient_name between", value1, value2, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientNameNotBetween(String value1, String value2) {
            addCriterion("address_recipient_name not between", value1, value2, "addressRecipientName");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoIsNull() {
            addCriterion("address_recipient_telno is null");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoIsNotNull() {
            addCriterion("address_recipient_telno is not null");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoEqualTo(Long value) {
            addCriterion("address_recipient_telno =", value, "addressRecipientTelno");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoNotEqualTo(Long value) {
            addCriterion("address_recipient_telno <>", value, "addressRecipientTelno");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoGreaterThan(Long value) {
            addCriterion("address_recipient_telno >", value, "addressRecipientTelno");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoGreaterThanOrEqualTo(Long value) {
            addCriterion("address_recipient_telno >=", value, "addressRecipientTelno");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoLessThan(Long value) {
            addCriterion("address_recipient_telno <", value, "addressRecipientTelno");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoLessThanOrEqualTo(Long value) {
            addCriterion("address_recipient_telno <=", value, "addressRecipientTelno");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoIn(List<Long> values) {
            addCriterion("address_recipient_telno in", values, "addressRecipientTelno");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoNotIn(List<Long> values) {
            addCriterion("address_recipient_telno not in", values, "addressRecipientTelno");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoBetween(Long value1, Long value2) {
            addCriterion("address_recipient_telno between", value1, value2, "addressRecipientTelno");
            return (Criteria) this;
        }

        public Criteria andAddressRecipientTelnoNotBetween(Long value1, Long value2) {
            addCriterion("address_recipient_telno not between", value1, value2, "addressRecipientTelno");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressIsNull() {
            addCriterion("is_default_address is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressIsNotNull() {
            addCriterion("is_default_address is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressEqualTo(Integer value) {
            addCriterion("is_default_address =", value, "isDefaultAddress");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressNotEqualTo(Integer value) {
            addCriterion("is_default_address <>", value, "isDefaultAddress");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressGreaterThan(Integer value) {
            addCriterion("is_default_address >", value, "isDefaultAddress");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_default_address >=", value, "isDefaultAddress");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressLessThan(Integer value) {
            addCriterion("is_default_address <", value, "isDefaultAddress");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressLessThanOrEqualTo(Integer value) {
            addCriterion("is_default_address <=", value, "isDefaultAddress");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressIn(List<Integer> values) {
            addCriterion("is_default_address in", values, "isDefaultAddress");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressNotIn(List<Integer> values) {
            addCriterion("is_default_address not in", values, "isDefaultAddress");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressBetween(Integer value1, Integer value2) {
            addCriterion("is_default_address between", value1, value2, "isDefaultAddress");
            return (Criteria) this;
        }

        public Criteria andIsDefaultAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("is_default_address not between", value1, value2, "isDefaultAddress");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }
    }

    /**
     */
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