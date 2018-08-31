package com.crazyelemon.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdIsNull() {
            addCriterion("shoes_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdIsNotNull() {
            addCriterion("shoes_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdEqualTo(Integer value) {
            addCriterion("shoes_detail_id =", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdNotEqualTo(Integer value) {
            addCriterion("shoes_detail_id <>", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdGreaterThan(Integer value) {
            addCriterion("shoes_detail_id >", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoes_detail_id >=", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdLessThan(Integer value) {
            addCriterion("shoes_detail_id <", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("shoes_detail_id <=", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdIn(List<Integer> values) {
            addCriterion("shoes_detail_id in", values, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdNotIn(List<Integer> values) {
            addCriterion("shoes_detail_id not in", values, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("shoes_detail_id between", value1, value2, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shoes_detail_id not between", value1, value2, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andQualityIsNull() {
            addCriterion("quality is null");
            return (Criteria) this;
        }

        public Criteria andQualityIsNotNull() {
            addCriterion("quality is not null");
            return (Criteria) this;
        }

        public Criteria andQualityEqualTo(Integer value) {
            addCriterion("quality =", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotEqualTo(Integer value) {
            addCriterion("quality <>", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThan(Integer value) {
            addCriterion("quality >", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality >=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThan(Integer value) {
            addCriterion("quality <", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThanOrEqualTo(Integer value) {
            addCriterion("quality <=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityIn(List<Integer> values) {
            addCriterion("quality in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotIn(List<Integer> values) {
            addCriterion("quality not in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityBetween(Integer value1, Integer value2) {
            addCriterion("quality between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("quality not between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorIsNull() {
            addCriterion("order_shoes_color is null");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorIsNotNull() {
            addCriterion("order_shoes_color is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorEqualTo(String value) {
            addCriterion("order_shoes_color =", value, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorNotEqualTo(String value) {
            addCriterion("order_shoes_color <>", value, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorGreaterThan(String value) {
            addCriterion("order_shoes_color >", value, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorGreaterThanOrEqualTo(String value) {
            addCriterion("order_shoes_color >=", value, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorLessThan(String value) {
            addCriterion("order_shoes_color <", value, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorLessThanOrEqualTo(String value) {
            addCriterion("order_shoes_color <=", value, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorLike(String value) {
            addCriterion("order_shoes_color like", value, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorNotLike(String value) {
            addCriterion("order_shoes_color not like", value, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorIn(List<String> values) {
            addCriterion("order_shoes_color in", values, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorNotIn(List<String> values) {
            addCriterion("order_shoes_color not in", values, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorBetween(String value1, String value2) {
            addCriterion("order_shoes_color between", value1, value2, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesColorNotBetween(String value1, String value2) {
            addCriterion("order_shoes_color not between", value1, value2, "orderShoesColor");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeIsNull() {
            addCriterion("order_shoes_size is null");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeIsNotNull() {
            addCriterion("order_shoes_size is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeEqualTo(String value) {
            addCriterion("order_shoes_size =", value, "orderShoesSize");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeNotEqualTo(String value) {
            addCriterion("order_shoes_size <>", value, "orderShoesSize");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeGreaterThan(String value) {
            addCriterion("order_shoes_size >", value, "orderShoesSize");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeGreaterThanOrEqualTo(String value) {
            addCriterion("order_shoes_size >=", value, "orderShoesSize");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeLessThan(String value) {
            addCriterion("order_shoes_size <", value, "orderShoesSize");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeLessThanOrEqualTo(String value) {
            addCriterion("order_shoes_size <=", value, "orderShoesSize");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeLike(String value) {
            addCriterion("order_shoes_size like", value, "orderShoesSize");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeNotLike(String value) {
            addCriterion("order_shoes_size not like", value, "orderShoesSize");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeIn(List<String> values) {
            addCriterion("order_shoes_size in", values, "orderShoesSize");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeNotIn(List<String> values) {
            addCriterion("order_shoes_size not in", values, "orderShoesSize");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeBetween(String value1, String value2) {
            addCriterion("order_shoes_size between", value1, value2, "orderShoesSize");
            return (Criteria) this;
        }

        public Criteria andOrderShoesSizeNotBetween(String value1, String value2) {
            addCriterion("order_shoes_size not between", value1, value2, "orderShoesSize");
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